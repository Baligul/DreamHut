
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
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
""")))};def /*39.2*/content/*39.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*39.13*/("""
"""),_display_(Seq[Any](/*40.2*/views/*40.7*/.html.header())),format.raw/*40.21*/("""
	<div class="ifrm">
		<iframe src="https://maps.google.co.in/maps/ms?authuser=0&ie=UTF8&hl=en&oe=UTF8&msa=0&msid=212260133269557036835.0004d19afa5d3361df849" width="100%" height="100%" ></iframe>
	</div>
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.footer())),format.raw/*44.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*32.2*/("""

"""),format.raw/*38.3*/("""
"""),format.raw/*45.2*/("""
	
"""),format.raw/*51.3*/("""
"""),_display_(Seq[Any](/*52.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 25 16:10:07 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/map.scala.html
                    HASH: 71752d3efb206a9970dbcac37d2b91f413e9bb39
                    MATRIX: 1408->407|1437->427|1505->431|1716->705|1740->720|1808->724|1859->739|1874->745|1932->781|2068->881|2083->887|2141->922|2218->963|2233->969|2293->1007|2379->1057|2394->1063|2478->1124|2744->1453|2759->1460|2827->1464|2864->1466|2877->1471|2913->1485|3154->1691|3167->1696|3203->1710|3243->405|3271->619|3300->703|3328->1367|3357->1451|3385->1712|3415->1844|3452->1846
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->39|54->39|56->39|57->40|57->40|57->40|61->44|61->44|61->44|63->9|64->14|66->20|67->32|69->38|70->45|72->51|73->52
                    -- GENERATED --
                */
            