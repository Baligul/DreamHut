
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
* Index. This is the contact page.                        						   *
*                                                                              *
*******************************************************************************/
object contact extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the contact page.                        						   *
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
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*24.63*/routes/*24.69*/.Assets.at("stylesheets/contact.css"))),format.raw/*24.106*/("""">
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*25.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*26.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
""")))};def /*40.2*/content/*40.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*40.13*/("""
"""),_display_(Seq[Any](/*41.2*/views/*41.7*/.html.header())),format.raw/*41.21*/("""
	<!-- Form Code Start -->
<div>	
<table>
	<tr>
		<td width = "30px">
		</td>
		<td width = "300px">
		<form id="contactus">
			<fieldset >
			<legend>Contact us</legend>
				<div id = "contact_header">
					Dream Hut Interiors
				</div>
				<br/>
				<div id = "contact_para">
					#93, 4th Cross, 4th Main,<br/>
					Sector 7th, HSR Layout, <br/>
					Bangalore-560068,
					<br/>Mob: +91 9535505170
					<br/>Email: dreamhutinterior&#64;gmail.com
				</div>
			</fieldset >
		</form>
		</td>
		<td width = "300px">
		</td>
		<td text-align = "right" width = "400px">
			<form id="contactus" action="/message" method="POST">
				<fieldset >
					<legend>Contact us</legend>
					<div class="short_explanation">* required fields</div>
					<div class="container">
    					<label for="name" >Your Full Name*: </label><br/>
    					<input type="text" name="name" id="name" maxlength="50" /><br/>
    					<span id="contactus_name_errorloc" class="error"></span>
					</div>
					<div class="container">
    					<label for="email" >Email Address*:</label><br/>
    					<input type="text" name="email" id="email" maxlength="50" /><br/>
    					<span id="contactus_email_errorloc" class="error"></span>
					</div>
					<div class="container">
   						<label for="phone" >Phone Number:</label><br/>
    					<input type="text" name="phone" id="phone" maxlength="15" /><br/>
    					<span id="contactus_phone_errorloc" class="error"></span>
					</div>
					<div class="container">
    					<label for="message" >Message:</label><br/>
    					<span id="contactus_message_errorloc" class="error"></span>
    					<textarea rows="10" cols="50" name="message" id="message"></textarea>
					</div>
					<div class="container">
    					<input type="submit" name="Submit" value="Submit" />
					</div>
				</fieldset>
			</form>
		</td>
	</tr>	
</table>
<!-- client-side Form Validations:
Uses the excellent form validation script from JavaScript-coder.com-->

<script type="text/javascript">
// <![CDATA[

    var frmvalidator  = new Validator("contactus");
    frmvalidator.EnableOnPageErrorDisplay();
    frmvalidator.EnableMsgsTogether();
    frmvalidator.addValidation("name","req","Please provide your name");

    frmvalidator.addValidation("email","req","Please provide your email address");

    frmvalidator.addValidation("email","email","Please provide a valid email address");

    frmvalidator.addValidation("message","maxlen=2048","The message is too long!(more than 2KB!)");


    frmvalidator.addValidation("scaptcha","req","Please answer the anti-spam question");
// ]]>
</script>

"""),_display_(Seq[Any](/*123.2*/views/*123.7*/.html.footer())),format.raw/*123.21*/("""
</div>
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*33.2*/("""

"""),format.raw/*39.3*/("""
"""),format.raw/*125.2*/("""
	
"""),format.raw/*131.3*/("""
"""),_display_(Seq[Any](/*132.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 06:56:35 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/contact.scala.html
                    HASH: 36b61f6afd8558595483ed77541979a709f7ff91
                    MATRIX: 1420->411|1449->431|1517->435|1728->709|1752->724|1820->728|1871->743|1886->749|1944->785|2080->885|2095->891|2153->926|2254->991|2269->997|2329->1034|2406->1075|2421->1081|2481->1119|2567->1169|2582->1175|2666->1236|2932->1565|2947->1572|3015->1576|3052->1578|3065->1583|3101->1597|5736->4196|5750->4201|5787->4215|5834->409|5862->623|5891->707|5919->1479|5948->1563|5977->4224|6008->4356|6046->4358
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|48->26|48->26|48->26|55->40|55->40|57->40|58->41|58->41|58->41|140->123|140->123|140->123|143->9|144->14|146->20|147->33|149->39|150->125|152->131|153->132
                    -- GENERATED --
                */
            