
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
object offers extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

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
						If you are looking for best offers and want to avail great benefits then you are at the right place. We have many exciting offers and packages for you. 
				    </div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_header">
							Offers
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
						<ul>
							<li>
								If your flat is in such apartment which is newly completed and where we have not worked before and you are the first person for whom we are going to work then you are sure to get flat <b>5%</b> discount on your total amount. 
							</li>
							<br/>
							<li>
								If your flat is at ground floor and in such apartment which is newly completed and where we have not worked before and you are the first person for whom we are going to work then you are sure to get flat <b>10%</b> discount on your total amount. 
							</li>
							<br/>
						</ul>
					</div>
				</td>
			</tr>
			<tr>
				<td id = "project_header">
					<div>
							Packages
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
						<ul>
							<li>
								<b>2 BHK</b>(Laminated kitchen using water proof ply & stainless steel pull out baskets + wardrobes with loft in all the rooms) in <b>Rs. 2 lac 20 thousand</b>.
							</li>
							<li>
								<b>3 BHK</b>(Laminated kitchen using water proof ply & stainless steel pull out baskets + wardrobes with loft in all the rooms) in <b>Rs. 2 lac 75 thousand</b>.
							</li>
						</ul>
					</div>
				</td>
			</tr>
	</table>
</center>
</div>
"""),_display_(Seq[Any](/*99.2*/views/*99.7*/.html.footer())),format.raw/*99.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*100.2*/("""
	
"""),format.raw/*106.3*/("""
"""),_display_(Seq[Any](/*107.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/offers.scala.html
                    HASH: 7440fbf26f64c0c296485025d32694b66635b288
                    MATRIX: 1413->408|1442->428|1510->432|1852->837|1876->852|1944->856|1995->871|2010->877|2068->913|2204->1013|2219->1019|2277->1054|2354->1095|2369->1101|2429->1139|2515->1189|2530->1195|2614->1256|2930->1536|2945->1542|3012->1587|3048->1686|3063->1693|3131->1697|3168->1699|3181->1704|3217->1718|4941->3407|4954->3412|4990->3426|5030->406|5058->751|5087->835|5115->1600|5144->1684|5173->3428|5204->3560|5242->3562
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|116->99|116->99|116->99|118->9|119->14|121->20|122->33|124->39|125->100|127->106|128->107
                    -- GENERATED --
                */
            