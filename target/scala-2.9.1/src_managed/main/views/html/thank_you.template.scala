
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
                    DATE: Mon Jan 07 05:04:15 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/thank_you.scala.html
                    HASH: bbd938a8c5a73f8246450a9e434df461dda6a792
                    MATRIX: 1409->331|1484->445|1513->465|1581->469|1782->733|1806->748|1874->752|1925->767|1940->773|1998->809|2134->909|2149->915|2207->950|2284->991|2299->997|2359->1035|2445->1085|2460->1091|2544->1152|2860->1432|2875->1438|2942->1483|2978->1582|2993->1589|3061->1593|3098->1595|3111->1600|3147->1614|3291->1722|3317->1726|3477->1851|3490->1856|3526->1870|3567->345|3595->443|3623->647|3652->731|3680->1496|3709->1580|3737->1872|3767->2004|3804->2006
                    LINES: 33->5|35->11|35->11|37->11|41->22|41->22|43->22|44->23|44->23|44->23|45->24|45->24|45->24|46->25|46->25|46->25|47->26|47->26|47->26|54->33|54->33|54->33|55->41|55->41|57->41|58->42|58->42|58->42|63->47|63->47|68->52|68->52|68->52|70->5|71->10|72->15|74->21|75->34|77->40|78->53|80->59|81->60
                    -- GENERATED --
                */
            