
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
	<script type="text/javascript" src="javascripts/toggle.js"></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*30.39*/routes/*30.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*30.90*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*31.39*/routes/*31.45*/.Assets.at("javascripts/jquery.nivo.slider.pack.js"))),format.raw/*31.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("javascripts/jquery.call.nivo.slider.js"))),format.raw/*32.97*/(""""></script>
	<link href=""""),_display_(Seq[Any](/*33.15*/routes/*33.21*/.Assets.at("stylesheets/nivo-slider.css"))),format.raw/*33.62*/("""" rel="stylesheet" type="text/css" media="screen" />
""")))};def /*41.2*/content/*41.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*41.13*/("""
"""),_display_(Seq[Any](/*42.2*/views/*42.7*/.html.header())),format.raw/*42.21*/("""
"""),_display_(Seq[Any](/*43.2*/views/*43.7*/.html.slides())),format.raw/*43.21*/("""
<div>
<a href="/signup">Sign Up</a>
</div>
"""),_display_(Seq[Any](/*47.2*/views/*47.7*/.html.footer())),format.raw/*47.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*34.2*/("""

"""),format.raw/*40.3*/("""
"""),format.raw/*48.2*/("""
	
"""),format.raw/*54.3*/("""
"""),_display_(Seq[Any](/*55.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 00:08:43 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/index.scala.html
                    HASH: 65c55c1942edb2994948f5456d5231047c053151
                    MATRIX: 1412->408|1441->428|1509->432|1720->706|1744->721|1812->725|1863->740|1878->746|1936->782|2072->882|2087->888|2145->923|2222->964|2237->970|2297->1008|2383->1058|2398->1064|2482->1125|2749->1356|2764->1362|2831->1407|2917->1457|2932->1463|3006->1515|3092->1565|3107->1571|3181->1623|3243->1649|3258->1655|3321->1696|3398->1836|3413->1843|3481->1847|3518->1849|3531->1854|3567->1868|3604->1870|3617->1875|3653->1889|3733->1934|3746->1939|3782->1953|3822->406|3850->620|3879->704|3907->1750|3936->1834|3964->1955|3994->2087|4031->2089
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|52->30|52->30|52->30|53->31|53->31|53->31|54->32|54->32|54->32|55->33|55->33|55->33|56->41|56->41|58->41|59->42|59->42|59->42|60->43|60->43|60->43|64->47|64->47|64->47|66->9|67->14|69->20|70->34|72->40|73->48|75->54|76->55
                    -- GENERATED --
                */
            