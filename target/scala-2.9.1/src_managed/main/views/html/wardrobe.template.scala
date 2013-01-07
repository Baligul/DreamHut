
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
* Wardrobe. This is the wardrobe page.                        				   *
*                                                                              *
*******************************************************************************/
object wardrobe extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Wardrobe. This is the wardrobe page.                        				   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.1*/("""<center>
<table>
	<tr height="50px">
		<td width = "100%">
			<div id = "main_header">Wardrobe</div>
		</td>
	</tr>
</table>
</center>

<table>
	<tr height = "50px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>
			<div id = "sub_header">Wardrobe</div>
		</td>
	</tr>
	<tr height = "10px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>
			<form id = "frm_wardrobe" action="#">
   					   <div>
					  		<table id = "table_contents">
								   <tr>
								   	   <th id = "table_th">
									   	   Width(feet)
									   </th>
									   <th id = "table_th">
									   	   Height(feet)
									   </th>
									   <th id = "table_th">
									   	   Square Feet
									   </th>
									   <th id = "table_th">
									   	   Ply & Block board
									   </th>
									   <th id = "table_th">
									   	   Inside
									   </th>
									   <th id = "table_th">
										   Outside
									   </th>
									   <th id = "table_th">
										   Total Amount
									   </th>
								   </tr>
								   <tr height = "10px">
								   </tr>
								   <tr>
								   	   <td id = "table_td">
									   	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 1)" id = "combo_box">
										   		   <option>3</option>
												   <option>3.25</option>
												   <option>3.5</option>
												   <option>3.75</option>
												   <option>4</option>
												   <option>4.25</option>
												   <option>4.5</option>
												   <option>4.75</option>
												   <option>5</option>
												   <option>5.25</option>
												   <option>5.5</option>
												   <option>5.75</option>
												   <option>6</option>
												   <option>6.25</option>
												   <option>6.5</option>
												   <option>6.75</option>
												   <option>7</option>
												   <option>7.25</option>
												   <option>7.5</option>
												   <option>7.75</option>
												   <option>8</option>
												   <option>8.25</option>
												   <option>8.5</option>
												   <option>8.75</option>
												   <option>9</option>
												   <option>9.25</option>
												   <option>9.5</option>
												   <option>9.75</option>
												   <option>10</option>
												   <option>10.25</option>
												   <option>10.5</option>
												   <option>10.75</option>
												   <option>11</option>
												   <option>11.25</option>
												   <option>11.5</option>
												   <option>11.75</option>
												   <option>12</option>
												   <option>12.25</option>
												   <option>12.5</option>
												   <option>12.75</option>
												   <option>13</option>
												   <option>13.25</option>
												   <option>13.5</option>
												   <option>13.75</option>
												   <option>14</option>
												   <option>14.25</option>
												   <option>14.5</option>
												   <option>14.75</option>
												   <option>15</option>
												   <option>15.25</option>
												   <option>15.5</option>
												   <option>15.75</option>
												   <option>16</option>
												   <option>16.25</option>
												   <option>16.5</option>
												   <option>16.75</option>
												   <option>17</option>
												   <option>17.25</option>
												   <option>17.5</option>
												   <option>17.75</option>
												   <option>18</option>
												   <option>18.25</option>
												   <option>18.5</option>
												   <option>18.75</option>
												   <option>19</option>
												   <option>19.25</option>
												   <option>19.5</option>
					 							   <option>19.75</option>
					  							   <option>20</option>
										   </select>
									  </td>
								  	  <td id = "table_td">
								  	  	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 1)" id = "combo_box">
  												   <option>6</option>
												   <option>6.5</option>
												   <option>7</option>
										   </select>
								  	  </td>
									  <td id = "table_td">
									  	   <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsWR(this.form, frm_loft);calculateAmount(this.form, 1);calculateAmount(frm_loft, 2)" id = "combo_box">
										   		   <option>Woodland</option>
												   <option>Century ply</option>
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsWR(this.form, frm_loft);calculateAmount(this.form, 1);calculateAmount(frm_loft, 2)" id = "combo_box">
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsWR(this.form, frm_loft);calculateAmount(this.form, 1);calculateAmount(frm_loft, 2)" id = "combo_box">
												   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
								 </tr>
					  		</table>
   					   </div>
				  </form>
		</td>
	</tr>
</table>

<table>
	<tr height = "20px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>
			<div id = "sub_header">Loft</div>
		</td>
	</tr>
	<tr height = "10px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>
		  <form id = "frm_loft" action="#">
   					   <div>
					  		<table id = "table_contents">
								   <tr>
								   	   <th id = "table_th">
									   	   Width(feet)
									   </th>
									   <th id = "table_th">
									   	   Height(feet)
									   </th>
									   <th id = "table_th">
									   	   Square Feet
									   </th>
									   <th id = "table_th">
									   	   Ply & Block board
									   </th>
									   <th id = "table_th">
									   	   Inside
									   </th>
									   	<th id = "table_th">
										   Outside
									   </th>
									   <th id = "table_th">
										   Total Amount
									   </th>
								   </tr>
								   <tr>
								   	   <td id = "table_td">
									   	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 2)" id = "combo_box">
										   		   <option>3</option>
												   <option>3.25</option>
												   <option>3.5</option>
												   <option>3.75</option>
												   <option>4</option>
												   <option>4.25</option>
												   <option>4.5</option>
												   <option>4.75</option>
												   <option>5</option>
												   <option>5.25</option>
												   <option>5.5</option>
												   <option>5.75</option>
												   <option>6</option>
												   <option>6.25</option>
												   <option>6.5</option>
												   <option>6.75</option>
												   <option>7</option>
												   <option>7.25</option>
												   <option>7.5</option>
												   <option>7.75</option>
												   <option>8</option>
												   <option>8.25</option>
												   <option>8.5</option>
												   <option>8.75</option>
												   <option>9</option>
												   <option>9.25</option>
												   <option>9.5</option>
												   <option>9.75</option>
												   <option>10</option>
												   <option>10.25</option>
												   <option>10.5</option>
												   <option>10.75</option>
												   <option>11</option>
												   <option>11.25</option>
												   <option>11.5</option>
												   <option>11.75</option>
												   <option>12</option>
												   <option>12.25</option>
												   <option>12.5</option>
												   <option>12.75</option>
												   <option>13</option>
												   <option>13.25</option>
												   <option>13.5</option>
												   <option>13.75</option>
												   <option>14</option>
												   <option>14.25</option>
												   <option>14.5</option>
												   <option>14.75</option>
												   <option>15</option>
												   <option>15.25</option>
												   <option>15.5</option>
												   <option>15.75</option>
												   <option>16</option>
												   <option>16.25</option>
												   <option>16.5</option>
												   <option>16.75</option>
												   <option>17</option>
												   <option>17.25</option>
												   <option>17.5</option>
												   <option>17.75</option>
												   <option>18</option>
												   <option>18.25</option>
												   <option>18.5</option>
												   <option>18.75</option>
												   <option>19</option>
												   <option>19.25</option>
												   <option>19.5</option>
					 							   <option>19.75</option>
					  							   <option>20</option>
										   </select>
									  </td>
								  	  <td id = "table_td">
								  	  	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 2)" id = "combo_box">
  												   <option>2</option>
												   <option>2.25</option>
												   <option>2.5</option>
												   <option>2.75</option>
												   <option>3</option>
												   <option>3.25</option>
												   <option>3.5</option>
										   </select>
								  	  </td>
									  <td id = "table_td">
									  	    <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 2)" id = "combo_box">
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 2)" id = "combo_box">
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "runTotal(this.form);calculateAmount(this.form, 2)" id = "combo_box">
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
								 </tr>
						 </table>
				   </div>
				</form>
		</td>
	</tr>
</table>				  			  """))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jan 07 04:48:05 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/wardrobe.scala.html
                    HASH: 4a4c1c7706cb00cd85be6ee4cb6bad40c6716803
                    MATRIX: 1440->314
                    LINES: 36->5
                    -- GENERATED --
                */
            