
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
* Footer. This is the footer to show on all the pages.              		   *
*                                                                              *
*******************************************************************************/
object footer extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Footer. This is the footer to show on all the pages.              		   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.29*/("""
<footer>
	<div id="footer" class="footer">
		<div id="footer_content">
			<div id="social_links_container">
				<ul class="social_links">
					<li class="google_plus_badge">
						<g:plusone href="http://www.dreamhutinteriors.com" annotation="inline" width="300"></g:plusone> 
					</li>
					<li class="twitter_share_link">
						<a href="https://twitter.com/intent/tweet?button_hashtag=DreamHutInteriors&text="Design your dreams" class="twitter-hashtag-button" data-url="http://www.DreamHutInteriors.com"></a>
					</li>
					<li class="fb_like_button">
						<div class="fb-like" data-href="http://www.dreamhutinteriors.com" data-send="false" data-width="300" data-show-faces="true"></div>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div id="footer_bottom" class="footer_bottom">
		<p><a href="/contact">Contact</a> | <a href="/policy">Privacy Policy</a> | <a href="/tos">Terms of Service</a> | <a href="/map">Map</a>
	</div>
</footer>
"""),format.raw/*28.27*/("""

"""),format.raw/*30.61*/("""
<script src=""""),_display_(Seq[Any](/*31.15*/routes/*31.21*/.Assets.at("javascripts/login.js"))),format.raw/*31.55*/("""" type="text/javascript"></script>
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/footer.scala.html
                    HASH: 78d84ed757b3a377d8b5c6ed98380a116e21e035
                    MATRIX: 1447->346|2421->1318|2451->1380|2502->1395|2517->1401|2573->1435
                    LINES: 36->5|59->28|61->30|62->31|62->31|62->31
                    -- GENERATED --
                */
            