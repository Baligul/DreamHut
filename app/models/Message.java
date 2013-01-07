package models;

/**
 * Play Framework
 */
import play.db.ebean.*;
import play.data.validation.*;

/**
 * JAVA
 */
import java.util.*;
import javax.persistence.*;

/**
 * Message entity managed by Ebean.
 * Message will store the details of all the Messages.
 */
@SuppressWarnings("serial")
@Entity 
@Table(name="messages")
public class Message extends Model {

	/**
	 * Creating the ids for all the Messages automatically.
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "messages_id_seq")
	@javax.persistence.SequenceGenerator(name="messages_id_seq", sequenceName = "messages_id_seq", allocationSize = 1)
	public Long id;
	
	@Constraints.Required
    public String name;
	
	@Constraints.Required
    public String email;
	
	@Constraints.Required
    public String phone;
	
	@Constraints.Required
    public String detailedMessage;    
    
	/**
	 * Message constructor when all member values are known by the caller.
	 * 
     * @param id					Message Id.
     * @param name					Name of the customer
     * @param email					Email of the customer
     * @param phone					Phone of the customer
     * @param detailedMessage		Message by the customer
     */
    public Message(String name,
    		String email,
    		String phone,
    		String detailedMessage) {
        
    	this.name = name;
        this.email = email;
        this.phone = phone;
        this.detailedMessage = detailedMessage;             
    }
    
    /**
     * Define a Finder for Message. We use <Long,Message> to signify that Message's id (PK)
     * is a Long. 
     */
    public static Model.Finder<Long,Message> find = new Model.Finder(Long.class, Message.class);
    
    /**
     * Retrieve all Messages.
     */
    public static List<Message> findAll() {
    	return find.all();
    }

    /**
     * Retrieve a product based on its unique id.
     */
    public static Message findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
    
    /**
     * Retrieve list of Messages based on their upcCode.
     */
    public static List<Message> findByUpcCode(String upcCode) {
        return find.where().eq("upcCode", upcCode).findList();
    }
    
    /**
     * Retrieve list of Messages based on their seller.
     */
    public static List<Message>  findBySoldBy(String soldBy) {
        return find.where().eq("soldBy", soldBy).findList();
    }
    
    /**
     * Adds a product to a product table.
     */
    public static Message add(String name,
    		String email,
    		String phone,
    		String detailedMessage) {
    	
    	Message message = new Message(name, email, phone, detailedMessage);
    	message.save();
        return message;
    }
    
    /**
     * Update a product to a product table based on its id.
     */
    public static Message edit(Long id,
    		String name,
    		String email,
    		String phone,
    		String detailedMessage) {
    	
    	Message Message = find.where().eq("id", id).findUnique();
    	Message.name = name;
    	Message.email = email;
    	Message.phone = phone;
    	Message.detailedMessage = detailedMessage;
    	Message.save();
        return Message;
    }
    
    /**
     * Delete a product from a product table based on its id.
     */
    public static void delete(Long id) {
       		findById(id).delete();
    }
}

