
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
	<p><a href="/contact">Contact</a> | <a href="/policy">Privacy Policy</a> | <a href="/tos">Terms of Service</a> | <a href="/map">Map</a>
</div>
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*141.2*/("""
	
"""),format.raw/*147.3*/("""
"""),_display_(Seq[Any](/*148.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))),format.raw/*148.54*/("""
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/index.scala.html
                    HASH: 249b7a9ca447b59aee025f9ddc94ec02e6674fbe
                    MATRIX: 1412->408|1441->428|1509->432|1851->837|1875->852|1943->856|1994->871|2009->877|2067->913|2203->1013|2218->1019|2276->1054|2353->1095|2368->1101|2428->1139|2514->1189|2529->1195|2613->1256|2929->1536|2944->1542|3011->1587|3047->1686|3062->1693|3130->1697|3167->1699|3180->1704|3216->1718|4423->2889|4438->2895|4493->2928|4668->3066|4684->3072|4745->3110|4996->3324|5012->3330|5069->3363|5300->3557|5317->3563|5372->3594|5549->3734|5564->3739|5606->3758|5902->406|5930->751|5959->835|5987->1600|6016->1684|6045->4016|6076->4148|6114->4150|6189->4202
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|113->96|113->96|113->96|123->106|123->106|123->106|132->115|132->115|132->115|139->122|139->122|139->122|148->131|148->131|148->131|159->9|160->14|162->20|163->33|165->39|166->141|168->147|169->148|169->148
                    -- GENERATED --
                */
            