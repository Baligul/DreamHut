
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
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,Html,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(pageSpecificMetadata: Html)(pageSpecificCss: Html)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.68*/("""

<!doctype html> 
<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js ie6 oldie" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js ie7 oldie" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js ie8 oldie" lang="en"> <![endif]-->
<!-- Consider adding an manifest.appcache: h5bp.com/d/Offline -->
<!--[if gt IE 8]><!-->
<html class="no-js" lang="en">
<!--<![endif]-->
<head>
	<meta charset="utf-8">
	"""),_display_(Seq[Any](/*14.3*/pageSpecificMetadata)),format.raw/*14.23*/("""
  	"""),_display_(Seq[Any](/*15.5*/pageSpecificCss)),format.raw/*15.20*/("""
</head>
<body>
	<div id="main">
    	<!-- header -->
    	<table >
    		<tr height= "150px";>
    			<td>
    				<div id="logo">
            			<a href="/home"><span class="logo_span"><img src=""""),_display_(Seq[Any](/*24.67*/routes/*24.73*/.Assets.at("images/logo.jpg"))),format.raw/*24.102*/(""""></span></a>
					</div>
	   			</td>
				<td>	
					<div id="header_title">
            			<a href="/home"><span class="header_title_span">Dream Hut</span><br> <span class="head_content_span">Interiors And Furniture</span></br></a>
					</div>
				</td>
			</tr>
		</table>
    	<div id="border">
		<!-- Start: Container -->
			"""),_display_(Seq[Any](/*36.5*/content)),format.raw/*36.12*/("""
		<!-- End: Container -->
		</div>
	</div>
</body>
</html>"""))}
    }
    
    def render(pageSpecificMetadata:Html,pageSpecificCss:Html,content:Html) = apply(pageSpecificMetadata)(pageSpecificCss)(content)
    
    def f:((Html) => (Html) => (Html) => play.api.templates.Html) = (pageSpecificMetadata) => (pageSpecificCss) => (content) => apply(pageSpecificMetadata)(pageSpecificCss)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 02 01:07:11 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/main.scala.html
                    HASH: a6bd74da7dca79cff9e86893e4f507412c4cbf51
                    MATRIX: 762->1|905->67|1426->553|1468->573|1508->578|1545->593|1779->791|1794->797|1846->826|2212->1157|2241->1164
                    LINES: 27->1|30->1|43->14|43->14|44->15|44->15|53->24|53->24|53->24|65->36|65->36
                    -- GENERATED --
                */
            