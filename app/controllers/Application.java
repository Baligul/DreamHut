package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {
  
  public static Result index() {
	  return ok(index.render());
   }
  
  public static Result map() {
	  return ok(map.render());
   }
  
  public static Result home() {
	  return ok(index.render());
   }
  
  public static Result about() {
	  return ok(about.render());
   }
  
  public static Result contact() {
	  return ok(contact.render());
   }
  
  public static Result gallery() {
	  return ok(gallery.render());
   }
  
  public static Result login() {
	  return ok(login.render());
   }
  
  public static Result signup() {
	  return ok(sign_up.render());
   }
  
}