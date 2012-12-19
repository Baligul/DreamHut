
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
* Index. This is the about page.                        						   *
*                                                                              *
*******************************************************************************/
object about extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the about page.                        						   *
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
<div><p>The contents will go here.</p></div>
"""),_display_(Seq[Any](/*40.2*/views/*40.7*/.html.footer())),format.raw/*40.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*30.2*/("""

"""),format.raw/*36.3*/("""
"""),format.raw/*41.2*/("""
	
"""),format.raw/*47.3*/("""
"""),_display_(Seq[Any](/*48.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 20 00:08:43 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/about.scala.html
                    HASH: bde98dbf2e581c22cb57e262eb702fa94626ae12
                    MATRIX: 1414->409|1443->429|1511->433|1722->707|1746->722|1814->726|1865->741|1880->747|1938->783|2074->883|2089->889|2147->924|2224->965|2239->971|2299->1009|2385->1059|2400->1065|2484->1126|2701->1406|2716->1413|2784->1417|2821->1419|2834->1424|2870->1438|2952->1485|2965->1490|3001->1504|3041->407|3069->621|3098->705|3126->1320|3155->1404|3183->1506|3213->1638|3250->1640
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|52->37|52->37|54->37|55->38|55->38|55->38|57->40|57->40|57->40|59->9|60->14|62->20|63->30|65->36|66->41|68->47|69->48
                    -- GENERATED --
                */
            