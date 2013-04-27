
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
* Index. This is the gallery page.                        						   *
*                                                                              *
*******************************************************************************/
object gallery extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the gallery page.                        						   *
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
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*22.48*/routes/*22.54*/.Assets.at("stylesheets/styles.css"))),format.raw/*22.90*/(""""  media="all" />
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*23.48*/routes/*23.54*/.Assets.at("stylesheets/login.css"))),format.raw/*23.89*/("""" media="screen" />
	<link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*24.48*/routes/*24.54*/.Assets.at("stylesheets/highslide.css"))),format.raw/*24.93*/("""" />
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*25.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*26.39*/routes/*26.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*26.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#album_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*36.39*/routes/*36.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*36.90*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*37.39*/routes/*37.45*/.Assets.at("javascripts/highslide-with-gallery.js"))),format.raw/*37.96*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*38.39*/routes/*38.45*/.Assets.at("javascripts/main.js"))),format.raw/*38.78*/(""""></script>
""")))};def /*46.2*/content/*46.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*46.13*/("""
"""),_display_(Seq[Any](/*47.2*/views/*47.7*/.html.header())),format.raw/*47.21*/("""
"""),_display_(Seq[Any](/*48.2*/views/*48.7*/.html.album())),format.raw/*48.20*/("""
"""),_display_(Seq[Any](/*49.2*/views/*49.7*/.html.footer())),format.raw/*49.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*39.2*/("""

"""),format.raw/*45.3*/("""
"""),format.raw/*50.2*/("""
	
"""),format.raw/*56.3*/("""
"""),_display_(Seq[Any](/*57.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/gallery.scala.html
                    HASH: 20f673755babbfbc492b1bdec292fbc6d546b0dd
                    MATRIX: 1420->411|1449->431|1517->435|1859->840|1883->855|1951->859|2035->907|2050->913|2108->949|2209->1014|2224->1020|2281->1055|2384->1122|2399->1128|2460->1167|2539->1210|2554->1216|2614->1254|2700->1304|2715->1310|2799->1371|3233->1769|3248->1775|3315->1820|3401->1870|3416->1876|3489->1927|3575->1977|3590->1983|3645->2016|3681->2115|3696->2122|3764->2126|3801->2128|3814->2133|3850->2147|3887->2149|3900->2154|3935->2167|3972->2169|3985->2174|4021->2188|4061->409|4089->754|4118->838|4146->2029|4175->2113|4203->2190|4233->2322|4270->2324
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|48->26|48->26|48->26|58->36|58->36|58->36|59->37|59->37|59->37|60->38|60->38|60->38|61->46|61->46|63->46|64->47|64->47|64->47|65->48|65->48|65->48|66->49|66->49|66->49|68->9|69->14|71->20|72->39|74->45|75->50|77->56|78->57
                    -- GENERATED --
                */
            