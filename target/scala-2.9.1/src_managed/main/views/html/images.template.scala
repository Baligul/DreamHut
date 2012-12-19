
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
					<img src=""""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("/images/1.jpg"))),format.raw/*9.50*/("""" />
                	<img src=""""),_display_(Seq[Any](/*10.29*/routes/*10.35*/.Assets.at("/images/2.jpg"))),format.raw/*10.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*11.29*/routes/*11.35*/.Assets.at("/images/3.jpg"))),format.raw/*11.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*12.29*/routes/*12.35*/.Assets.at("/images/4.jpg"))),format.raw/*12.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*13.29*/routes/*13.35*/.Assets.at("/images/5.jpg"))),format.raw/*13.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*14.29*/routes/*14.35*/.Assets.at("/images/6.jpg"))),format.raw/*14.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*15.29*/routes/*15.35*/.Assets.at("/images/7.jpg"))),format.raw/*15.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*16.29*/routes/*16.35*/.Assets.at("/images/8.jpg"))),format.raw/*16.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*17.29*/routes/*17.35*/.Assets.at("/images/9.jpg"))),format.raw/*17.62*/("""" />
                	<img src=""""),_display_(Seq[Any](/*18.29*/routes/*18.35*/.Assets.at("/images/10.jpg"))),format.raw/*18.63*/("""" />
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
                    DATE: Thu Dec 20 00:08:42 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/images.scala.html
                    HASH: 8dfff41709068c924f83919f41f104717c297e5c
                    MATRIX: 1488->340|1661->478|1675->484|1723->511|1792->544|1807->550|1856->577|1925->610|1940->616|1989->643|2058->676|2073->682|2122->709|2191->742|2206->748|2255->775|2324->808|2339->814|2388->841|2457->874|2472->880|2521->907|2590->940|2605->946|2654->973|2723->1006|2738->1012|2787->1039|2856->1072|2871->1078|2921->1106
                    LINES: 36->5|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18
                    -- GENERATED --
                */
            