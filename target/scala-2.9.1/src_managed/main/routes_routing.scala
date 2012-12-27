// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:cd320496cb204d6f45ae7d05522adc21e1e11207
// @DATE:Thu Dec 27 05:41:34 IST 2012

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
val controllers_Start_estimator7 = Route("GET", PathPattern(List(StaticPart("/start"))))
                    

// @LINE:17
val controllers_Start_estimator8 = Route("POST", PathPattern(List(StaticPart("/start"))))
                    

// @LINE:20
val securesocial_controllers_LoginPage_login9 = Route("GET", PathPattern(List(StaticPart("/login"))))
                    

// @LINE:21
val securesocial_controllers_LoginPage_logout10 = Route("GET", PathPattern(List(StaticPart("/logout"))))
                    

// @LINE:24
val securesocial_controllers_Registration_startSignUp11 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:25
val securesocial_controllers_Registration_handleStartSignUp12 = Route("POST", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:26
val securesocial_controllers_Registration_signUp13 = Route("GET", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:27
val securesocial_controllers_Registration_handleSignUp14 = Route("POST", PathPattern(List(StaticPart("/signup/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:28
val securesocial_controllers_Registration_startResetPassword15 = Route("GET", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:29
val securesocial_controllers_Registration_handleStartResetPassword16 = Route("POST", PathPattern(List(StaticPart("/reset"))))
                    

// @LINE:30
val securesocial_controllers_Registration_resetPassword17 = Route("GET", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:31
val securesocial_controllers_Registration_handleResetPassword18 = Route("POST", PathPattern(List(StaticPart("/reset/"),DynamicPart("token", """[^/]+"""))))
                    

// @LINE:32
val securesocial_controllers_PasswordChange_page19 = Route("GET", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:33
val securesocial_controllers_PasswordChange_handlePasswordChange20 = Route("POST", PathPattern(List(StaticPart("/password"))))
                    

// @LINE:36
val securesocial_controllers_ProviderController_authenticate21 = Route("GET", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:37
val securesocial_controllers_ProviderController_authenticateByPost22 = Route("POST", PathPattern(List(StaticPart("/authenticate/"),DynamicPart("provider", """[^/]+"""))))
                    

// @LINE:40
val controllers_Assets_at23 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/home""","""controllers.Application.home()"""),("""GET""","""/about""","""controllers.Application.about()"""),("""GET""","""/gallery""","""controllers.Application.gallery()"""),("""GET""","""/contact""","""controllers.Application.contact()"""),("""GET""","""/map""","""controllers.Application.map()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""GET""","""/start""","""controllers.Start.estimator()"""),("""POST""","""/start""","""controllers.Start.estimator()"""),("""GET""","""/login""","""securesocial.controllers.LoginPage.login"""),("""GET""","""/logout""","""securesocial.controllers.LoginPage.logout"""),("""GET""","""/signup""","""securesocial.controllers.Registration.startSignUp"""),("""POST""","""/signup""","""securesocial.controllers.Registration.handleStartSignUp"""),("""GET""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.signUp(token:String)"""),("""POST""","""/signup/$token<[^/]+>""","""securesocial.controllers.Registration.handleSignUp(token:String)"""),("""GET""","""/reset""","""securesocial.controllers.Registration.startResetPassword"""),("""POST""","""/reset""","""securesocial.controllers.Registration.handleStartResetPassword"""),("""GET""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.resetPassword(token:String)"""),("""POST""","""/reset/$token<[^/]+>""","""securesocial.controllers.Registration.handleResetPassword(token:String)"""),("""GET""","""/password""","""securesocial.controllers.PasswordChange.page"""),("""POST""","""/password""","""securesocial.controllers.PasswordChange.handlePasswordChange"""),("""GET""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticate(provider:String)"""),("""POST""","""/authenticate/$provider<[^/]+>""","""securesocial.controllers.ProviderController.authenticateByPost(provider:String)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
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
case controllers_Start_estimator7(params) => {
   call { 
        invokeHandler(_root_.controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Nil))
   }
}
                    

// @LINE:17
case controllers_Start_estimator8(params) => {
   call { 
        invokeHandler(_root_.controllers.Start.estimator(), HandlerDef(this, "controllers.Start", "estimator", Nil))
   }
}
                    

// @LINE:20
case securesocial_controllers_LoginPage_login9(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.login, HandlerDef(this, "securesocial.controllers.LoginPage", "login", Nil))
   }
}
                    

// @LINE:21
case securesocial_controllers_LoginPage_logout10(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.LoginPage.logout, HandlerDef(this, "securesocial.controllers.LoginPage", "logout", Nil))
   }
}
                    

// @LINE:24
case securesocial_controllers_Registration_startSignUp11(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startSignUp, HandlerDef(this, "securesocial.controllers.Registration", "startSignUp", Nil))
   }
}
                    

// @LINE:25
case securesocial_controllers_Registration_handleStartSignUp12(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartSignUp, HandlerDef(this, "securesocial.controllers.Registration", "handleStartSignUp", Nil))
   }
}
                    

// @LINE:26
case securesocial_controllers_Registration_signUp13(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.signUp(token), HandlerDef(this, "securesocial.controllers.Registration", "signUp", Seq(classOf[String])))
   }
}
                    

// @LINE:27
case securesocial_controllers_Registration_handleSignUp14(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleSignUp(token), HandlerDef(this, "securesocial.controllers.Registration", "handleSignUp", Seq(classOf[String])))
   }
}
                    

// @LINE:28
case securesocial_controllers_Registration_startResetPassword15(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.startResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "startResetPassword", Nil))
   }
}
                    

// @LINE:29
case securesocial_controllers_Registration_handleStartResetPassword16(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.Registration.handleStartResetPassword, HandlerDef(this, "securesocial.controllers.Registration", "handleStartResetPassword", Nil))
   }
}
                    

// @LINE:30
case securesocial_controllers_Registration_resetPassword17(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.resetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "resetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:31
case securesocial_controllers_Registration_handleResetPassword18(params) => {
   call(params.fromPath[String]("token", None)) { (token) =>
        invokeHandler(_root_.securesocial.controllers.Registration.handleResetPassword(token), HandlerDef(this, "securesocial.controllers.Registration", "handleResetPassword", Seq(classOf[String])))
   }
}
                    

// @LINE:32
case securesocial_controllers_PasswordChange_page19(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.page, HandlerDef(this, "securesocial.controllers.PasswordChange", "page", Nil))
   }
}
                    

// @LINE:33
case securesocial_controllers_PasswordChange_handlePasswordChange20(params) => {
   call { 
        invokeHandler(_root_.securesocial.controllers.PasswordChange.handlePasswordChange, HandlerDef(this, "securesocial.controllers.PasswordChange", "handlePasswordChange", Nil))
   }
}
                    

// @LINE:36
case securesocial_controllers_ProviderController_authenticate21(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticate(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticate", Seq(classOf[String])))
   }
}
                    

// @LINE:37
case securesocial_controllers_ProviderController_authenticateByPost22(params) => {
   call(params.fromPath[String]("provider", None)) { (provider) =>
        invokeHandler(_root_.securesocial.controllers.ProviderController.authenticateByPost(provider), HandlerDef(this, "securesocial.controllers.ProviderController", "authenticateByPost", Seq(classOf[String])))
   }
}
                    

// @LINE:40
case controllers_Assets_at23(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                