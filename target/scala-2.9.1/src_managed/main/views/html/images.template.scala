
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
* Images. This is the slider to show all the images which Tasdeeq wants to show.              *
*                                                                              *
*******************************************************************************/
object images extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Images. This is the slider to show all the images which Tasdeeq wants to show.              *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.2*/("""<div class="top">
		<div class="bp_all_bg">
			<div id="slider-wrapper">        
				<div id="slider" class="nivoSlider">
					<img src=""""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("images/1.jpg"))),format.raw/*9.49*/("""" />
                	<img src=""""),_display_(Seq[Any](/*10.29*/routes/*10.35*/.Assets.at("images/2.jpg"))),format.raw/*10.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*11.29*/routes/*11.35*/.Assets.at("images/3.jpg"))),format.raw/*11.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*12.29*/routes/*12.35*/.Assets.at("images/4.jpg"))),format.raw/*12.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*13.29*/routes/*13.35*/.Assets.at("images/5.jpg"))),format.raw/*13.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*14.29*/routes/*14.35*/.Assets.at("images/6.jpg"))),format.raw/*14.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*15.29*/routes/*15.35*/.Assets.at("images/7.jpg"))),format.raw/*15.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*16.29*/routes/*16.35*/.Assets.at("images/8.jpg"))),format.raw/*16.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*17.29*/routes/*17.35*/.Assets.at("images/9.jpg"))),format.raw/*17.61*/("""" />
                	<img src=""""),_display_(Seq[Any](/*18.29*/routes/*18.35*/.Assets.at("images/10.jpg"))),format.raw/*18.62*/("""" />
				</div>        
			</div>
		</div>
	</div>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Dec 23 18:04:55 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/images.scala.html
                    HASH: cb1829c76e21122461390e75e0e1379c8b9aea96
                    MATRIX: 1488->340|1661->478|1675->484|1722->510|1791->543|1806->549|1854->575|1923->608|1938->614|1986->640|2055->673|2070->679|2118->705|2187->738|2202->744|2250->770|2319->803|2334->809|2382->835|2451->868|2466->874|2514->900|2583->933|2598->939|2646->965|2715->998|2730->1004|2778->1030|2847->1063|2862->1069|2911->1096
                    LINES: 36->5|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18
                    -- GENERATED --
                */
            