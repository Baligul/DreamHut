
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
* Header. This is the header for all the pages.                        		   *
*                                                                              *
*******************************************************************************/
object header extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Header. This is the header for all the pages.                        		   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.2*/("""<div id="buttons">
		<a href="/home" class="but"  title="">Home</a><div class="but_div"></div>
		<a href="/gallery"  class="but" title="">Gallery</a><div class="but_div"></div>
		<a href="/about"  class="but" title="">About&nbsp;us</a><div class="but_div"></div>
		<a href="/contact" class="but" title="">Contact&nbsp;us</a><div class="but_div"></div>
		<a href="/map" class="but">MAP</a><div class="but_div"></div>
	</div>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 23 17:59:09 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/header.scala.html
                    HASH: e580b30e61a00d9a5b0625c2ce225b0d3bc90501
                    MATRIX: 1452->322
                    LINES: 36->5
                    -- GENERATED --
                */
            