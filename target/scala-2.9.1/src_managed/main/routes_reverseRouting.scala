// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:16ca9831addbdda07a655f0d0f0db5af44652aac
// @DATE:Sat Apr 27 21:58:53 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
package securesocial.controllers {

// @LINE:42
// @LINE:41
class ReverseProviderController {
    


 
// @LINE:42
def authenticateByPost(provider:String) = {
   Call("POST", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        
 
// @LINE:41
def authenticate(provider:String) = {
   Call("GET", "/authenticate/" + implicitly[PathBindable[String]].unbind("provider", provider))
}
                                                        

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReversePasswordChange {
    


 
// @LINE:37
def page() = {
   Call("GET", "/password")
}
                                                        
 
// @LINE:38
def handlePasswordChange() = {
   Call("POST", "/password")
}
                                                        

                      
    
}
                            

// @LINE:26
// @LINE:25
class ReverseLoginPage {
    


 
// @LINE:26
def logout() = {
   Call("GET", "/logout")
}
                                                        
 
// @LINE:25
def login() = {
   Call("GET", "/login")
}
                                                        

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRegistration {
    


 
// @LINE:34
def handleStartResetPassword() = {
   Call("POST", "/reset")
}
                                                        
 
// @LINE:30
def handleStartSignUp() = {
   Call("POST", "/signup")
}
                                                        
 
// @LINE:32
def handleSignUp(token:String) = {
   Call("POST", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:29
def startSignUp() = {
   Call("GET", "/signup")
}
                                                        
 
// @LINE:35
def resetPassword(token:String) = {
   Call("GET", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:33
def startResetPassword() = {
   Call("GET", "/reset")
}
                                                        
 
// @LINE:31
def signUp(token:String) = {
   Call("GET", "/signup/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        
 
// @LINE:36
def handleResetPassword(token:String) = {
   Call("POST", "/reset/" + implicitly[PathBindable[String]].unbind("token", token))
}
                                                        

                      
    
}
                            
}
                    

// @LINE:45
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:22
// @LINE:20
class ReverseStart {
    


 
// @LINE:22
// @LINE:20
def estimator() = {
   () match {
// @LINE:20
case () if true => Call("GET", "/start")
                                                                
// @LINE:22
case () if true => Call("POST", "/start")
                                                                    
   }
}
                                                        

                      
    
}
                            

// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def tos() = {
   Call("GET", "/tos")
}
                                                        
 
// @LINE:14
def map() = {
   Call("GET", "/map")
}
                                                        
 
// @LINE:15
def addMessage() = {
   Call("POST", "/message")
}
                                                        
 
// @LINE:10
def offers() = {
   Call("GET", "/offers")
}
                                                        
 
// @LINE:8
def gallery() = {
   Call("GET", "/gallery")
}
                                                        
 
// @LINE:13
def policy() = {
   Call("GET", "/policy")
}
                                                        
 
// @LINE:21
def estimatorContent(id:String) = {
   Call("GET", "/estimator/" + implicitly[PathBindable[String]].unbind("id", id))
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
def projectsDone() = {
   Call("GET", "/projects")
}
                                                        
 
// @LINE:11
def contact() = {
   Call("GET", "/contact")
}
                                                        

                      
    
}
                            

// @LINE:45
class ReverseAssets {
    


 
// @LINE:45
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
package securesocial.controllers.javascript {

// @LINE:42
// @LINE:41
class ReverseProviderController {
    


 
// @LINE:42
def authenticateByPost = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticateByPost",
   """
      function(provider) {
      return _wA({method:"POST", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        
 
// @LINE:41
def authenticate = JavascriptReverseRoute(
   "securesocial.controllers.ProviderController.authenticate",
   """
      function(provider) {
      return _wA({method:"GET", url:"/authenticate/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", provider)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReversePasswordChange {
    


 
// @LINE:37
def page = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.page",
   """
      function() {
      return _wA({method:"GET", url:"/password"})
      }
   """
)
                                                        
 
// @LINE:38
def handlePasswordChange = JavascriptReverseRoute(
   "securesocial.controllers.PasswordChange.handlePasswordChange",
   """
      function() {
      return _wA({method:"POST", url:"/password"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:26
// @LINE:25
class ReverseLoginPage {
    


 
// @LINE:26
def logout = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.logout",
   """
      function() {
      return _wA({method:"GET", url:"/logout"})
      }
   """
)
                                                        
 
// @LINE:25
def login = JavascriptReverseRoute(
   "securesocial.controllers.LoginPage.login",
   """
      function() {
      return _wA({method:"GET", url:"/login"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRegistration {
    


 
// @LINE:34
def handleStartResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartResetPassword",
   """
      function() {
      return _wA({method:"POST", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:30
def handleStartSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleStartSignUp",
   """
      function() {
      return _wA({method:"POST", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:32
def handleSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.handleSignUp",
   """
      function(token) {
      return _wA({method:"POST", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:29
def startSignUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startSignUp",
   """
      function() {
      return _wA({method:"GET", url:"/signup"})
      }
   """
)
                                                        
 
// @LINE:35
def resetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.resetPassword",
   """
      function(token) {
      return _wA({method:"GET", url:"/reset/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:33
def startResetPassword = JavascriptReverseRoute(
   "securesocial.controllers.Registration.startResetPassword",
   """
      function() {
      return _wA({method:"GET", url:"/reset"})
      }
   """
)
                                                        
 
// @LINE:31
def signUp = JavascriptReverseRoute(
   "securesocial.controllers.Registration.signUp",
   """
      function(token) {
      return _wA({method:"GET", url:"/signup/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("token", token)})
      }
   """
)
                                                        
 
// @LINE:36
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
                    

// @LINE:45
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:22
// @LINE:20
class ReverseStart {
    


 
// @LINE:22
// @LINE:20
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
                            

// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def tos = JavascriptReverseRoute(
   "controllers.Application.tos",
   """
      function() {
      return _wA({method:"GET", url:"/tos"})
      }
   """
)
                                                        
 
// @LINE:14
def map = JavascriptReverseRoute(
   "controllers.Application.map",
   """
      function() {
      return _wA({method:"GET", url:"/map"})
      }
   """
)
                                                        
 
// @LINE:15
def addMessage = JavascriptReverseRoute(
   "controllers.Application.addMessage",
   """
      function() {
      return _wA({method:"POST", url:"/message"})
      }
   """
)
                                                        
 
// @LINE:10
def offers = JavascriptReverseRoute(
   "controllers.Application.offers",
   """
      function() {
      return _wA({method:"GET", url:"/offers"})
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
                                                        
 
// @LINE:13
def policy = JavascriptReverseRoute(
   "controllers.Application.policy",
   """
      function() {
      return _wA({method:"GET", url:"/policy"})
      }
   """
)
                                                        
 
// @LINE:21
def estimatorContent = JavascriptReverseRoute(
   "controllers.Application.estimatorContent",
   """
      function(id) {
      return _wA({method:"GET", url:"/estimator/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("id", id)})
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
def projectsDone = JavascriptReverseRoute(
   "controllers.Application.projectsDone",
   """
      function() {
      return _wA({method:"GET", url:"/projects"})
      }
   """
)
                                                        
 
// @LINE:11
def contact = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"/contact"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:45
class ReverseAssets {
    


 
// @LINE:45
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
                    


// @LINE:42
// @LINE:41
// @LINE:38
// @LINE:37
// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:26
// @LINE:25
package securesocial.controllers.ref {

// @LINE:42
// @LINE:41
class ReverseProviderController {
    


 
// @LINE:42
def authenticateByPost(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String]))
)
                              
 
// @LINE:41
def authenticate(provider:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String]))
)
                              

                      
    
}
                            

// @LINE:38
// @LINE:37
class ReversePasswordChange {
    


 
// @LINE:37
def page() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.page(), HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Seq())
)
                              
 
// @LINE:38
def handlePasswordChange() = new play.api.mvc.HandlerRef(
   securesocial.controllers.PasswordChange.handlePasswordChange(), HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Seq())
)
                              

                      
    
}
                            

// @LINE:26
// @LINE:25
class ReverseLoginPage {
    


 
// @LINE:26
def logout() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.logout(), HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Seq())
)
                              
 
// @LINE:25
def login() = new play.api.mvc.HandlerRef(
   securesocial.controllers.LoginPage.login(), HandlerDef(this, "securesocial.controllers.LoginPage", "login", Seq())
)
                              

                      
    
}
                            

// @LINE:36
// @LINE:35
// @LINE:34
// @LINE:33
// @LINE:32
// @LINE:31
// @LINE:30
// @LINE:29
class ReverseRegistration {
    


 
// @LINE:34
def handleStartResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Seq())
)
                              
 
// @LINE:30
def handleStartSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleStartSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Seq())
)
                              
 
// @LINE:32
def handleSignUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String]))
)
                              
 
// @LINE:29
def startSignUp() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startSignUp(), HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Seq())
)
                              
 
// @LINE:35
def resetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String]))
)
                              
 
// @LINE:33
def startResetPassword() = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.startResetPassword(), HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Seq())
)
                              
 
// @LINE:31
def signUp(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String]))
)
                              
 
// @LINE:36
def handleResetPassword(token:String) = new play.api.mvc.HandlerRef(
   securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String]))
)
                              

                      
    
}
                            
}
                    

// @LINE:45
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:22
// @LINE:20
class ReverseStart {
    


 
// @LINE:20
def estimator() = new play.api.mvc.HandlerRef(
   controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Seq())
)
                              

                      
    
}
                            

// @LINE:21
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    


 
// @LINE:12
def tos() = new play.api.mvc.HandlerRef(
   controllers.Application.tos(), HandlerDef(this, "controllers.Application", "tos", Seq())
)
                              
 
// @LINE:14
def map() = new play.api.mvc.HandlerRef(
   controllers.Application.map(), HandlerDef(this, "controllers.Application", "map", Seq())
)
                              
 
// @LINE:15
def addMessage() = new play.api.mvc.HandlerRef(
   controllers.Application.addMessage(), HandlerDef(this, "controllers.Application", "addMessage", Seq())
)
                              
 
// @LINE:10
def offers() = new play.api.mvc.HandlerRef(
   controllers.Application.offers(), HandlerDef(this, "controllers.Application", "offers", Seq())
)
                              
 
// @LINE:8
def gallery() = new play.api.mvc.HandlerRef(
   controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Seq())
)
                              
 
// @LINE:13
def policy() = new play.api.mvc.HandlerRef(
   controllers.Application.policy(), HandlerDef(this, "controllers.Application", "policy", Seq())
)
                              
 
// @LINE:21
def estimatorContent(id:String) = new play.api.mvc.HandlerRef(
   controllers.Application.estimatorContent(id), HandlerDef(this, "controllers.Application", "estimatorContent", Seq(classOf[String]))
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
def projectsDone() = new play.api.mvc.HandlerRef(
   controllers.Application.projectsDone(), HandlerDef(this, "controllers.Application", "projectsDone", Seq())
)
                              
 
// @LINE:11
def contact() = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq())
)
                              

                      
    
}
                            

// @LINE:45
class ReverseAssets {
    


 
// @LINE:45
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                