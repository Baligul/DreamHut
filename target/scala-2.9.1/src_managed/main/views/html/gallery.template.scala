
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
* Index. This is the gallery page.                        						   *
*                                                                              *
*******************************************************************************/
object gallery extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the gallery page.                        						   *
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
"""),_display_(Seq[Any](/*43.2*/views/*43.7*/.html.images())),format.raw/*43.21*/("""
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.footer())),format.raw/*44.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*34.2*/("""

"""),format.raw/*40.3*/("""
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
                    DATE: Sun Dec 23 17:59:09 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/gallery.scala.html
                    HASH: 62a48fae739d3a5449740b8b0409721bee0c5465
                    MATRIX: 1420->411|1449->431|1517->435|1728->709|1752->724|1820->728|1871->743|1886->749|1944->785|2080->885|2095->891|2153->926|2230->967|2245->973|2305->1011|2391->1061|2406->1067|2490->1128|2757->1359|2772->1365|2839->1410|2925->1460|2940->1466|3014->1518|3100->1568|3115->1574|3189->1626|3251->1652|3266->1658|3329->1699|3406->1839|3421->1846|3489->1850|3526->1852|3539->1857|3575->1871|3612->1873|3625->1878|3661->1892|3698->1894|3711->1899|3747->1913|3787->409|3815->623|3844->707|3872->1753|3901->1837|3929->1915|3959->2047|3996->2049
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|52->30|52->30|52->30|53->31|53->31|53->31|54->32|54->32|54->32|55->33|55->33|55->33|56->41|56->41|58->41|59->42|59->42|59->42|60->43|60->43|60->43|61->44|61->44|61->44|63->9|64->14|66->20|67->34|69->40|70->45|72->51|73->52
                    -- GENERATED --
                */
            