
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
* Privacy Policy. This is the private policy page.                        						   *
*                                                                              *
*******************************************************************************/
object policy extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Privacy Policy. This is the private policy page.                        						   *
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
							Privacy Policy
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>We at Dreamhutinteriors.com assure to protect your personal information and privacy. We have built our site on the latest technology which will give you the best and safe online experience. Dreamhutinteriors.com is committed to this privacy policy statement and governs data collection and usage.
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_para">
							Getting your personal data
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>Dreamhutinteriors.com collects personally identifiable information, such as your e-mail address, name.
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_para">
							Using your personal data
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>Dreamhutinteriors will use your personal data to contact you if necessary to take your opinion about serving you best and telling you about our latest services and products. We are committed not to share your data with third party in any case other than it is required by law.
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_para">
							Security of your personal data	
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>Dreamhutinteriors.com secures your personal information from unauthorized access, use or disclosure. Dreamhutinteriors.com secures the personally identifiable information you provide on computer servers in a controlled, secure environment, protected from unauthorized access, use or disclosure. When personal information (such as a credit card number) is transmitted to other Web sites, it is protected through the use of encryption, such as the Secure Socket Layer (SSL) protocol.
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_para">
							Alteration of privacy policy
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>Dreamhutinteriors.com may alter/change its privacy policy at times. But before changing our policy we will post a notice about our updated privacy policy on our site.
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div id = "project_list">
							<p>Updated on: January 13, 2013
					</div>
				</td>
			</tr>
	</table>
</center>
</div>
"""),_display_(Seq[Any](/*125.2*/views/*125.7*/.html.footer())),format.raw/*125.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*126.2*/("""
	
"""),format.raw/*132.3*/("""
"""),_display_(Seq[Any](/*133.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/policy.scala.html
                    HASH: 4ed7986058f2ab63b2ca7016c19bdcf7ed3eab6d
                    MATRIX: 1451->427|1480->447|1548->451|1890->856|1914->871|1982->875|2033->890|2048->896|2106->932|2242->1032|2257->1038|2315->1073|2392->1114|2407->1120|2467->1158|2553->1208|2568->1214|2652->1275|2968->1555|2983->1561|3050->1606|3086->1705|3101->1712|3169->1716|3206->1718|3219->1723|3255->1737|5837->4283|5851->4288|5888->4302|5928->425|5956->770|5985->854|6013->1619|6042->1703|6071->4304|6102->4436|6140->4438
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->40|55->40|57->40|58->41|58->41|58->41|142->125|142->125|142->125|144->9|145->14|147->20|148->33|150->39|151->126|153->132|154->133
                    -- GENERATED --
                */
            