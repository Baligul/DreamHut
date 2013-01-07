
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
    <div id = "main_header">Bed Room</div>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*11.91*/routes/*11.97*/.Assets.at("images/pic1.jpg"))),format.raw/*11.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*12.58*/routes/*12.64*/.Assets.at("images/thumb_pic1.jpg"))),format.raw/*12.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*16.91*/routes/*16.97*/.Assets.at("images/pic2.jpg"))),format.raw/*16.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*17.58*/routes/*17.64*/.Assets.at("images/thumb_pic2.jpg"))),format.raw/*17.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*21.91*/routes/*21.97*/.Assets.at("images/pic3.jpg"))),format.raw/*21.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*22.58*/routes/*22.64*/.Assets.at("images/thumb_pic3.jpg"))),format.raw/*22.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*26.91*/routes/*26.97*/.Assets.at("images/pic4.jpg"))),format.raw/*26.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*27.58*/routes/*27.64*/.Assets.at("images/thumb_pic4.jpg"))),format.raw/*27.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*31.91*/routes/*31.97*/.Assets.at("images/pic5.jpg"))),format.raw/*31.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*32.58*/routes/*32.64*/.Assets.at("images/thumb_pic5.jpg"))),format.raw/*32.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*36.91*/routes/*36.97*/.Assets.at("images/pic6.jpg"))),format.raw/*36.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*37.58*/routes/*37.64*/.Assets.at("images/thumb_pic6.jpg"))),format.raw/*37.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*41.91*/routes/*41.97*/.Assets.at("images/pic7.jpg"))),format.raw/*41.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*42.58*/routes/*42.64*/.Assets.at("images/thumb_pic7.jpg"))),format.raw/*42.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*46.91*/routes/*46.97*/.Assets.at("images/pic8.jpg"))),format.raw/*46.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*47.58*/routes/*47.64*/.Assets.at("images/thumb_pic8.jpg"))),format.raw/*47.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*51.91*/routes/*51.97*/.Assets.at("images/pic9.jpg"))),format.raw/*51.126*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*52.58*/routes/*52.64*/.Assets.at("images/thumb_pic9.jpg"))),format.raw/*52.99*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*56.91*/routes/*56.97*/.Assets.at("images/pic10.jpg"))),format.raw/*56.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*57.58*/routes/*57.64*/.Assets.at("images/thumb_pic10.jpg"))),format.raw/*57.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*61.91*/routes/*61.97*/.Assets.at("images/pic11.jpg"))),format.raw/*61.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*62.58*/routes/*62.64*/.Assets.at("images/thumb_pic11.jpg"))),format.raw/*62.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*66.91*/routes/*66.97*/.Assets.at("images/pic12.jpg"))),format.raw/*66.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*67.58*/routes/*67.64*/.Assets.at("images/thumb_pic12.jpg"))),format.raw/*67.100*/("""">
            </a>
        </div>
    </div>
    <!-- KITCHEN -->
    <div id = "main_header">Kitchen</div>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*75.91*/routes/*75.97*/.Assets.at("images/pic13.jpg"))),format.raw/*75.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*76.58*/routes/*76.64*/.Assets.at("images/thumb_pic13.jpg"))),format.raw/*76.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*80.91*/routes/*80.97*/.Assets.at("images/pic14.jpg"))),format.raw/*80.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*81.58*/routes/*81.64*/.Assets.at("images/thumb_pic14.jpg"))),format.raw/*81.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*85.91*/routes/*85.97*/.Assets.at("images/pic15.jpg"))),format.raw/*85.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*86.58*/routes/*86.64*/.Assets.at("images/thumb_pic15.jpg"))),format.raw/*86.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*90.91*/routes/*90.97*/.Assets.at("images/pic16.jpg"))),format.raw/*90.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*91.58*/routes/*91.64*/.Assets.at("images/thumb_pic16.jpg"))),format.raw/*91.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*95.91*/routes/*95.97*/.Assets.at("images/pic17.jpg"))),format.raw/*95.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*96.58*/routes/*96.64*/.Assets.at("images/thumb_pic17.jpg"))),format.raw/*96.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*100.91*/routes/*100.97*/.Assets.at("images/pic18.jpg"))),format.raw/*100.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*101.58*/routes/*101.64*/.Assets.at("images/thumb_pic18.jpg"))),format.raw/*101.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*105.91*/routes/*105.97*/.Assets.at("images/pic19.jpg"))),format.raw/*105.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*106.58*/routes/*106.64*/.Assets.at("images/thumb_pic19.jpg"))),format.raw/*106.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*110.91*/routes/*110.97*/.Assets.at("images/pic20.jpg"))),format.raw/*110.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*111.58*/routes/*111.64*/.Assets.at("images/thumb_pic20.jpg"))),format.raw/*111.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*115.91*/routes/*115.97*/.Assets.at("images/pic21.jpg"))),format.raw/*115.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*116.58*/routes/*116.64*/.Assets.at("images/thumb_pic21.jpg"))),format.raw/*116.100*/("""">
            </a>
        </div>
      </div>
    <!-- LIVING ROOM -->
    <div id = "main_header">Living Room</div>
    <div class="highslide-gallery">
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*124.91*/routes/*124.97*/.Assets.at("images/pic22.jpg"))),format.raw/*124.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*125.58*/routes/*125.64*/.Assets.at("images/thumb_pic22.jpg"))),format.raw/*125.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*129.91*/routes/*129.97*/.Assets.at("images/pic23.jpg"))),format.raw/*129.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*130.58*/routes/*130.64*/.Assets.at("images/thumb_pic23.jpg"))),format.raw/*130.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*134.91*/routes/*134.97*/.Assets.at("images/pic24.jpg"))),format.raw/*134.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*135.58*/routes/*135.64*/.Assets.at("images/thumb_pic24.jpg"))),format.raw/*135.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*139.91*/routes/*139.97*/.Assets.at("images/pic25.jpg"))),format.raw/*139.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*140.58*/routes/*140.64*/.Assets.at("images/thumb_pic25.jpg"))),format.raw/*140.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*144.91*/routes/*144.97*/.Assets.at("images/pic26.jpg"))),format.raw/*144.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*145.58*/routes/*145.64*/.Assets.at("images/thumb_pic26.jpg"))),format.raw/*145.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*149.91*/routes/*149.97*/.Assets.at("images/pic27.jpg"))),format.raw/*149.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*150.58*/routes/*150.64*/.Assets.at("images/thumb_pic27.jpg"))),format.raw/*150.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*154.91*/routes/*154.97*/.Assets.at("images/pic28.jpg"))),format.raw/*154.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*155.58*/routes/*155.64*/.Assets.at("images/thumb_pic28.jpg"))),format.raw/*155.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*159.91*/routes/*159.97*/.Assets.at("images/pic29.jpg"))),format.raw/*159.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*160.58*/routes/*160.64*/.Assets.at("images/thumb_pic29.jpg"))),format.raw/*160.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*164.91*/routes/*164.97*/.Assets.at("images/pic30.jpg"))),format.raw/*164.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*165.58*/routes/*165.64*/.Assets.at("images/thumb_pic30.jpg"))),format.raw/*165.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*169.91*/routes/*169.97*/.Assets.at("images/pic31.jpg"))),format.raw/*169.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*170.58*/routes/*170.64*/.Assets.at("images/thumb_pic31.jpg"))),format.raw/*170.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*174.91*/routes/*174.97*/.Assets.at("images/pic32.jpg"))),format.raw/*174.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*175.58*/routes/*175.64*/.Assets.at("images/thumb_pic32.jpg"))),format.raw/*175.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*179.91*/routes/*179.97*/.Assets.at("images/pic33.jpg"))),format.raw/*179.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*180.58*/routes/*180.64*/.Assets.at("images/thumb_pic33.jpg"))),format.raw/*180.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*184.91*/routes/*184.97*/.Assets.at("images/pic34.jpg"))),format.raw/*184.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*185.58*/routes/*185.64*/.Assets.at("images/thumb_pic34.jpg"))),format.raw/*185.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*189.91*/routes/*189.97*/.Assets.at("images/pic35.jpg"))),format.raw/*189.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*190.58*/routes/*190.64*/.Assets.at("images/thumb_pic35.jpg"))),format.raw/*190.100*/("""">
            </a>
        </div>
        <div class="thumbwrapper">
            <a onclick="return hs.expand(this, galleryOptions2)" class="highslide" href=""""),_display_(Seq[Any](/*194.91*/routes/*194.97*/.Assets.at("images/pic36.jpg"))),format.raw/*194.127*/("""">
                <img title="Enlarge" alt="Enlarge" src=""""),_display_(Seq[Any](/*195.58*/routes/*195.64*/.Assets.at("images/thumb_pic36.jpg"))),format.raw/*195.100*/("""">
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
                    DATE: Mon Jan 07 05:55:07 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/album.scala.html
                    HASH: 2a908336c930a7e8ffc1f9e779114b47431966e7
                    MATRIX: 1457->325|1739->571|1754->577|1806->606|1902->666|1917->672|1974->707|2170->867|2185->873|2237->902|2333->962|2348->968|2405->1003|2601->1163|2616->1169|2668->1198|2764->1258|2779->1264|2836->1299|3032->1459|3047->1465|3099->1494|3195->1554|3210->1560|3267->1595|3463->1755|3478->1761|3530->1790|3626->1850|3641->1856|3698->1891|3894->2051|3909->2057|3961->2086|4057->2146|4072->2152|4129->2187|4325->2347|4340->2353|4392->2382|4488->2442|4503->2448|4560->2483|4756->2643|4771->2649|4823->2678|4919->2738|4934->2744|4991->2779|5187->2939|5202->2945|5254->2974|5350->3034|5365->3040|5422->3075|5618->3235|5633->3241|5686->3271|5782->3331|5797->3337|5856->3373|6052->3533|6067->3539|6120->3569|6216->3629|6231->3635|6290->3671|6486->3831|6501->3837|6554->3867|6650->3927|6665->3933|6724->3969|7030->4239|7045->4245|7098->4275|7194->4335|7209->4341|7268->4377|7464->4537|7479->4543|7532->4573|7628->4633|7643->4639|7702->4675|7898->4835|7913->4841|7966->4871|8062->4931|8077->4937|8136->4973|8332->5133|8347->5139|8400->5169|8496->5229|8511->5235|8570->5271|8766->5431|8781->5437|8834->5467|8930->5527|8945->5533|9004->5569|9201->5729|9217->5735|9271->5765|9368->5825|9384->5831|9444->5867|9641->6027|9657->6033|9711->6063|9808->6123|9824->6129|9884->6165|10081->6325|10097->6331|10151->6361|10248->6421|10264->6427|10324->6463|10521->6623|10537->6629|10591->6659|10688->6719|10704->6725|10764->6761|11081->7041|11097->7047|11151->7077|11248->7137|11264->7143|11324->7179|11521->7339|11537->7345|11591->7375|11688->7435|11704->7441|11764->7477|11961->7637|11977->7643|12031->7673|12128->7733|12144->7739|12204->7775|12401->7935|12417->7941|12471->7971|12568->8031|12584->8037|12644->8073|12841->8233|12857->8239|12911->8269|13008->8329|13024->8335|13084->8371|13281->8531|13297->8537|13351->8567|13448->8627|13464->8633|13524->8669|13721->8829|13737->8835|13791->8865|13888->8925|13904->8931|13964->8967|14161->9127|14177->9133|14231->9163|14328->9223|14344->9229|14404->9265|14601->9425|14617->9431|14671->9461|14768->9521|14784->9527|14844->9563|15041->9723|15057->9729|15111->9759|15208->9819|15224->9825|15284->9861|15481->10021|15497->10027|15551->10057|15648->10117|15664->10123|15724->10159|15921->10319|15937->10325|15991->10355|16088->10415|16104->10421|16164->10457|16361->10617|16377->10623|16431->10653|16528->10713|16544->10719|16604->10755|16801->10915|16817->10921|16871->10951|16968->11011|16984->11017|17044->11053|17241->11213|17257->11219|17311->11249|17408->11309|17424->11315|17484->11351
                    LINES: 36->6|41->11|41->11|41->11|42->12|42->12|42->12|46->16|46->16|46->16|47->17|47->17|47->17|51->21|51->21|51->21|52->22|52->22|52->22|56->26|56->26|56->26|57->27|57->27|57->27|61->31|61->31|61->31|62->32|62->32|62->32|66->36|66->36|66->36|67->37|67->37|67->37|71->41|71->41|71->41|72->42|72->42|72->42|76->46|76->46|76->46|77->47|77->47|77->47|81->51|81->51|81->51|82->52|82->52|82->52|86->56|86->56|86->56|87->57|87->57|87->57|91->61|91->61|91->61|92->62|92->62|92->62|96->66|96->66|96->66|97->67|97->67|97->67|105->75|105->75|105->75|106->76|106->76|106->76|110->80|110->80|110->80|111->81|111->81|111->81|115->85|115->85|115->85|116->86|116->86|116->86|120->90|120->90|120->90|121->91|121->91|121->91|125->95|125->95|125->95|126->96|126->96|126->96|130->100|130->100|130->100|131->101|131->101|131->101|135->105|135->105|135->105|136->106|136->106|136->106|140->110|140->110|140->110|141->111|141->111|141->111|145->115|145->115|145->115|146->116|146->116|146->116|154->124|154->124|154->124|155->125|155->125|155->125|159->129|159->129|159->129|160->130|160->130|160->130|164->134|164->134|164->134|165->135|165->135|165->135|169->139|169->139|169->139|170->140|170->140|170->140|174->144|174->144|174->144|175->145|175->145|175->145|179->149|179->149|179->149|180->150|180->150|180->150|184->154|184->154|184->154|185->155|185->155|185->155|189->159|189->159|189->159|190->160|190->160|190->160|194->164|194->164|194->164|195->165|195->165|195->165|199->169|199->169|199->169|200->170|200->170|200->170|204->174|204->174|204->174|205->175|205->175|205->175|209->179|209->179|209->179|210->180|210->180|210->180|214->184|214->184|214->184|215->185|215->185|215->185|219->189|219->189|219->189|220->190|220->190|220->190|224->194|224->194|224->194|225->195|225->195|225->195
                    -- GENERATED --
                */
            