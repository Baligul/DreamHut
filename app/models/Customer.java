package models;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

/**
 * Customer entity managed by Ebean.
 */
@Entity 
@Table(name="customer")
public class Customer extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_id_seq")
	@javax.persistence.SequenceGenerator(name="customer_id_seq", sequenceName = "customer_id_seq", allocationSize = 1)
    public Long id;
	
	@Constraints.Required
	public BigDecimal pid;
		
    @Constraints.Required
    public String name;
	
    @Constraints.Required
    public String email;
    
    @Constraints.Required
    @Formats.NonEmpty
    public String provider;

    @Constraints.Required
    public Timestamp lastLogin;
    
    @Constraints.Required
    public Timestamp updatedOn;
    
    @Constraints.Required
    public Timestamp createdOn;
    
    
    /**
     * @param pid
     * @param name
     * @param email
     * @param provider
     */
    public Customer(BigDecimal 	pid, 
    			String 		name, 
    			String 		email, 
    			String 		provider, 
    			Timestamp 	lastLogin, 
    			Timestamp 	updatedOn, 
    			Timestamp 	createdOn) {
        
    	this.pid = pid;
        this.name = name;
        this.email = email;
        this.provider = provider;
        this.lastLogin = lastLogin;
        this.updatedOn = updatedOn;
        this.createdOn = createdOn;
    }
    
    /**
     * Define a Finder for Customer. We use <Long,Customer> to signify that User's id (PK)
     * is a Long. 
     */
    public static Model.Finder<Long,Customer> find = new Model.Finder(Long.class, Customer.class);
    
    /**
     * Retrieve all Customers.
     */
    public static List<Customer> findAll() {
        return find.all();
    }

    /**
     * Retrieve a Customer based on their id.
     */
    public static Customer findById(Long id) {
        return find.where().eq("id", id).findUnique();
    }
    
    /**
     * Retrieve a Customer based on their providerId.
     */
    public static Customer findByProviderId(BigDecimal pid) {
        return find.where().eq("pid", pid).findUnique();
    }
    
    /**
     * Retrieve a Customer based on their Email.
     */
    public static Customer findByEmail(String email) {
        return find.where().eq("email", email).findUnique();
    }
    
    /**
     * Retrieve customer.id based on the Customer's email.
     */
    public static Long findIdByEmail(String email) {
        Customer customer = find.select("id").where().eq("email", email).findUnique();
        return customer.id;
    }
    
    /**
     * Adds a Customer from various providers(like FB, Twitter...) to a customer table.
     */
    public static Customer register(BigDecimal	pid, 
    							String 		name, 
    							String 		email, 
    							String 		provider, 
    							Timestamp 	lastLogin, 
    							Timestamp	updatedOn,
    							Timestamp	createdOn) {
    	
    	Customer customer = new Customer(pid, name, email, provider, lastLogin, updatedOn, createdOn);
    	customer.save();
        return customer;
    }
    
    public String toString() {
        return "Customer(" + email + ","+ pid + "," + name + ","+ provider + ")";
    }

}

