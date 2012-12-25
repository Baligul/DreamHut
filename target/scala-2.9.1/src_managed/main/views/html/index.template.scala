
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
				<div id="provider_login" class="provider_login">
	                <a id="provider_fb" class="provider_fb" href="/authenticate/facebook"><img src=""""),_display_(Seq[Any](/*47.99*/routes/*47.105*/.Assets.at("images/facebook.jpg"))),format.raw/*47.138*/("""" height="65px" width="350px" /></a>
	                <a id="provider_google" class="provider_google" href="/authenticate/google"><img src=""""),_display_(Seq[Any](/*48.105*/routes/*48.111*/.Assets.at("images/google.png"))),format.raw/*48.142*/("""" height="65px" width="350px" /></a>
		        </div>
	</div>
"""),_display_(Seq[Any](/*51.2*/views/*51.7*/.html.footer())),format.raw/*51.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*52.2*/("""
	
"""),format.raw/*58.3*/("""
"""),_display_(Seq[Any](/*59.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 25 16:46:27 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/index.scala.html
                    HASH: 7fa2032bafb513b0fbeb8ee7d129ee3f6a53c364
                    MATRIX: 1412->408|1441->428|1509->432|1720->706|1744->721|1812->725|1863->740|1878->746|1936->782|2072->882|2087->888|2145->923|2222->964|2237->970|2297->1008|2383->1058|2398->1064|2482->1125|2798->1405|2813->1411|2880->1456|2966->1506|2981->1512|3055->1564|3141->1614|3156->1620|3230->1672|3292->1698|3307->1704|3370->1745|3447->1885|3462->1892|3530->1896|3567->1898|3580->1903|3616->1917|3872->2137|3888->2143|3944->2176|4122->2317|4138->2323|4192->2354|4290->2417|4303->2422|4339->2436|4379->406|4407->620|4436->704|4464->1799|4493->1883|4521->2438|4551->2570|4588->2572
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|57->35|57->35|57->35|58->43|58->43|60->43|61->44|61->44|61->44|64->47|64->47|64->47|65->48|65->48|65->48|68->51|68->51|68->51|70->9|71->14|73->20|74->36|76->42|77->52|79->58|80->59
                    -- GENERATED --
                */
            