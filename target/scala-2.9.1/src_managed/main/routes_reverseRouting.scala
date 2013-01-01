// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:e9f8230c9a81ab6f34fd78f9d269c49a3cc0dd6a
// @DATE:Wed Jan 02 01:19:26 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
package securesocial.controllers {

// @LINE:35
// @LINE:34
class ReverseProviderController {
    


 
// @LINE:35
def authenticateByPost(provider:String) = {
   Call("POST", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        
 
// @LINE:34
def authenticate(provider:String) = {
   Call("GET", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        

                      
    
}
                            

// @LINE:31
// @LINE:30
class ReversePasswordChange {
    


 
// @LINE:30
def page() = {
   Call("GET", "/password")
}
                                                        
 
// @LINE:31
def handlePasswordChange() = {
   Call("POST", "/password")
}
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
class ReverseLoginPage {
    


 
// @LINE:19
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:18
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseRegistration {
    


 
// @LINE:27
def handleStartResetPassword() = {
   Call("POST", "/reset")
}
                                                        
 
// @LINE:23
def handleStartSignUp() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:25
def handleSignUp(token:String) = {
   Call("POST", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:22
def startSignUp() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:28
def resetPassword(token:String) = {
   Call("GET", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:26
def startResetPassword() = {
   Call("GET", "/reset")
}
                                                        
 
// @LINE:24
def signUp(token:String) = {
   Call("GET", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:29
def handleResetPassword(token:String) = {
   Call("POST", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        

                      
    
}
                            
}
                    

// @LINE:38
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
// @LINE:14
class ReverseStart {
    


 
// @LINE:15
// @LINE:14
def estimator() = {
   () match {
// @LINE:14
case () if true => Call("GET", "/start")
                                                                
// @LINE:15
case () if true => Call("POST", "/start")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def map() = {
   Call("GET", "/map")
}
                                                        
 
// @LINE:8
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
                                                        
 
// @LINE:9
def contact() = {
   Call("GET", "/contact")
}
                                                        

                      
    
}
                            

// @LINE:38
class ReverseAssets {
    


 
// @LINE:38
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
package securesocial.controllers.javascript {

// @LINE:35
// @LINE:34
class ReverseProviderController {
    


 
// @LINE:35
def authenticateByPost = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        
 
// @LINE:34
def authenticate = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:31
// @LINE:30
class ReversePasswordChange {
    


 
// @LINE:30
def page = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"/password"})
      }
   """
)
                                                        
 
// @LINE:31
def handlePasswordChange = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"/password"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:19
// @LINE:18
class ReverseLoginPage {
    


 
// @LINE:19
def logout = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:18
def login = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseRegistration {
    


 
// @LINE:27
def handleStartResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:23
def handleStartSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:25
def handleSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:22
def startSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:28
def resetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:26
def startResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:24
def signUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:29
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
                    

// @LINE:38
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:15
// @LINE:14
class ReverseStart {
    


 
// @LINE:15
// @LINE:14
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
                            

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def map = JavascriptReverseRoute(
   "controllers.Application.map",
   """
      function() {
      return _wA({method:"GET", url:"/map"})
      }
   """
)
                                                        
 
// @LINE:8
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
                                                        
 
// @LINE:9
def contact = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"/contact"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:38
class ReverseAssets {
    


 
// @LINE:38
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
                    


// @LINE:35
// @LINE:34
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
// @LINE:19
// @LINE:18
package securesocial.controllers.ref {

// @LINE:35
// @LINE:34
class ReverseProviderController {
    


 
// @LINE:35
def authenticateByPost(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]))
)
                              
 
// @LINE:34
def authenticate(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:31
// @LINE:30
class ReversePasswordChange {
    


 
// @LINE:30
def page() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq())
)
                              
 
// @LINE:31
def handlePasswordChange() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq())
)
                              

                      
    
}
                            

// @LINE:19
// @LINE:18
class ReverseLoginPage {
    


 
// @LINE:19
def logout() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq())
)
                              
 
// @LINE:18
def login() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq())
)
                              

                      
    
}
                            

// @LINE:29
// @LINE:28
// @LINE:27
// @LINE:26
// @LINE:25
// @LINE:24
// @LINE:23
// @LINE:22
class ReverseRegistration {
    


 
// @LINE:27
def handleStartResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq())
)
                              
 
// @LINE:23
def handleStartSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq())
)
                              
 
// @LINE:25
def handleSignUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]))
)
                              
 
// @LINE:22
def startSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq())
)
                              
 
// @LINE:28
def resetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]))
)
                              
 
// @LINE:26
def startResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq())
)
                              
 
// @LINE:24
def signUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]))
)
                              
 
// @LINE:29
def handleResetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]))
)
                              

                      
    
}
                            
}
                    

// @LINE:38
// @LINE:15
// @LINE:14
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:15
// @LINE:14
class ReverseStart {
    


 
// @LINE:14
def estimator() = new play.api.mvc.HandlerRef(
   controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Seq())
)
                              

                      
    
}
                            

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:10
def map() = new play.api.mvc.HandlerRef(
   controllers.Application.map(), HandlerDef(this, "controllers.Application", "map", Seq())
)
                              
 
// @LINE:8
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
                              
 
// @LINE:9
def contact() = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq())
)
                              

                      
    
}
                            

// @LINE:38
class ReverseAssets {
    


 
// @LINE:38
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                