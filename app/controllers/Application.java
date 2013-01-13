package controllers;

import play.*;
import play.mvc.*;
import securesocial.core.java.SecureSocial;
import java.util.Map;
import models.Message;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  return ok(index.render());
   }

  public static Result home() {
	  return ok(index.render());
   }
  
  public static Result gallery() {
	  return ok(gallery.render());
   }
  
  public static Result projectsDone() {
	  return ok(projects_done.render());
   }
  
  public static Result offers() {
	  return ok(offers.render());
   }
  
  public static Result addMessage() {
	  Map<String,String[]> messageDetails = request().body().asFormUrlEncoded();
	  String name = messageDetails.get("name")[0].toString();
	  String email = messageDetails.get("email")[0].toString();
	  String phone = messageDetails.get("phone")[0].toString();
	  String message = messageDetails.get("message")[0].toString();
	  
	  Message.add(name, email, phone, message);
	  return ok(thank_you.render(name));
   }

  
  public static Result contact() {
	  return ok(contact.render());
   }
  
  public static Result policy() {
	  return ok(policy.render());
   }
  
  public static Result tos() {
	  return ok(tos.render());
   }
  
  public static Result map() {
	  return ok(map.render());
   }
    
  @SecureSocial.SecuredAction
  public static Result estimatorContent(String id) {
		return ok(estimator.render(id));
	}
}