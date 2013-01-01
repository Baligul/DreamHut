
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
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("javascripts/jquery.nivo.slider.pack.js"))),format.raw/*33.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*34.39*/routes/*34.45*/.Assets.at("javascripts/jquery.call.nivo.slider.js"))),format.raw/*34.97*/(""""></script>
	<link href=""""),_display_(Seq[Any](/*35.15*/routes/*35.21*/.Assets.at("stylesheets/nivo-slider.css"))),format.raw/*35.62*/("""" rel="stylesheet" type="text/css" media="screen" />
""")))};def /*43.2*/content/*43.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*43.13*/("""
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.header())),format.raw/*44.21*/("""
<div id = "login_window">
	<table class = "login_table">
			<tr>
				<td class = "home_text_column">
					<div id = "home_text">
						<img src=""""),_display_(Seq[Any](/*50.18*/routes/*50.24*/.Assets.at("images/home_content.png"))),format.raw/*50.61*/("""">
				    </div>
				</td>
				<td width = "150px">
				
				</td>
				<td width = "300px">
				
				</td>
				<td width = "150px">
				
				</td>
				<td >
				    <center>
						<table>
							<tr>
								<td>
									<img src=""""),_display_(Seq[Any](/*67.21*/routes/*67.27*/.Assets.at("images/login_content.png"))),format.raw/*67.65*/("""">
								</td>
							</tr>
						</table>
						<table>
							<tr height="50px";>
							</tr>
							<tr>
								<td>
									<a id="provider_fb" class="provider_fb" href="/authenticate/facebook"><img src=""""),_display_(Seq[Any](/*76.91*/routes/*76.97*/.Assets.at("images/facebook.jpg"))),format.raw/*76.130*/(""""></a>
								</td>
							</tr>
							<tr>
								<td>
									<a id="provider_google" class="provider_google" href="/authenticate/google"><img src=""""),_display_(Seq[Any](/*81.97*/routes/*81.103*/.Assets.at("images/google.jpg"))),format.raw/*81.134*/(""""></a>
								</td>
							</tr>
						</table>
					</center>
				</td>
			</tr>
		</table>
</div>	
"""),_display_(Seq[Any](/*90.2*/views/*90.7*/.html.footer())),format.raw/*90.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*91.2*/("""
	
"""),format.raw/*97.3*/("""
"""),_display_(Seq[Any](/*98.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 02 01:10:52 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/index.scala.html
                    HASH: 84190f08c147f16a385b79056c64dccbbdeaab73
                    MATRIX: 1412->408|1441->428|1509->432|1720->706|1744->721|1812->725|1863->740|1878->746|1936->782|2072->882|2087->888|2145->923|2222->964|2237->970|2297->1008|2383->1058|2398->1064|2482->1125|2798->1405|2813->1411|2880->1456|2966->1506|2981->1512|3055->1564|3141->1614|3156->1620|3230->1672|3292->1698|3307->1704|3370->1745|3447->1885|3462->1892|3530->1896|3567->1898|3580->1903|3616->1917|3799->2064|3814->2070|3873->2107|4143->2341|4158->2347|4218->2385|4468->2599|4483->2605|4539->2638|4730->2793|4746->2799|4800->2830|4938->2933|4951->2938|4987->2952|5027->406|5055->620|5084->704|5112->1799|5141->1883|5169->2954|5199->3086|5236->3088
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|57->35|57->35|57->35|58->43|58->43|60->43|61->44|61->44|61->44|67->50|67->50|67->50|84->67|84->67|84->67|93->76|93->76|93->76|98->81|98->81|98->81|107->90|107->90|107->90|109->9|110->14|112->20|113->36|115->42|116->91|118->97|119->98
                    -- GENERATED --
                */
            