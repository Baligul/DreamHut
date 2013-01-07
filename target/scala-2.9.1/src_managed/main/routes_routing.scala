// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:17c0b3e108e6a6eaa0871a8a40e6eeb33c9ffc4e
// @DATE:Mon Jan 07 04:48:00 IST 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_Application_home1 = Route("GET", PathPattern(List(StaticPart("/home"))))
                    

// @LINE:8
val controllers_Application_gallery2 = Route("GET", PathPattern(List(StaticPart("/gallery"))))
                    

// @LINE:9
val controllers_Application_projectsDone3 = Route("GET", PathPattern(List(StaticPart("/projects"))))
                    

// @LINE:10
val controllers_Application_offers4 = Route("GET", PathPattern(List(StaticPart("/offers"))))
                    

// @LINE:11
val controllers_Application_contact5 = Route("GET", PathPattern(List(StaticPart("/contact"))))
                    

// @LINE:12
val controllers_Application_map6 = Route("GET", PathPattern(List(StaticPart("/map"))))
                    

// @LINE:13
val controllers_Application_addMessage7 = Route("POST", PathPattern(List(StaticPart("/message"))))
                    

// @LINE:17
val controllers_Start_estimator8 = Route("GET", PathPattern(List(StaticPart("/start"))))
                    

// @LINE:18
val controllers_Application_estimatorContent9 = Route("GET", PathPattern(List(StaticPart("/estimator/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:19
val controllers_Start_estimator10 = Route("POST", PathPattern(List(StaticPart("/start"))))
                    

// @LINE:22
val securesocial_controllers_LoginPage_login11 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:23
val securesocial_controllers_LoginPage_logout12 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:26
val securesocial_controllers_Registration_startSignUp13 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:27
val securesocial_controllers_Registration_handleStartSignUp14 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:28
val securesocial_controllers_Registration_signUp15 = Route("GET", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:29
val securesocial_controllers_Registration_handleSignUp16 = Route("POST", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:30
val securesocial_controllers_Registration_startResetPassword17 = Route("GET", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:31
val securesocial_controllers_Registration_handleStartResetPassword18 = Route("POST", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:32
val securesocial_controllers_Registration_resetPassword19 = Route("GET", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:33
val securesocial_controllers_Registration_handleResetPassword20 = Route("POST", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:34
val securesocial_controllers_PasswordChange_page21 = Route("GET", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:35
val securesocial_controllers_PasswordChange_handlePasswordChange22 = Route("POST", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:38
val securesocial_controllers_ProviderController_authenticate23 = Route("GET", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:39
val securesocial_controllers_ProviderController_authenticateByPost24 = Route("POST", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:42
val controllers_Assets_at25 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/home""","""controllers.Application.home()"""),("""GET""","""/gallery""","""controllers.Application.gallery()"""),("""GET""","""/projects""","""controllers.Application.projectsDone()"""),("""GET""","""/offers""","""controllers.Application.offers()"""),("""GET""","""/contact""","""controllers.Application.contact()"""),("""GET""","""/map""","""controllers.Application.map()"""),("""POST""","""/message""","""controllers.Application.addMessage()"""),("""GET""","""/start""","""controllers.Start.estimator()"""),("""GET""","""/estimator/$id<[^/]+>""","""controllers.Application.estimatorContent(id:String)"""),("""POST""","""/start""","""controllers.Start.estimator()"""),("""GET""","""/login""","""securesocial.controllers.LoginPage.login"""),("""GET""","""/logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""","""/signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""","""/signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""","""/reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""","""/reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""","""/password""","""securesocial.controllers.PasswordChange.page"""),("""POST""","""/password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_Application_home1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.home(), HandlerDef(this, "controllers.Application", "home", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_gallery2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_projectsDone3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.projectsDone(), HandlerDef(this, "controllers.Application", "projectsDone", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_offers4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.offers(), HandlerDef(this, "controllers.Application", "offers", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_contact5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_map6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.map(), HandlerDef(this, "controllers.Application", "map", Nil))
   }
}
                    

// @LINE:13
case controllers_Application_addMessage7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.addMessage(), HandlerDef(this, "controllers.Application", "addMessage", Nil))
   }
}
                    

// @LINE:17
case controllers_Start_estimator8(params) => {
   call { 
        invokeHandler(_root_.controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Nil))
   }
}
                    

// @LINE:18
case controllers_Application_estimatorContent9(params) => {
   call(params.fromPath[String]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.estimatorContent(id), HandlerDef(this, "controllers.Application", "estimatorContent", Seq(classOf[String])))
   }
}
                    

// @LINE:19
case controllers_Start_estimator10(params) => {
   call { 
        invokeHandler(_root_.controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Nil))
   }
}
                    

// @LINE:22
case securesocial_controllers_LoginPage_login11(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil))
   }
}
                    

// @LINE:23
case securesocial_controllers_LoginPage_logout12(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil))
   }
}
                    

// @LINE:26
case securesocial_controllers_Registration_startSignUp13(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil))
   }
}
                    

// @LINE:27
case securesocial_controllers_Registration_handleStartSignUp14(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil))
   }
}
                    

// @LINE:28
case securesocial_controllers_Registration_signUp15(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String])))
   }
}
                    

// @LINE:29
case securesocial_controllers_Registration_handleSignUp16(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String])))
   }
}
                    

// @LINE:30
case securesocial_controllers_Registration_startResetPassword17(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil))
   }
}
                    

// @LINE:31
case securesocial_controllers_Registration_handleStartResetPassword18(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil))
   }
}
                    

// @LINE:32
case securesocial_controllers_Registration_resetPassword19(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:33
case securesocial_controllers_Registration_handleResetPassword20(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:34
case securesocial_controllers_PasswordChange_page21(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil))
   }
}
                    

// @LINE:35
case securesocial_controllers_PasswordChange_handlePasswordChange22(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil))
   }
}
                    

// @LINE:38
case securesocial_controllers_ProviderController_authenticate23(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String])))
   }
}
                    

// @LINE:39
case securesocial_controllers_ProviderController_authenticateByPost24(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String])))
   }
}
                    

// @LINE:42
case controllers_Assets_at25(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                