
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
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.header())),format.raw/*44.21*/("""
	"""),_display_(Seq[Any](/*45.3*/if(id == "wardrobe")/*45.23*/ {_display_(Seq[Any](format.raw/*45.25*/("""
		<table width = "100%">
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*49.7*/views/*49.12*/.html.wardrobe())),format.raw/*49.28*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*56.7*/views/*56.12*/.html.kitchen())),format.raw/*56.27*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
		</table>
		
		
	""")))})),format.raw/*64.3*/("""
	"""),_display_(Seq[Any](/*65.3*/if(id == "kitchen")/*65.22*/ {_display_(Seq[Any](format.raw/*65.24*/("""
		<table width = "100%">
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*69.7*/views/*69.12*/.html.kitchen())),format.raw/*69.27*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
			<tr>
				<td width = "100%">
					"""),_display_(Seq[Any](/*76.7*/views/*76.12*/.html.wardrobe())),format.raw/*76.28*/("""
				</td>
			</tr>
			<tr height = "50px">
			</tr>
		</table>
	""")))})),format.raw/*82.3*/("""	             
"""),_display_(Seq[Any](/*83.2*/views/*83.7*/.html.footer())),format.raw/*83.21*/("""
""")))};
Seq[Any](format.raw/*5.14*/("""
"""),format.raw/*10.3*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*21.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*84.2*/("""
	
"""),format.raw/*90.3*/("""
"""),_display_(Seq[Any](/*91.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render(id:String) = apply(id)
    
    def f:((String) => play.api.templates.Html) = (id) => apply(id)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jan 06 00:13:48 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/estimator.scala.html
                    HASH: 485b56ae578d50a9c44057acf94d9cefae1e0bf4
                    MATRIX: 1367->310|1440->422|1469->442|1537->446|1738->710|1762->725|1830->729|1881->744|1896->750|1954->786|2090->886|2105->892|2163->927|2264->992|2279->998|2341->1037|2418->1078|2433->1084|2493->1122|2579->1172|2594->1178|2678->1239|2994->1519|3009->1525|3076->1570|3162->1620|3177->1626|3237->1664|3273->1763|3288->1770|3356->1774|3393->1776|3406->1781|3442->1795|3480->1798|3509->1818|3549->1820|3648->1884|3662->1889|3700->1905|3826->1996|3840->2001|3877->2016|3980->2088|4018->2091|4046->2110|4086->2112|4185->2176|4199->2181|4236->2196|4362->2287|4376->2292|4414->2308|4511->2374|4562->2390|4575->2395|4611->2409|4652->322|4680->420|4708->624|4737->708|4765->1677|4794->1761|4822->2411|4852->2543|4889->2545
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|48->27|48->27|48->27|55->34|55->34|55->34|56->35|56->35|56->35|57->43|57->43|59->43|60->44|60->44|60->44|61->45|61->45|61->45|65->49|65->49|65->49|72->56|72->56|72->56|80->64|81->65|81->65|81->65|85->69|85->69|85->69|92->76|92->76|92->76|98->82|99->83|99->83|99->83|101->5|102->10|103->15|105->21|106->36|108->42|109->84|111->90|112->91
                    -- GENERATED --
                */
            