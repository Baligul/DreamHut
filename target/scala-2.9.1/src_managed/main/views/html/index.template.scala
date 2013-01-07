
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
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*32.90*/(""""></script>
""")))};def /*40.2*/content/*40.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*40.13*/("""
"""),_display_(Seq[Any](/*41.2*/views/*41.7*/.html.header())),format.raw/*41.21*/("""
<div id = "login_window">
	<table class = "login_table">
			<tr>
				<td>
					<div id = "main_header">
						Specialist in all types of wood work for flats.
				    </div>
				    <br/>
				    <div id = "project_para">
						We offer prices as less as carpenter but our services are of best interior designer in the market.
				    </div>
				    <div id = "project_para">
						Now you can calculate the price of your work online on our site.
				    </div>
					<div id = "project_header">
							Other Services
					</div>
					<div id = "home_list">
						<ul>
							<li>
								POP Work 
							</li>
							<li>
								Grill Work 
							</li>
							<li>
								Aluminium Windows 
							</li>
							<li>
								Granite & Tiles Work 
							</li>
							<li>
								Curtain Fittings 
							</li>
							<li>
								Electric & Plumbing Work 
							</li>
							<li>
								Bathroom Fittings<br/> And all types of Interior Solution 
							</li>
							<br/>
							<br/>
							<br/>
							<br/>
							<br/>
							<br/>
							<br/>
						</ul>
					</div>
				</td>
				<td width = "20px">
				
				</td>
				<td width = "250px">
						<img src=""""),_display_(Seq[Any](/*96.18*/routes/*96.24*/.Assets.at("images/home_mid.jpg"))),format.raw/*96.57*/("""">
				</td>
				<td width = "10px">
				
				</td>
				<td >
				    <center>
						<table>
							<tr>
								<td>
									<img src=""""),_display_(Seq[Any](/*106.21*/routes/*106.27*/.Assets.at("images/login_content.png"))),format.raw/*106.65*/("""">
								</td>
							</tr>
						</table>
						<table>
							<tr height="30px";>
							</tr>
							<tr>
								<td>
									<a id="provider_fb" class="provider_fb" href="/authenticate/facebook"><img src=""""),_display_(Seq[Any](/*115.91*/routes/*115.97*/.Assets.at("images/facebook.jpg"))),format.raw/*115.130*/(""""></a>
								</td>
							</tr>
							<tr height="2px";>
							</tr>
							<tr>
								<td>
									<a id="provider_google" class="provider_google" href="/authenticate/google"><img src=""""),_display_(Seq[Any](/*122.97*/routes/*122.103*/.Assets.at("images/google.jpg"))),format.raw/*122.134*/(""""></a>
								</td>
							</tr>
						</table>
						</center>
						<table>
							<tr height="25px";>
							</tr>
							<tr>
								"""),_display_(Seq[Any](/*131.10*/views/*131.15*/.html.footer_home())),format.raw/*131.34*/("""
							</tr>
						</table>
				</td>
			</tr>
		</table>
</div>
<div id="footer_bottom" class="footer_bottom">
	<p><a href="/contact">Contact</a> | <a href="/map">Map</a>
</div>
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*141.2*/("""
	
"""),format.raw/*147.3*/("""
"""),_display_(Seq[Any](/*148.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 06:52:50 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/index.scala.html
                    HASH: 48333bf609c01f252fbff44992ecc4cefe65127b
                    MATRIX: 1412->408|1441->428|1509->432|1720->706|1744->721|1812->725|1863->740|1878->746|1936->782|2072->882|2087->888|2145->923|2222->964|2237->970|2297->1008|2383->1058|2398->1064|2482->1125|2798->1405|2813->1411|2880->1456|2916->1555|2931->1562|2999->1566|3036->1568|3049->1573|3085->1587|4292->2758|4307->2764|4362->2797|4537->2935|4553->2941|4614->2979|4865->3193|4881->3199|4938->3232|5169->3426|5186->3432|5241->3463|5418->3603|5433->3608|5475->3627|5694->406|5722->620|5751->704|5779->1469|5808->1553|5837->3808|5868->3940|5906->3942
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|113->96|113->96|113->96|123->106|123->106|123->106|132->115|132->115|132->115|139->122|139->122|139->122|148->131|148->131|148->131|159->9|160->14|162->20|163->33|165->39|166->141|168->147|169->148
                    -- GENERATED --
                */
            