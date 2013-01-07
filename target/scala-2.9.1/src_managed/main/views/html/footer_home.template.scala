
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
object footer_home extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
			<div id="social_links_container_home">
				<ul class="social_links">
					<li class="google_plus_badge">
						<g:plusone href="http://www.dreamhutinteriors.com" annotation="inline"></g:plusone> 
					</li>
					<li class="twitter_share_link">
						<a href="https://twitter.com/intent/tweet?button_hashtag=DreamHutInteriors&text="Design your dreams" class="twitter-hashtag-button" data-url="http://www.DreamHutInteriors.com"></a>
					</li>
					<li class="fb_like_button">
						<div class="fb-like" data-href="http://www.dreamhutinteriors.com" data-send="false" data-show-faces="true"></div>
					</li>
				</ul>
			</div>
		</div>
	</div>
</footer>
"""),format.raw/*25.27*/("""

"""),format.raw/*27.61*/("""
<script src=""""),_display_(Seq[Any](/*28.15*/routes/*28.21*/.Assets.at("javascripts/login.js"))),format.raw/*28.55*/("""" type="text/javascript"></script>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 06:52:03 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/footer_home.scala.html
                    HASH: ee839d0dffaa8b4e5468b3b0ca8ef21295fe462c
                    MATRIX: 1452->346|2208->1100|2238->1162|2289->1177|2304->1183|2360->1217
                    LINES: 36->5|56->25|58->27|59->28|59->28|59->28
                    -- GENERATED --
                */
            