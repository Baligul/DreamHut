
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
* Album. This is the album which contains all the images which we want to show.*
*                                                                              *
*******************************************************************************/
object album extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Album. This is the album which contains all the images which we want to show.*
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*6.1*/("""<div class="album">
    <!-- BED ROOM -->
    <h1>Bed Room</h1>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*11.91*/routes/*11.97*/.Assets.at("images/pic10.jpg"))),format.raw/*11.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*12.58*/routes/*12.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*12.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*16.91*/routes/*16.97*/.Assets.at("images/pic11.jpg"))),format.raw/*16.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*17.58*/routes/*17.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*17.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*21.91*/routes/*21.97*/.Assets.at("images/pic12.jpg"))),format.raw/*21.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*22.58*/routes/*22.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*22.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*26.91*/routes/*26.97*/.Assets.at("images/pic10.jpg"))),format.raw/*26.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*27.58*/routes/*27.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*27.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*31.91*/routes/*31.97*/.Assets.at("images/pic11.jpg"))),format.raw/*31.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*32.58*/routes/*32.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*32.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*36.91*/routes/*36.97*/.Assets.at("images/pic12.jpg"))),format.raw/*36.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*37.58*/routes/*37.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*37.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*41.91*/routes/*41.97*/.Assets.at("images/pic10.jpg"))),format.raw/*41.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*42.58*/routes/*42.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*42.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*46.91*/routes/*46.97*/.Assets.at("images/pic11.jpg"))),format.raw/*46.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*47.58*/routes/*47.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*47.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*51.91*/routes/*51.97*/.Assets.at("images/pic12.jpg"))),format.raw/*51.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*52.58*/routes/*52.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*52.100*/("""">
            </a>
        </div>
    </div>
    <!-- KITCHEN -->
    <h1>Kitchen</h1>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*60.91*/routes/*60.97*/.Assets.at("images/pic10.jpg"))),format.raw/*60.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*61.58*/routes/*61.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*61.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*65.91*/routes/*65.97*/.Assets.at("images/pic11.jpg"))),format.raw/*65.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*66.58*/routes/*66.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*66.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*70.91*/routes/*70.97*/.Assets.at("images/pic12.jpg"))),format.raw/*70.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*71.58*/routes/*71.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*71.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*75.91*/routes/*75.97*/.Assets.at("images/pic10.jpg"))),format.raw/*75.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*76.58*/routes/*76.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*76.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*80.91*/routes/*80.97*/.Assets.at("images/pic11.jpg"))),format.raw/*80.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*81.58*/routes/*81.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*81.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*85.91*/routes/*85.97*/.Assets.at("images/pic11.jpg"))),format.raw/*85.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*86.58*/routes/*86.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*86.100*/("""">
            </a>
        </div>
    </div>
    <!-- LIVING ROOM -->
    <h1>Living Room</h1>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*94.91*/routes/*94.97*/.Assets.at("images/pic10.jpg"))),format.raw/*94.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*95.58*/routes/*95.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*95.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*99.91*/routes/*99.97*/.Assets.at("images/pic11.jpg"))),format.raw/*99.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*100.58*/routes/*100.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*100.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*104.91*/routes/*104.97*/.Assets.at("images/pic12.jpg"))),format.raw/*104.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*105.58*/routes/*105.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*105.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*109.91*/routes/*109.97*/.Assets.at("images/pic10.jpg"))),format.raw/*109.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*110.58*/routes/*110.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*110.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*114.91*/routes/*114.97*/.Assets.at("images/pic11.jpg"))),format.raw/*114.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*115.58*/routes/*115.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*115.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*119.91*/routes/*119.97*/.Assets.at("images/pic12.jpg"))),format.raw/*119.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*120.58*/routes/*120.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*120.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*124.91*/routes/*124.97*/.Assets.at("images/pic10.jpg"))),format.raw/*124.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*125.58*/routes/*125.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*125.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*129.91*/routes/*129.97*/.Assets.at("images/pic11.jpg"))),format.raw/*129.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*130.58*/routes/*130.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*130.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*134.91*/routes/*134.97*/.Assets.at("images/pic12.jpg"))),format.raw/*134.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*135.58*/routes/*135.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*135.100*/("""">
            </a>
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
                    DATE: Tue Dec 25 16:10:07 IST 2012
                    SOURCE: /var/svn/DreamHut/app/views/album.scala.html
                    HASH: 44924e605bf52d76f094bd996ed960be4094cf2a
                    MATRIX: 1457->325|1718->550|1733->556|1786->586|1882->646|1897->652|1956->688|2152->848|2167->854|2220->884|2316->944|2331->950|2390->986|2586->1146|2601->1152|2654->1182|2750->1242|2765->1248|2824->1284|3020->1444|3035->1450|3088->1480|3184->1540|3199->1546|3258->1582|3454->1742|3469->1748|3522->1778|3618->1838|3633->1844|3692->1880|3888->2040|3903->2046|3956->2076|4052->2136|4067->2142|4126->2178|4322->2338|4337->2344|4390->2374|4486->2434|4501->2440|4560->2476|4756->2636|4771->2642|4824->2672|4920->2732|4935->2738|4994->2774|5190->2934|5205->2940|5258->2970|5354->3030|5369->3036|5428->3072|5713->3321|5728->3327|5781->3357|5877->3417|5892->3423|5951->3459|6147->3619|6162->3625|6215->3655|6311->3715|6326->3721|6385->3757|6581->3917|6596->3923|6649->3953|6745->4013|6760->4019|6819->4055|7015->4215|7030->4221|7083->4251|7179->4311|7194->4317|7253->4353|7449->4513|7464->4519|7517->4549|7613->4609|7628->4615|7687->4651|7883->4811|7898->4817|7951->4847|8047->4907|8062->4913|8121->4949|8414->5206|8429->5212|8482->5242|8578->5302|8593->5308|8652->5344|8848->5504|8863->5510|8916->5540|9013->5600|9029->5606|9089->5642|9286->5802|9302->5808|9356->5838|9453->5898|9469->5904|9529->5940|9726->6100|9742->6106|9796->6136|9893->6196|9909->6202|9969->6238|10166->6398|10182->6404|10236->6434|10333->6494|10349->6500|10409->6536|10606->6696|10622->6702|10676->6732|10773->6792|10789->6798|10849->6834|11046->6994|11062->7000|11116->7030|11213->7090|11229->7096|11289->7132|11486->7292|11502->7298|11556->7328|11653->7388|11669->7394|11729->7430|11926->7590|11942->7596|11996->7626|12093->7686|12109->7692|12169->7728
                    LINES: 36->6|41->11|41->11|41->11|42->12|42->12|42->12|46->16|46->16|46->16|47->17|47->17|47->17|51->21|51->21|51->21|52->22|52->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|61->31|61->31|61->31|62->32|62->32|62->32|66->36|66->36|66->36|67->37|67->37|67->37|71->41|71->41|71->41|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|81->51|81->51|81->51|82->52|82->52|82->52|90->60|90->60|90->60|91->61|91->61|91->61|95->65|95->65|95->65|96->66|96->66|96->66|100->70|100->70|100->70|101->71|101->71|101->71|105->75|105->75|105->75|106->76|106->76|106->76|110->80|110->80|110->80|111->81|111->81|111->81|115->85|115->85|115->85|116->86|116->86|116->86|124->94|124->94|124->94|125->95|125->95|125->95|129->99|129->99|129->99|130->100|130->100|130->100|134->104|134->104|134->104|135->105|135->105|135->105|139->109|139->109|139->109|140->110|140->110|140->110|144->114|144->114|144->114|145->115|145->115|145->115|149->119|149->119|149->119|150->120|150->120|150->120|154->124|154->124|154->124|155->125|155->125|155->125|159->129|159->129|159->129|160->130|160->130|160->130|164->134|164->134|164->134|165->135|165->135|165->135
                    -- GENERATED --
                */
            