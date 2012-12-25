// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:29cc22770757ad34819e3cf14ec8832ec5852db9
// @DATE:Tue Dec 25 16:46:27 IST 2012

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
val controllers_Application_about2 = Route("GET", PathPattern(List(StaticPart("/about"))))
                    

// @LINE:9
val controllers_Application_gallery3 = Route("GET", PathPattern(List(StaticPart("/gallery"))))
                    

// @LINE:10
val controllers_Application_contact4 = Route("GET", PathPattern(List(StaticPart("/contact"))))
                    

// @LINE:11
val controllers_Application_map5 = Route("GET", PathPattern(List(StaticPart("/map"))))
                    

// @LINE:12
val controllers_Application_login6 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:16
val controllers_Enter_estimator7 = Route("GET", PathPattern(List(StaticPart("/estimator"))))
                    

// @LINE:17
val controllers_Enter_estimator8 = Route("POST", PathPattern(List(StaticPart("/estimator"))))
                    

// @LINE:20
val controllers_Assets_at9 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:23
val securesocial_controllers_LoginPage_login10 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:24
val securesocial_controllers_LoginPage_logout11 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:27
val securesocial_controllers_Registration_startSignUp12 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:28
val securesocial_controllers_Registration_handleStartSignUp13 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:29
val securesocial_controllers_Registration_signUp14 = Route("GET", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:30
val securesocial_controllers_Registration_handleSignUp15 = Route("POST", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:31
val securesocial_controllers_Registration_startResetPassword16 = Route("GET", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:32
val securesocial_controllers_Registration_handleStartResetPassword17 = Route("POST", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:33
val securesocial_controllers_Registration_resetPassword18 = Route("GET", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:34
val securesocial_controllers_Registration_handleResetPassword19 = Route("POST", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:35
val securesocial_controllers_PasswordChange_page20 = Route("GET", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:36
val securesocial_controllers_PasswordChange_handlePasswordChange21 = Route("POST", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:39
val securesocial_controllers_ProviderController_authenticate22 = Route("GET", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:40
val securesocial_controllers_ProviderController_authenticateByPost23 = Route("POST", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/home""","""controllers.Application.home()"""),("""GET""","""/about""","""controllers.Application.about()"""),("""GET""","""/gallery""","""controllers.Application.gallery()"""),("""GET""","""/contact""","""controllers.Application.contact()"""),("""GET""","""/map""","""controllers.Application.map()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""GET""","""/estimator""","""controllers.Enter.estimator()"""),("""POST""","""/estimator""","""controllers.Enter.estimator()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/login""","""securesocial.controllers.LoginPage.login"""),("""GET""","""/logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""","""/signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""","""/signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""","""/reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""","""/reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""","""/password""","""securesocial.controllers.PasswordChange.page"""),("""POST""","""/password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""))
             
    
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
case controllers_Application_about2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.about(), HandlerDef(this, "controllers.Application", "about", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_gallery3(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.gallery(), HandlerDef(this, "controllers.Application", "gallery", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_contact4(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_map5(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.map(), HandlerDef(this, "controllers.Application", "map", Nil))
   }
}
                    

// @LINE:12
case controllers_Application_login6(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil))
   }
}
                    

// @LINE:16
case controllers_Enter_estimator7(params) => {
   call { 
        invokeHandler(_root_.controllers.Enter.estimator(), HandlerDef(this, "controllers.Enter", "estimator", Nil))
   }
}
                    

// @LINE:17
case controllers_Enter_estimator8(params) => {
   call { 
        invokeHandler(_root_.controllers.Enter.estimator(), HandlerDef(this, "controllers.Enter", "estimator", Nil))
   }
}
                    

// @LINE:20
case controllers_Assets_at9(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:23
case securesocial_controllers_LoginPage_login10(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil))
   }
}
                    

// @LINE:24
case securesocial_controllers_LoginPage_logout11(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil))
   }
}
                    

// @LINE:27
case securesocial_controllers_Registration_startSignUp12(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil))
   }
}
                    

// @LINE:28
case securesocial_controllers_Registration_handleStartSignUp13(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil))
   }
}
                    

// @LINE:29
case securesocial_controllers_Registration_signUp14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String])))
   }
}
                    

// @LINE:30
case securesocial_controllers_Registration_handleSignUp15(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String])))
   }
}
                    

// @LINE:31
case securesocial_controllers_Registration_startResetPassword16(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil))
   }
}
                    

// @LINE:32
case securesocial_controllers_Registration_handleStartResetPassword17(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil))
   }
}
                    

// @LINE:33
case securesocial_controllers_Registration_resetPassword18(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:34
case securesocial_controllers_Registration_handleResetPassword19(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:35
case securesocial_controllers_PasswordChange_page20(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil))
   }
}
                    

// @LINE:36
case securesocial_controllers_PasswordChange_handlePasswordChange21(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil))
   }
}
                    

// @LINE:39
case securesocial_controllers_ProviderController_authenticate22(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String])))
   }
}
                    

// @LINE:40
case securesocial_controllers_ProviderController_authenticateByPost23(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String])))
   }
}
                    
}
    
}
                