package controllers;

import play.Logger;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import securesocial.core.java.SecureSocial;
import securesocial.core.java.SocialUser;
import securesocial.core.java.UserId;
import views.html.index;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import views.html.index;																																																																																																																																																																																																																																									
import views.html.estimator_welcome;

/**
 * Application controller where user detail's is captured if user is logged in succefully. 
 */
public class Start extends Controller {
    /**
     * This action only gets called if the user is logged in succefully and 
     * redirects to the start page of RankStudent.
     */
    @SecureSocial.SecuredAction
    public static Result estimator() {
    	Long accountId; 
    	
		SocialUser socialUser = (SocialUser) ctx().args.get(SecureSocial.USER_KEY);
		
		// As provider_id for Google is having 21 digits. We can't use Bigint.
		// So, we are using BigDecimal instead of Long.
 		BigDecimal pid = new BigDecimal(socialUser.id.id);
        models.Customer customer = models.Customer.findByProviderId(pid);
             
        /**
 		 * SimpleDateFormat class to convert the date into user friendly format.
 		 */
 		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 		Date date = new Date();
 		Timestamp currentTime = Timestamp.valueOf(dateFormat.format(date).toString());
         		
 		String name = socialUser.firstName + " " + socialUser.lastName;
 		
		Logger.debug("id: " + socialUser.id.id);
		Logger.debug("fullName: " + name);
 		Logger.debug("firstName: " + socialUser.firstName);
 		Logger.debug("lastName: " + socialUser.lastName);
 		Logger.debug("mail: " + socialUser.email);
 		Logger.debug("provider: " + socialUser.id.provider);
 		
 		// Prevent a NULL exception for display name as the database has NOT NULL
 		// set for the display_name column.
 		if (name == null) {
 			name = "Anonymus";
 		}
 		
 	   if (customer == null) {
        	models.Customer newCustomer =  models.Customer.register(pid, 
        												name,
        												socialUser.email, 
        												socialUser.id.provider,
        												currentTime, 
        												currentTime, 
        												currentTime);
        	
        	accountId = newCustomer.id;
        	
        	/*
        	 * Generate a cookie with the User's id (uid) and User's name (displays). This 
        	 * feels like a bad idea. I think this should be converted to some type of hash that
        	 * obfuscates the User Id (at a minimum).
        	 */
        	session("userId", Long.toString(newCustomer.id));
          	session("name", newCustomer.name);
        } else {
        	customer.lastLogin = Timestamp.valueOf(dateFormat.format(date).toString());
        	customer.save();
        	accountId = customer.id;
        	// Add values to the session cookie
        	session("userId", Long.toString(customer.id));
           	session("name", customer.name);
        }
        
 	  return ok(estimator_welcome.render(name));
    }

}