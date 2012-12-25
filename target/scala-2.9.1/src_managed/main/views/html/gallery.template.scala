
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
	<meta name="description" content="This is interior website.">
	<meta name="keywords" content="interior, design, furniture, commercial, residential">
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
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*37.39*/routes/*37.45*/.Assets.at("javascripts/jquery.nivo.slider.pack.js"))),format.raw/*37.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*38.39*/routes/*38.45*/.Assets.at("javascripts/jquery.call.nivo.slider.js"))),format.raw/*38.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*39.39*/routes/*39.45*/.Assets.at("javascripts/highslide-with-gallery.js"))),format.raw/*39.96*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*40.39*/routes/*40.45*/.Assets.at("javascripts/main.js"))),format.raw/*40.78*/(""""></script>
""")))};def /*48.2*/content/*48.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*48.13*/("""
"""),_display_(Seq[Any](/*49.2*/views/*49.7*/.html.header())),format.raw/*49.21*/("""
"""),_display_(Seq[Any](/*50.2*/views/*50.7*/.html.album())),format.raw/*50.20*/("""
"""),_display_(Seq[Any](/*51.2*/views/*51.7*/.html.footer())),format.raw/*51.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*41.2*/("""

"""),format.raw/*47.3*/("""
"""),format.raw/*52.2*/("""
	
"""),format.raw/*58.3*/("""
"""),_display_(Seq[Any](/*59.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Dec 25 16:10:07 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/gallery.scala.html
                    HASH: a5a00d05a699e8c0ea165b9c4371b0ddd57b5049
                    MATRIX: 1420->411|1449->431|1517->435|1728->709|1752->724|1820->728|1904->776|1919->782|1977->818|2078->883|2093->889|2150->924|2253->991|2268->997|2329->1036|2408->1079|2423->1085|2483->1123|2569->1173|2584->1179|2668->1240|3102->1638|3117->1644|3184->1689|3270->1739|3285->1745|3359->1797|3445->1847|3460->1853|3534->1905|3620->1955|3635->1961|3708->2012|3794->2062|3809->2068|3864->2101|3900->2200|3915->2207|3983->2211|4020->2213|4033->2218|4069->2232|4106->2234|4119->2239|4154->2252|4191->2254|4204->2259|4240->2273|4280->409|4308->623|4337->707|4365->2114|4394->2198|4422->2275|4452->2407|4489->2409
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|48->26|48->26|48->26|58->36|58->36|58->36|59->37|59->37|59->37|60->38|60->38|60->38|61->39|61->39|61->39|62->40|62->40|62->40|63->48|63->48|65->48|66->49|66->49|66->49|67->50|67->50|67->50|68->51|68->51|68->51|70->9|71->14|73->20|74->41|76->47|77->52|79->58|80->59
                    -- GENERATED --
                */
            