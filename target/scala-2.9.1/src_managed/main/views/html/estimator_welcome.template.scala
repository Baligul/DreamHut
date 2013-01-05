
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
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*25.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*26.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*33.90*/(""""></script>
""")))};def /*41.2*/content/*41.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*41.13*/("""
"""),_display_(Seq[Any](/*42.2*/views/*42.7*/.html.header())),format.raw/*42.21*/("""
				<table height= "70px">
					<tr>
						<td width = "20px">
						</td>
						<td>
							<h2>"""),_display_(Seq[Any](/*48.13*/customerName)),format.raw/*48.25*/("""</h2>
						</td>
						<td width = "800px">
						</td>
						<td>
							<a href="#" >Log out</a>
						</td>
					</tr>
				</table>
				<center>
				<table height = "50px">
					<tr>
						<td>
							<h1>Welcome to our Estimator</h1>
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
	               							<font size="4"><li><a href="/estimator/tv_units">T.V. Units(coming soon...)</a></li></font>
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
"""),format.raw/*34.2*/("""

"""),format.raw/*40.3*/("""
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
                    DATE: Sun Jan 06 00:13:48 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/estimator_welcome.scala.html
                    HASH: 6b9ffc7db75061c9f6c6f09924effa72db2dfc6e
                    MATRIX: 1433->339|1516->461|1545->481|1613->485|1814->749|1838->764|1906->768|1957->783|1972->789|2030->825|2166->925|2181->931|2239->966|2316->1007|2331->1013|2391->1051|2477->1101|2492->1107|2576->1168|2892->1448|2907->1454|2974->1499|3010->1598|3025->1605|3093->1609|3130->1611|3143->1616|3179->1630|3314->1729|3348->1741|4581->2939|4594->2944|4630->2958|4671->361|4699->459|4727->663|4756->747|4784->1512|4813->1596|4841->2960|4871->3092|4908->3094
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|54->33|54->33|54->33|55->41|55->41|57->41|58->42|58->42|58->42|64->48|64->48|104->88|104->88|104->88|106->5|107->10|108->15|110->21|111->34|113->40|114->89|116->95|117->96
                    -- GENERATED --
                */
            