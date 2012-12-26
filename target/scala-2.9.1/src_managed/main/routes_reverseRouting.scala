// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:cd320496cb204d6f45ae7d05522adc21e1e11207
// @DATE:Thu Dec 27 03:50:06 IST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
package securesocial.controllers {

// @LINE:37
// @LINE:36
class ReverseProviderController {
    


 
// @LINE:37
def authenticateByPost(provider:String) = {
   Call("POST", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        
 
// @LINE:36
def authenticate(provider:String) = {
   Call("GET", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
class ReversePasswordChange {
    


 
// @LINE:32
def page() = {
   Call("GET", "/password")
}
                                                        
 
// @LINE:33
def handlePasswordChange() = {
   Call("POST", "/password")
}
                                                        

                      
    
}
                            

// @LINE:21
// @LINE:20
class ReverseLoginPage {
    


 
// @LINE:21
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:20
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseRegistration {
    


 
// @LINE:29
def handleStartResetPassword() = {
   Call("POST", "/reset")
}
                                                        
 
// @LINE:25
def handleStartSignUp() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:27
def handleSignUp(token:String) = {
   Call("POST", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:24
def startSignUp() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:30
def resetPassword(token:String) = {
   Call("GET", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:28
def startResetPassword() = {
   Call("GET", "/reset")
}
                                                        
 
// @LINE:26
def signUp(token:String) = {
   Call("GET", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:31
def handleResetPassword(token:String) = {
   Call("POST", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        

                      
    
}
                            
}
                    

// @LINE:40
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:17
// @LINE:16
class ReverseStart {
    


 
// @LINE:17
// @LINE:16
def estimator() = {
   () match {
// @LINE:16
case () if true => Call("GET", "/start")
                                                                
// @LINE:17
case () if true => Call("POST", "/start")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def login() = {
   Call("GET", "/login")
}
                                                        
 
// @LINE:11
def map() = {
   Call("GET", "/map")
}
                                                        
 
// @LINE:8
def about() = {
   Call("GET", "/about")
}
                                                        
 
// @LINE:9
def gallery() = {
   Call("GET", "/gallery")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:7
def home() = {
   Call("GET", "/home")
}
                                                        
 
// @LINE:10
def contact() = {
   Call("GET", "/contact")
}
                                                        

                      
    
}
                            

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
package securesocial.controllers.javascript {

// @LINE:37
// @LINE:36
class ReverseProviderController {
    


 
// @LINE:37
def authenticateByPost = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        
 
// @LINE:36
def authenticate = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:33
// @LINE:32
class ReversePasswordChange {
    


 
// @LINE:32
def page = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"/password"})
      }
   """
)
                                                        
 
// @LINE:33
def handlePasswordChange = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"/password"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:21
// @LINE:20
class ReverseLoginPage {
    


 
// @LINE:21
def logout = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:20
def login = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseRegistration {
    


 
// @LINE:29
def handleStartResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:25
def handleStartSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:27
def handleSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:24
def startSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:30
def resetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:28
def startResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:26
def signUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:31
def handleResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleResetPassword",
   """
      function(token) {
      return _wA({method:"POST", url:"/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    

// @LINE:40
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:17
// @LINE:16
class ReverseStart {
    


 
// @LINE:17
// @LINE:16
def estimator = JavascriptReverseRoute(
   "controllers.Start.estimator",
   """
      function() {
      if (true) {
      return _wA({method:"GET", url:"/start"})
      }
      if (true) {
      return _wA({method:"POST", url:"/start"})
      }
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def login = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        
 
// @LINE:11
def map = JavascriptReverseRoute(
   "controllers.Application.map",
   """
      function() {
      return _wA({method:"GET", url:"/map"})
      }
   """
)
                                                        
 
// @LINE:8
def about = JavascriptReverseRoute(
   "controllers.Application.about",
   """
      function() {
      return _wA({method:"GET", url:"/about"})
      }
   """
)
                                                        
 
// @LINE:9
def gallery = JavascriptReverseRoute(
   "controllers.Application.gallery",
   """
      function() {
      return _wA({method:"GET", url:"/gallery"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:7
def home = JavascriptReverseRoute(
   "controllers.Application.home",
   """
      function() {
      return _wA({method:"GET", url:"/home"})
      }
   """
)
                                                        
 
// @LINE:10
def contact = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"/contact"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:37
// @LINE:36
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:21
// @LINE:20
package securesocial.controllers.ref {

// @LINE:37
// @LINE:36
class ReverseProviderController {
    


 
// @LINE:37
def authenticateByPost(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]))
)
                              
 
// @LINE:36
def authenticate(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:33
// @LINE:32
class ReversePasswordChange {
    


 
// @LINE:32
def page() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq())
)
                              
 
// @LINE:33
def handlePasswordChange() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq())
)
                              

                      
    
}
                            

// @LINE:21
// @LINE:20
class ReverseLoginPage {
    


 
// @LINE:21
def logout() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq())
)
                              
 
// @LINE:20
def login() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq())
)
                              

                      
    
}
                            

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
class ReverseRegistration {
    


 
// @LINE:29
def handleStartResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq())
)
                              
 
// @LINE:25
def handleStartSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq())
)
                              
 
// @LINE:27
def handleSignUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]))
)
                              
 
// @LINE:24
def startSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq())
)
                              
 
// @LINE:30
def resetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]))
)
                              
 
// @LINE:28
def startResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq())
)
                              
 
// @LINE:26
def signUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]))
)
                              
 
// @LINE:31
def handleResetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]))
)
                              

                      
    
}
                            
}
                    

// @LINE:40
// @LINE:17
// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:17
// @LINE:16
class ReverseStart {
    


 
// @LINE:16
def estimator() = new play.api.mvc.HandlerRef(
   controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Seq())
)
                              

                      
    
}
                            

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def login() = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq())
)
                              
 
// @LINE:11
def map() = new play.api.mvc.HandlerRef(
   controllers.Application.map(), HandlerDef(this, "controllers.Application", "map", Seq())
)
                              
 
// @LINE:8
def about() = new play.api.mvc.HandlerRef(
   controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Seq())
)
                              
 
// @LINE:9
def gallery() = new play.api.mvc.HandlerRef(
   controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:7
def home() = new play.api.mvc.HandlerRef(
   controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Seq())
)
                              
 
// @LINE:10
def contact() = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq())
)
                              

                      
    
}
                            

// @LINE:40
class ReverseAssets {
    


 
// @LINE:40
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                