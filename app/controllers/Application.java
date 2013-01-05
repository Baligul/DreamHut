package controllers;

import play.*;
import play.mvc.*;
import securesocial.core.java.SecureSocial;

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
  
  public static Result contact() {
	  return ok(contact.render());
   }
  
  public static Result gallery() {
	  return ok(gallery.render());
   }
  
  @SecureSocial.SecuredAction
  public static Result estimatorContent(String id) {
		return ok(estimator.render(id));
	}
}