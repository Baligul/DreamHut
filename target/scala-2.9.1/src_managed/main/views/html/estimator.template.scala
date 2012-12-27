
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
* Index. This is the home page.                        						   *
*                                                                              *
*******************************************************************************/
object estimator extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the home page.                        						   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {
def /*10.2*/pageSpecificMetadata/*10.22*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*10.26*/("""
	<meta name="description" content="This is interior website.">
	<meta name="keywords" content="interior, design, furniture, commercial, residential">
	<title>Dream Hut Interiors</title>
""")))};def /*21.2*/pageSpecificCss/*21.17*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*21.21*/("""
	<link href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("stylesheets/styles.css"))),format.raw/*22.57*/("""" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*23.63*/routes/*23.69*/.Assets.at("stylesheets/login.css"))),format.raw/*23.104*/("""">
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*24.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*25.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*32.90*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("javascripts/jquery.nivo.slider.pack.js"))),format.raw/*33.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*34.39*/routes/*34.45*/.Assets.at("javascripts/jquery.call.nivo.slider.js"))),format.raw/*34.97*/(""""></script>
	<link href=""""),_display_(Seq[Any](/*35.15*/routes/*35.21*/.Assets.at("stylesheets/nivo-slider.css"))),format.raw/*35.62*/("""" rel="stylesheet" type="text/css" media="screen" />
""")))};def /*43.2*/content/*43.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*43.13*/("""
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.header())),format.raw/*44.21*/("""
	<div id="signin_button_container" class="signin_button_container">
				<div>
	                <a href="#">Tasdeek your estimater will appear here.</a>
	            </div>
	</div>
"""),_display_(Seq[Any](/*50.2*/views/*50.7*/.html.footer())),format.raw/*50.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*51.2*/("""
	
"""),format.raw/*57.3*/("""
"""),_display_(Seq[Any](/*58.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 27 05:41:40 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/estimator.scala.html
                    HASH: 5c3f2101b624cc553cd2da64252ddb3907317631
                    MATRIX: 1416->408|1445->428|1513->432|1724->706|1748->721|1816->725|1867->740|1882->746|1940->782|2076->882|2091->888|2149->923|2226->964|2241->970|2301->1008|2387->1058|2402->1064|2486->1125|2802->1405|2817->1411|2884->1456|2970->1506|2985->1512|3059->1564|3145->1614|3160->1620|3234->1672|3296->1698|3311->1704|3374->1745|3451->1885|3466->1892|3534->1896|3571->1898|3584->1903|3620->1917|3837->2099|3850->2104|3886->2118|3926->406|3954->620|3983->704|4011->1799|4040->1883|4068->2120|4098->2252|4135->2254
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|57->35|57->35|57->35|58->43|58->43|60->43|61->44|61->44|61->44|67->50|67->50|67->50|69->9|70->14|72->20|73->36|75->42|76->51|78->57|79->58
                    -- GENERATED --
                */
            