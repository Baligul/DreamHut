
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
* Estimator Welcome. This is the welcome page for estimator.                        						   *
*                                                                              *
*******************************************************************************/
object estimator_welcome extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /*******************************************************************************
* Estimator Welcome. This is the welcome page for estimator.                        						   *
*                                                                              *
*******************************************************************************/
    def apply/*5.2*/(customerName: String):play.api.templates.Html = {
        _display_ {
def /*11.2*/pageSpecificMetadata/*11.22*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*11.26*/("""
	<meta name="description" content="This is interior website.">
	<meta name="keywords" content="interior, design, furniture, commercial, residential">
	<title>Estimator</title>
""")))};def /*22.2*/pageSpecificCss/*22.17*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*22.21*/("""
	<link href=""""),_display_(Seq[Any](/*23.15*/routes/*23.21*/.Assets.at("stylesheets/styles.css"))),format.raw/*23.57*/("""" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*24.63*/routes/*24.69*/.Assets.at("stylesheets/login.css"))),format.raw/*24.104*/("""">
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*25.63*/routes/*25.69*/.Assets.at("stylesheets/estimator.css"))),format.raw/*25.108*/("""">
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*26.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*27.39*/routes/*27.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*27.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*34.39*/routes/*34.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*34.90*/(""""></script>
""")))};def /*42.2*/content/*42.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*42.13*/("""
"""),_display_(Seq[Any](/*43.2*/views/*43.7*/.html.header())),format.raw/*43.21*/("""
				<table height= "70px">
					<tr>
						<td width = "20px">
						</td>
						<td>
							<div id = "customer_name">"""),_display_(Seq[Any](/*49.35*/customerName)),format.raw/*49.47*/("""</div>
						</td>
						<td width = "700px">
						</td>
						<td>
							<a href=""""),_display_(Seq[Any](/*54.18*/securesocial/*54.30*/.controllers.routes.LoginPage.logout())),format.raw/*54.68*/("""" >Log out</a>
						</td>
					</tr>
				</table>
				<center>
				<table height = "50px">
					<tr>
						<td>
							<div id = "welcome_header">Welcome to Estimator</div>
						</td>
					</tr>
					<tr height = "25px">
					</tr>
					<tr>
						<td>
							<table>
								<tr>
									<td>
										<ul>
	                						<font size="4"><li><a href="/estimator/wardrobe">Wardrobe</a></li></font>
	               							<font size="4"><li><a href="/estimator/kitchen">Kitchen</a></li></font>
	               							<font size="4"><li><a href="/estimator/living_room">Living Room(coming soon...)</a></li></font>
	               							<font size="4"><li><a href="/estimator/wooden_flooring">Wooden Flooring(coming soon...)</a></li></font>
	               							<font size="4"><li><a href="/estimator/bed">Bed(coming soon...)</a></li></font>
	               						</ul>						
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height = "100px">
					</tr>
				</table>
				</center>
"""),_display_(Seq[Any](/*88.2*/views/*88.7*/.html.footer())),format.raw/*88.21*/("""
""")))};
Seq[Any](format.raw/*5.24*/("""
"""),format.raw/*10.3*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*21.3*/("""
"""),format.raw/*35.2*/("""

"""),format.raw/*41.3*/("""
"""),format.raw/*89.2*/("""
	
"""),format.raw/*95.3*/("""
"""),_display_(Seq[Any](/*96.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render(customerName:String) = apply(customerName)
    
    def f:((String) => play.api.templates.Html) = (customerName) => apply(customerName)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 04:48:05 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/estimator_welcome.scala.html
                    HASH: 1add77c684481cb05dd27d5eb86c877cdffb84a6
                    MATRIX: 1433->339|1516->461|1545->481|1613->485|1814->749|1838->764|1906->768|1957->783|1972->789|2030->825|2166->925|2181->931|2239->966|2340->1031|2355->1037|2417->1076|2494->1117|2509->1123|2569->1161|2655->1211|2670->1217|2754->1278|3070->1558|3085->1564|3152->1609|3188->1708|3203->1715|3271->1719|3308->1721|3321->1726|3357->1740|3514->1861|3548->1873|3670->1959|3691->1971|3751->2009|4807->3030|4820->3035|4856->3049|4897->361|4925->459|4953->663|4982->747|5010->1622|5039->1706|5067->3051|5097->3183|5134->3185
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|55->34|55->34|55->34|56->42|56->42|58->42|59->43|59->43|59->43|65->49|65->49|70->54|70->54|70->54|104->88|104->88|104->88|106->5|107->10|108->15|110->21|111->35|113->41|114->89|116->95|117->96
                    -- GENERATED --
                */
            