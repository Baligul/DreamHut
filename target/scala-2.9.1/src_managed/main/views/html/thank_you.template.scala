
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
* Thank you. This is the thank you page for message.                        						   *
*                                                                              *
*******************************************************************************/
object thank_you extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /*******************************************************************************
* Thank you. This is the thank you page for message.                        						   *
*                                                                              *
*******************************************************************************/
    def apply/*5.2*/(name: String):play.api.templates.Html = {
        _display_ {
def /*11.2*/pageSpecificMetadata/*11.22*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*11.26*/("""
	<meta name="description" content="Dream Hut Interiors is the premier website in India which allows you to estimate the prices of your work online instantly.">
	<meta name="keywords" content="dream, hut, estimator, dream hut, interior, design, furniture, commercial, residential">
	<title>Dream Hut Interiors</title>
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
				<center>
				<table height = "50px">
					<tr>
						<td>
							<div id = "thank_you_text">Thank you """),_display_(Seq[Any](/*47.46*/name)),format.raw/*47.50*/("""! We have received your message and will get back to you very soon.</div>
						</td>
					</tr>
				</table>
				</center>
"""),_display_(Seq[Any](/*52.2*/views/*52.7*/.html.footer())),format.raw/*52.21*/("""
""")))};
Seq[Any](format.raw/*5.16*/("""
"""),format.raw/*10.3*/("""
"""),format.raw/*15.2*/("""

"""),format.raw/*21.3*/("""
"""),format.raw/*34.2*/("""

"""),format.raw/*40.3*/("""
"""),format.raw/*53.2*/("""
	
"""),format.raw/*59.3*/("""
"""),_display_(Seq[Any](/*60.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render(name:String) = apply(name)
    
    def f:((String) => play.api.templates.Html) = (name) => apply(name)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/thank_you.scala.html
                    HASH: 16fa9afd3d24dbac78cddfd00e53b0f4acf35d0e
                    MATRIX: 1409->331|1484->445|1513->465|1581->469|1923->874|1947->889|2015->893|2066->908|2081->914|2139->950|2275->1050|2290->1056|2348->1091|2425->1132|2440->1138|2500->1176|2586->1226|2601->1232|2685->1293|3001->1573|3016->1579|3083->1624|3119->1723|3134->1730|3202->1734|3239->1736|3252->1741|3288->1755|3432->1863|3458->1867|3618->1992|3631->1997|3667->2011|3708->345|3736->443|3764->788|3793->872|3821->1637|3850->1721|3878->2013|3908->2145|3945->2147
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|54->33|54->33|54->33|55->41|55->41|57->41|58->42|58->42|58->42|63->47|63->47|68->52|68->52|68->52|70->5|71->10|72->15|74->21|75->34|77->40|78->53|80->59|81->60
                    -- GENERATED --
                */
            