
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
  	<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("images/favicon.png"))),format.raw/*15.92*/("""">
  	"""),_display_(Seq[Any](/*16.5*/pageSpecificCss)),format.raw/*16.20*/("""
</head>
<body>
	<div id="main">
    	<!-- header -->
    	<table >
    		<tr height= "150px";>
    			<td>
    				<div id="logo">
            			<a href="/home"><span class="logo_span"><img src=""""),_display_(Seq[Any](/*25.67*/routes/*25.73*/.Assets.at("images/logo.jpg"))),format.raw/*25.102*/(""""></span></a>
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
			"""),_display_(Seq[Any](/*37.5*/content)),format.raw/*37.12*/("""
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
                    DATE: Sat Apr 27 21:58:58 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/main.scala.html
                    HASH: d626059e4c8b97f51ae61332f18f76e096fcdeed
                    MATRIX: 762->1|905->67|1426->553|1468->573|1558->627|1573->633|1627->665|1669->672|1706->687|1940->885|1955->891|2007->920|2373->1251|2402->1258
                    LINES: 27->1|30->1|43->14|43->14|44->15|44->15|44->15|45->16|45->16|54->25|54->25|54->25|66->37|66->37
                    -- GENERATED --
                */
            