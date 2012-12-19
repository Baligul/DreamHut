
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/*******************************************************************************
* Login. This is the login page.              								   *
*                                                                              *
*******************************************************************************/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Login. This is the login page.              								   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.2*/("""<div id="header_right">
		<p class="welcome">Welcome, Guest. Please login or <a href="#">register</a>.</p>
			<form id="form1" method="post" action="">
   				<p><label>Username
    					<input type="text" class="fields" name="textfield" />
    			   </label>
    			   <label>Password
    					<input type="text" class="fields" name="textfield2" />
    					<input type="submit" class="submit_button" name="Submit" value="login" />
    			   </label></p>
 			</form>
 	</div>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 00:08:43 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/login.scala.html
                    HASH: 568369e14bcef5748c337b96d67119560f82a8ad
                    MATRIX: 1413->303
                    LINES: 36->5
                    -- GENERATED --
                */
            