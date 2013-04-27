
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
* TOS. This is the terms of services page.                        						   *
*                                                                              *
*******************************************************************************/
object tos extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* TOS. This is the terms of services page.                        						   *
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
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*32.90*/(""""></script>
""")))};def /*40.2*/content/*40.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*40.13*/("""
"""),_display_(Seq[Any](/*41.2*/views/*41.7*/.html.header())),format.raw/*41.21*/("""
<div id = "project_window">
<center>
	<table class = "project_table">
			<tr>
				<td>
					<div id = "project_header">
							Terms of Service
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>By using DreamhutInteriors.com you accept terms and conditions which are mentioned here.
							<p>You can use the pictures and estimator on our site for free for knowing about the latest interior prices and design to support you interior work.
							<p>Dreamhutinteriors.com will not ask you for any price or any information explicitly. Therefore you are solely responsible for any loss you incurred due to explicitly sharing your information or money to anyone in the name of Dreamhutinteriors.com. 
					</div>
				</td>
			</tr>
	</table>
</center>
</div>
"""),_display_(Seq[Any](/*64.2*/views/*64.7*/.html.footer())),format.raw/*64.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*65.2*/("""
	
"""),format.raw/*71.3*/("""
"""),_display_(Seq[Any](/*72.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/tos.scala.html
                    HASH: f3c42fe91f386de80a5470997bed52642fec3d62
                    MATRIX: 1432->419|1461->439|1529->443|1871->848|1895->863|1963->867|2014->882|2029->888|2087->924|2223->1024|2238->1030|2296->1065|2373->1106|2388->1112|2448->1150|2534->1200|2549->1206|2633->1267|2949->1547|2964->1553|3031->1598|3067->1697|3082->1704|3150->1708|3187->1710|3200->1715|3236->1729|4067->2525|4080->2530|4116->2544|4156->417|4184->762|4213->846|4241->1611|4270->1695|4298->2546|4328->2678|4365->2680
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|81->64|81->64|81->64|83->9|84->14|86->20|87->33|89->39|90->65|92->71|93->72
                    -- GENERATED --
                */
            