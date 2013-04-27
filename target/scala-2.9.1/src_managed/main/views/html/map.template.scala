
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
	<meta name="description" content="Dream Hut Interiors is the premier website in India which allows you to estimate the prices of your work online instantly.">
	<meta name="keywords" content="dream, hut, estimator, dream hut, interior, design, furniture, commercial, residential">
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
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/map.scala.html
                    HASH: b3f13db0fc58dad8c87906e72f9195fb9c40b55e
                    MATRIX: 1408->407|1437->427|1505->431|1847->836|1871->851|1939->855|1990->870|2005->876|2063->912|2199->1012|2214->1018|2272->1053|2349->1094|2364->1100|2424->1138|2510->1188|2525->1194|2609->1255|2875->1584|2890->1591|2958->1595|2995->1597|3008->1602|3044->1616|3285->1822|3298->1827|3334->1841|3374->405|3402->750|3431->834|3459->1498|3488->1582|3516->1843|3546->1975|3583->1977
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->39|54->39|56->39|57->40|57->40|57->40|61->44|61->44|61->44|63->9|64->14|66->20|67->32|69->38|70->45|72->51|73->52
                    -- GENERATED --
                */
            