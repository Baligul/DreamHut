
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
object projects_done extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the home page.                        						   *
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
					<div id = "project_para">
						We have completed more than 100 projects successfully all over Bangalore in last 5 years. We value our customers and deliver the best quality at very cheap rates. We are still in touch with all of our old customers and are always ready to solve any problem of theirs in terms of our services and products.<br/><br/>Here is the list of some of our successful projects.
				    </div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_header">
							Major Projects
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
						<ul>
							<li>
								Salarpuria Sanctity	(more than 20 Flats)
							</li>
							<li>
								Gopalan Grandeur (more than 20 Flats)
							</li>
						</ul>
					</div>
				</td>
			</tr>
			<tr>
				<td id = "project_header">
					<div>
							Minor Projects
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
						<ul>
							<li>
								SLS Splendor
							</li>
							<li>
								Ncc Maple Height
							</li>
							<li>
								Ncc Serene 
							</li>
							<li>
								Ncc Aster Park 
							</li>
							<li>
								Purva Highland 
							</li>
							<li>
								Nitesh Forest Hill
							</li>
							<li>
								Confident Group
							</li>
							<li>
								Brigade Parmspring
							</li>
							<li>
								Prestige Shantiniketan
							</li>
							<li>
								Sobha Chrysanthemum
							</li>
							<li>
								Sobha Dahlia
							</li>
							<li>
								Mahaveer Dazzle
							</li>
							<li>
								Mahaveer Tuscan
							</li>
							<li>
								Golden Blossom
							</li>
							<li>
								Suncity
							</li>
							<li>
								Elita Promonade
							</li>
							<li>
								Alpine Prymid
							</li>
						</ul>
					</div>
				</td>
			</tr>
	</table>
</center>
</div>
"""),_display_(Seq[Any](/*142.2*/views/*142.7*/.html.footer())),format.raw/*142.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*143.2*/("""
	
"""),format.raw/*149.3*/("""
"""),_display_(Seq[Any](/*150.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/projects_done.scala.html
                    HASH: 18c08fae00d495d6b63b6e857439d91862c98b6b
                    MATRIX: 1420->408|1449->428|1517->432|1859->837|1883->852|1951->856|2002->871|2017->877|2075->913|2211->1013|2226->1019|2284->1054|2361->1095|2376->1101|2436->1139|2522->1189|2537->1195|2621->1256|2937->1536|2952->1542|3019->1587|3055->1686|3070->1693|3138->1697|3175->1699|3188->1704|3224->1718|5200->3658|5214->3663|5251->3677|5291->406|5319->751|5348->835|5376->1600|5405->1684|5434->3679|5465->3811|5503->3813
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|159->142|159->142|159->142|161->9|162->14|164->20|165->33|167->39|168->143|170->149|171->150
                    -- GENERATED --
                */
            