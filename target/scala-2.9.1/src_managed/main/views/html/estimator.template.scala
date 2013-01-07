
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
object estimator extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the home page.                        						   *
*                                                                              *
*******************************************************************************/
    def apply/*5.2*/(id: String):play.api.templates.Html = {
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
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*35.39*/routes/*35.45*/.Assets.at("javascripts/estimator.js"))),format.raw/*35.83*/(""""></script>
""")))};def /*43.2*/content/*43.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*43.13*/("""
<body onload = "runTotal(frm_wardrobe);runTotal(frm_loft);runTotal(frm_uts);runTotal(frm_ats);runTotal(frm_ou);calculateAmount(frm_wardrobe, 1);calculateAmount(frm_loft, 2);calcAmount(frm_uts);calcAmount(frm_ats);calcAmount(frm_ou)"></body>
"""),_display_(Seq[Any](/*45.2*/views/*45.7*/.html.header())),format.raw/*45.21*/("""
				<table height= "70px">
					<tr>
						<td width = "20px">
						</td>
						<td width = "200px">
						</td>
						<td width = "700px">
						</td>
						<td>
							<a href=""""),_display_(Seq[Any](/*55.18*/securesocial/*55.30*/.controllers.routes.LoginPage.logout())),format.raw/*55.68*/("""" >Log out</a>
						</td>
					</tr>
				</table>	
	"""),_display_(Seq[Any](/*59.3*/if(id == "wardrobe")/*59.23*/ {_display_(Seq[Any](format.raw/*59.25*/("""
		<table width = "100%">
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*63.7*/views/*63.12*/.html.wardrobe())),format.raw/*63.28*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*70.7*/views/*70.12*/.html.kitchen())),format.raw/*70.27*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
		</table>
		
		
	""")))})),format.raw/*78.3*/("""
	"""),_display_(Seq[Any](/*79.3*/if(id == "kitchen")/*79.22*/ {_display_(Seq[Any](format.raw/*79.24*/("""
		<table width = "100%">
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*83.7*/views/*83.12*/.html.kitchen())),format.raw/*83.27*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*90.7*/views/*90.12*/.html.wardrobe())),format.raw/*90.28*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
		</table>
	""")))})),format.raw/*96.3*/("""	             
"""),_display_(Seq[Any](/*97.2*/views/*97.7*/.html.footer())),format.raw/*97.21*/("""
""")))};
Seq[Any](format.raw/*5.14*/("""
"""),format.raw/*10.3*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*21.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*98.2*/("""
	
"""),format.raw/*104.3*/("""
"""),_display_(Seq[Any](/*105.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render(id:String) = apply(id)
    
    def f:((String) => play.api.templates.Html) = (id) => apply(id)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 04:48:05 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/estimator.scala.html
                    HASH: b191651759fefdb84a85057db88f85ade6a7a56e
                    MATRIX: 1367->310|1440->422|1469->442|1537->446|1738->710|1762->725|1830->729|1881->744|1896->750|1954->786|2090->886|2105->892|2163->927|2264->992|2279->998|2341->1037|2418->1078|2433->1084|2493->1122|2579->1172|2594->1178|2678->1239|2994->1519|3009->1525|3076->1570|3162->1620|3177->1626|3237->1664|3273->1763|3288->1770|3356->1774|3634->2017|3647->2022|3683->2036|3901->2218|3922->2230|3982->2268|4071->2322|4100->2342|4140->2344|4239->2408|4253->2413|4291->2429|4417->2520|4431->2525|4468->2540|4571->2612|4609->2615|4637->2634|4677->2636|4776->2700|4790->2705|4827->2720|4953->2811|4967->2816|5005->2832|5102->2898|5153->2914|5166->2919|5202->2933|5243->322|5271->420|5299->624|5328->708|5356->1677|5385->1761|5413->2935|5444->3067|5482->3069
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|55->34|55->34|55->34|56->35|56->35|56->35|57->43|57->43|59->43|61->45|61->45|61->45|71->55|71->55|71->55|75->59|75->59|75->59|79->63|79->63|79->63|86->70|86->70|86->70|94->78|95->79|95->79|95->79|99->83|99->83|99->83|106->90|106->90|106->90|112->96|113->97|113->97|113->97|115->5|116->10|117->15|119->21|120->36|122->42|123->98|125->104|126->105
                    -- GENERATED --
                */
            