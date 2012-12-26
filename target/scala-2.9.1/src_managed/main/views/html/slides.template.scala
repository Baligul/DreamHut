
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
* Slides. This is the slider to show all the images on home page.              *
*                                                                              *
*******************************************************************************/
object slides extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Slides. This is the slider to show all the images on home page.              *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.2*/("""<div class="top">
		<div class="bp_all_bg">
			<div id="slider-wrapper">        
				<div id="slider" class="nivoSlider">
					<img src=""""),_display_(Seq[Any](/*9.17*/routes/*9.23*/.Assets.at("images/top.jpg"))),format.raw/*9.51*/("""" />
                	<img src=""""),_display_(Seq[Any](/*10.29*/routes/*10.35*/.Assets.at("images/top2.jpg"))),format.raw/*10.64*/(""""/>
                	<img src=""""),_display_(Seq[Any](/*11.29*/routes/*11.35*/.Assets.at("images/top3.jpg"))),format.raw/*11.64*/(""""/>
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
                    DATE: Thu Dec 27 03:50:11 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/slides.scala.html
                    HASH: c20f17b91fae51b1e5140fcd6fa338260f90ee54
                    MATRIX: 1458->325|1631->463|1645->469|1694->497|1763->530|1778->536|1829->565|1897->597|1912->603|1963->632
                    LINES: 36->5|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11
                    -- GENERATED --
                */
            