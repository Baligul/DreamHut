// @SOURCE:/var/svn/DreamHut/conf/routes
// @HASH:9c69bbe616c94b3955f138934e281b05231d0d3f
// @DATE:Sun Dec 23 17:59:03 IST 2012

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
                    

// @LINE:13
val controllers_Application_signup7 = Route("GET", PathPattern(List(StaticPart("/signup"))))
                    

// @LINE:17
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/home""","""controllers.Application.home()"""),("""GET""","""/about""","""controllers.Application.about()"""),("""GET""","""/gallery""","""controllers.Application.gallery()"""),("""GET""","""/contact""","""controllers.Application.contact()"""),("""GET""","""/map""","""controllers.Application.map()"""),("""GET""","""/login""","""controllers.Application.login()"""),("""GET""","""/signup""","""controllers.Application.signup()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
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
                    

// @LINE:13
case controllers_Application_signup7(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil))
   }
}
                    

// @LINE:17
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                