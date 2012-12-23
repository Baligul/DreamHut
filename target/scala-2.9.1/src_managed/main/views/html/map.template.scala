
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
* Index. This is the map page.                        						   *
*                                                                              *
*******************************************************************************/
object map extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the map page.                        						   *
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
	<script type="text/javascript" src="javascripts/toggle.js"></script>
""")))};def /*37.2*/content/*37.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*37.13*/("""
"""),_display_(Seq[Any](/*38.2*/views/*38.7*/.html.header())),format.raw/*38.21*/("""
	<div class="ifrm">
		<iframe src="https://maps.google.co.in/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Delixus+Software+India+Pvt.+Ltd,+6th+Main+Road,+Jayamahal,+Bangalore,+Karnataka&amp;sll=13.001484,77.592831&amp;sspn=0.009241,0.016512&amp;ie=UTF8&amp;hq=Delixus+Software+India+Pvt.+Ltd,&amp;hnear=6th+Main+Rd,+Jayamahal,+Bengaluru,+Karnataka&amp;ll=13.001484,77.592831&amp;spn=0.006295,0.006295&amp;t=m&amp;output=embed" width="100%" height="100%" ></iframe>
	</div>
"""),_display_(Seq[Any](/*42.2*/views/*42.7*/.html.footer())),format.raw/*42.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*30.2*/("""

"""),format.raw/*36.3*/("""
"""),format.raw/*43.2*/("""
	
"""),format.raw/*49.3*/("""
"""),_display_(Seq[Any](/*50.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 23 17:59:09 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/map.scala.html
                    HASH: 38ce1e892940578b16f1eaabd9201bce3486608b
                    MATRIX: 1408->407|1437->427|1505->431|1716->705|1740->720|1808->724|1859->739|1874->745|1932->781|2068->881|2083->887|2141->922|2218->963|2233->969|2293->1007|2379->1057|2394->1063|2478->1124|2695->1404|2710->1411|2778->1415|2815->1417|2828->1422|2864->1436|3382->1919|3395->1924|3431->1938|3471->405|3499->619|3528->703|3556->1318|3585->1402|3613->1940|3643->2072|3680->2074
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|52->37|52->37|54->37|55->38|55->38|55->38|59->42|59->42|59->42|61->9|62->14|64->20|65->30|67->36|68->43|70->49|71->50
                    -- GENERATED --
                */
            