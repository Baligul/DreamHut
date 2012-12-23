
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
			<div id="footer_left">
				<ul class="footer_section">
	          		<li>
						<div>About Us</div>
						<a class="footer_links" href="/company">Company</a>
					</li>
	          		<li>
						<div>Support</div>
						<a class="footer_links" href="/tos">Terms of Use</a>
						<a class="footer_links" href="/privacy">Privacy Policy</a>
						<a class="footer_links" href="/contact">Contact Us</a>
					</li>
	        	</ul>
			</div>
			<div id="social_links_container">
				<ul class="social_links">		
					<li class="twitter_share_link">
						<a href="https://twitter.com/intent/tweet?button_hashtag='DreamHut'&text="Dream with us" class="twitter-hashtag-button" data-url="http://www.DreamHutInteriors.com"></a>
					</li>
					<li class="google_plus_badge">
						<g:plusone href="http://www.dreamhutinteriors.com" annotation="inline" width="300"></g:plusone> 
					</li>
					<li class="fb_like_button">
						<div class="fb-like" data-href="http://www.dreamhutinteriors.com" data-send="false" data-width="300" data-show-faces="true"></div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</footer>
"""),format.raw/*39.27*/("""

"""),format.raw/*41.61*/("""
<script src=""""),_display_(Seq[Any](/*42.15*/routes/*42.21*/.Assets.at("javascripts/login.js"))),format.raw/*42.55*/("""" type="text/javascript"></script>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 23 17:59:09 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/footer.scala.html
                    HASH: bcfb8a0d1d6bd79237db37e14ccfbb5ab7eed10a
                    MATRIX: 1447->346|2653->1550|2683->1612|2734->1627|2749->1633|2805->1667
                    LINES: 36->5|70->39|72->41|73->42|73->42|73->42
                    -- GENERATED --
                */
            