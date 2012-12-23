
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
* Sign Up. This is the sign up page.              								   *
*                                                                              *
*******************************************************************************/
object sign_up extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Sign Up. This is the sign up page.              								   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.1*/("""<form id="create_account" action="/signup" method="post">
<fieldset id="signup">
<legend>Create New Account</legend>
<ul>
<li>
<label for="first_name">First Name </label>
<input id= "first_name" type="text"
autofocus="true"
name="first_name" placeholder="'John'" >
</li>
<li>
<label for="last_name">Last Name </label>
<input id= "last_name" type="text"
name="last_name" placeholder="'Smith'" >
</li>
<li>
<label for="email">Email </label>
<input id= "email" type="email"
name="email" placeholder="user-example.com" >
</li>
<li>
<label for="password">Password</label>
<input id= "password" type="password" name="password" value=""
autocomplete="off" placeholder="8-10 characters" />
</li>
<li>
<label for="password_confirmation">Password Confirmation</label>
<input id= "password_confirmation" type="password"
name="password_confirmation" value=""
autocomplete="off" placeholder="Type your password again" />
</li>
</ul>
<center><input type="submit" value="Sign Up"></center>
</fieldset>
</form>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 23 17:59:09 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/sign_up.scala.html
                    HASH: 1478e7fd6814ae58658e043b0770979232a87d47
                    MATRIX: 1423->306
                    LINES: 36->5
                    -- GENERATED --
                */
            