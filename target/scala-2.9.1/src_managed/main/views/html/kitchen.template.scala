
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
* Kitchen. This is the kitchen page.                        				   *
*                                                                              *
*******************************************************************************/
object kitchen extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Kitchen. This is the kitchen page.                        				   *
*                                                                              *
*******************************************************************************/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*5.1*/("""<center>
<table>
	<tr height="50px">
		<td width = "100%">
			<div id = "main_header">Kitchen</div>
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
			<div id = "sub_header">Under the slabe</div>
		</td>
	</tr>
	<tr height = "10px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>
		  <form id = "frm_uts" action="#">
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
									   	   Ply & Block board<BR>(Water proof)</BR>
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
									   	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
										   		   <option>1</option>
  												   <option>1.25</option>
  												   <option>1.5</option>
  												   <option>1.75</option>
  												   <option>2</option>
  												   <option>2.25</option>
  												   <option>2.5</option>
  												   <option>2.75</option>
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
  												   <option>20.25</option>
  												   <option>20.5</option>
  												   <option>20.75</option>
  												   <option>21</option>
  												   <option>21.25</option>
  												   <option>21.5</option>
  												   <option>21.75</option>
  												   <option>22</option>
  												   <option>22.25</option>
  												   <option>22.5</option>
  												   <option>22.75</option>
  												   <option>23</option>
  												   <option>23.25</option>
  												   <option>23.5</option>
  												   <option>23.75</option>
  												   <option>24</option>
  												   <option>24.25</option>
  												   <option>24.5</option>
  												   <option>24.75</option>
  												   <option>25</option>
  												   <option>25.25</option>
  												   <option>25.5</option>
  												   <option>25.75</option>
  												   <option>26</option>
  												   <option>26.25</option>
  												   <option>26.5</option>
  												   <option>26.75</option>
  												   <option>27</option>
  												   <option>27.25</option>
  												   <option>27.5</option>
  												   <option>27.75</option>
  												   <option>28</option>
  												   <option>28.25</option>
  												   <option>28.5</option>
  												   <option>28.75</option>
  												   <option>29</option>
  												   <option>29.25</option>
  												   <option>29.5</option>
  												   <option>29.75</option>
  												   <option>30</option>
  												   <option>30.25</option>
  												   <option>30.5</option>
  												   <option>30.75</option>
  												   <option>31</option>
  												   <option>31.25</option>
  												   <option>31.5</option>
  												   <option>31.75</option>
  												   <option>32</option>
  												   <option>32.25</option>
  												   <option>32.5</option>
  												   <option>32.75</option>
  												   <option>33</option>
  												   <option>33.25</option>
  												   <option>33.5</option>
  												   <option>33.75</option>
  												   <option>34</option>
  												   <option>34.25</option>
  												   <option>34.5</option>
  												   <option>34.75</option>
  												   <option>35</option>
  												   <option>35.25</option>
  												   <option>35.5</option>
  												   <option>35.75</option>
  												   <option>36</option>
  												   <option>36.25</option>
  												   <option>36.5</option>
  												   <option>36.75</option>
  												   <option>37</option>
  												   <option>37.25</option>
  												   <option>37.5</option>
  												   <option>37.75</option>
  												   <option>38</option>
  												   <option>38.25</option>
  												   <option>38.5</option>
  												   <option>38.75</option>
  												   <option>39</option>
  												   <option>39.25</option>
  												   <option>39.5</option>
  												   <option>39.75</option>
  												   <option>40</option>
  												   <option>40.25</option>
  												   <option>40.5</option>
  												   <option>40.75</option>
  												   <option>41</option>
  												   <option>41.25</option>
  												   <option>41.5</option>
  												   <option>41.75</option>
  												   <option>42</option>
  												   <option>42.25</option>
  												   <option>42.5</option>
  												   <option>42.75</option>
  												   <option>43</option>
  												   <option>43.25</option>
  												   <option>43.5</option>
  												   <option>43.75</option>
  												   <option>44</option>
  												   <option>44.25</option>
  												   <option>44.5</option>
  												   <option>44.75</option>
  												   <option>45</option>
  												   <option>45.25</option>
  												   <option>45.5</option>
  												   <option>45.75</option>
  												   <option>46</option>
  												   <option>46.25</option>
  												   <option>46.5</option>
  												   <option>46.75</option>
  												   <option>47</option>
  												   <option>47.25</option>
  												   <option>47.5</option>
  												   <option>47.75</option>
  												   <option>48</option>
  												   <option>48.25</option>
  												   <option>48.5</option>
  												   <option>48.75</option>
  												   <option>49</option>
  												   <option>49.25</option>
  												   <option>49.5</option>
  												   <option>49.75</option>
  												   <option>50</option>
										   </select>
									  </td>
								  	  <td id = "table_td">
								  	  	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
  												   <option>2.75</option>
										   </select>
								  	  </td>
									  <td id = "table_td">
									  	    <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsK(this.form, frm_ats, frm_ou);calcAmount(this.form);calcAmount(frm_ats);calcAmount(frm_ou)" id = "combo_box">
										   		   <option>Woodland</option>
												   <option>Century ply</option>
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsK(this.form, frm_ats, frm_ou);calcAmount(this.form);calcAmount(frm_ats);calcAmount(frm_ou)" id = "combo_box">
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "changeOptionsK(this.form, frm_ats, frm_ou);calcAmount(this.form);calcAmount(frm_ats);calcAmount(frm_ou)" id = "combo_box">
												   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco paint</option>
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
			<div id = "sub_header">Above the slabe</div>
		</td>
	</tr>
	<tr height = "10px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>				  
		  <form id = "frm_ats" action="#">
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
									   	   Ply & Block board<BR>(Water proof)</BR>
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
									   	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
										   		   <option>1</option>
  												   <option>1.25</option>
  												   <option>1.5</option>
  												   <option>1.75</option>
  												   <option>2</option>
  												   <option>2.25</option>
  												   <option>2.5</option>
  												   <option>2.75</option>
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
  												   <option>20.25</option>
  												   <option>20.5</option>
  												   <option>20.75</option>
  												   <option>21</option>
  												   <option>21.25</option>
  												   <option>21.5</option>
  												   <option>21.75</option>
  												   <option>22</option>
  												   <option>22.25</option>
  												   <option>22.5</option>
  												   <option>22.75</option>
  												   <option>23</option>
  												   <option>23.25</option>
  												   <option>23.5</option>
  												   <option>23.75</option>
  												   <option>24</option>
  												   <option>24.25</option>
  												   <option>24.5</option>
  												   <option>24.75</option>
  												   <option>25</option>
  												   <option>25.25</option>
  												   <option>25.5</option>
  												   <option>25.75</option>
  												   <option>26</option>
  												   <option>26.25</option>
  												   <option>26.5</option>
  												   <option>26.75</option>
  												   <option>27</option>
  												   <option>27.25</option>
  												   <option>27.5</option>
  												   <option>27.75</option>
  												   <option>28</option>
  												   <option>28.25</option>
  												   <option>28.5</option>
  												   <option>28.75</option>
  												   <option>29</option>
  												   <option>29.25</option>
  												   <option>29.5</option>
  												   <option>29.75</option>
  												   <option>30</option>
  												   <option>30.25</option>
  												   <option>30.5</option>
  												   <option>30.75</option>
  												   <option>31</option>
  												   <option>31.25</option>
  												   <option>31.5</option>
  												   <option>31.75</option>
  												   <option>32</option>
  												   <option>32.25</option>
  												   <option>32.5</option>
  												   <option>32.75</option>
  												   <option>33</option>
  												   <option>33.25</option>
  												   <option>33.5</option>
  												   <option>33.75</option>
  												   <option>34</option>
  												   <option>34.25</option>
  												   <option>34.5</option>
  												   <option>34.75</option>
  												   <option>35</option>
  												   <option>35.25</option>
  												   <option>35.5</option>
  												   <option>35.75</option>
  												   <option>36</option>
  												   <option>36.25</option>
  												   <option>36.5</option>
  												   <option>36.75</option>
  												   <option>37</option>
  												   <option>37.25</option>
  												   <option>37.5</option>
  												   <option>37.75</option>
  												   <option>38</option>
  												   <option>38.25</option>
  												   <option>38.5</option>
  												   <option>38.75</option>
  												   <option>39</option>
  												   <option>39.25</option>
  												   <option>39.5</option>
  												   <option>39.75</option>
  												   <option>40</option>
  												   <option>40.25</option>
  												   <option>40.5</option>
  												   <option>40.75</option>
  												   <option>41</option>
  												   <option>41.25</option>
  												   <option>41.5</option>
  												   <option>41.75</option>
  												   <option>42</option>
  												   <option>42.25</option>
  												   <option>42.5</option>
  												   <option>42.75</option>
  												   <option>43</option>
  												   <option>43.25</option>
  												   <option>43.5</option>
  												   <option>43.75</option>
  												   <option>44</option>
  												   <option>44.25</option>
  												   <option>44.5</option>
  												   <option>44.75</option>
  												   <option>45</option>
  												   <option>45.25</option>
  												   <option>45.5</option>
  												   <option>45.75</option>
  												   <option>46</option>
  												   <option>46.25</option>
  												   <option>46.5</option>
  												   <option>46.75</option>
  												   <option>47</option>
  												   <option>47.25</option>
  												   <option>47.5</option>
  												   <option>47.75</option>
  												   <option>48</option>
  												   <option>48.25</option>
  												   <option>48.5</option>
  												   <option>48.75</option>
  												   <option>49</option>
  												   <option>49.25</option>
  												   <option>49.5</option>
  												   <option>49.75</option>
  												   <option>50</option>
										   </select>
									  </td>
								  	  <td id = "table_td">
								  	  	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
												   <option>2</option>
												   <option>2.25</option>
												   <option>2.5</option>
										   </select>
								  	  </td>
									  <td id = "table_td">
									  	    <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco paint</option>
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
			<div id = "sub_header">Other Unit</div>
		</td>
	</tr>
	<tr height = "10px">
	</tr>
	<tr>
		<td width = "20px";>
		</td>
		<td>				
		  <form id = "frm_ou" action="#">
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
									   	   Ply & Block board<BR>(Water proof)</BR>
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
									   	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
										   		   <option>1</option>
  												   <option>1.25</option>
  												   <option>1.5</option>
  												   <option>1.75</option>
  												   <option>2</option>
  												   <option>2.25</option>
  												   <option>2.5</option>
  												   <option>2.75</option>
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
  												   <option>20.25</option>
  												   <option>20.5</option>
  												   <option>20.75</option>
  												   <option>21</option>
  												   <option>21.25</option>
  												   <option>21.5</option>
  												   <option>21.75</option>
  												   <option>22</option>
  												   <option>22.25</option>
  												   <option>22.5</option>
  												   <option>22.75</option>
  												   <option>23</option>
  												   <option>23.25</option>
  												   <option>23.5</option>
  												   <option>23.75</option>
  												   <option>24</option>
  												   <option>24.25</option>
  												   <option>24.5</option>
  												   <option>24.75</option>
  												   <option>25</option>
  												   <option>25.25</option>
  												   <option>25.5</option>
  												   <option>25.75</option>
  												   <option>26</option>
  												   <option>26.25</option>
  												   <option>26.5</option>
  												   <option>26.75</option>
  												   <option>27</option>
  												   <option>27.25</option>
  												   <option>27.5</option>
  												   <option>27.75</option>
  												   <option>28</option>
  												   <option>28.25</option>
  												   <option>28.5</option>
  												   <option>28.75</option>
  												   <option>29</option>
  												   <option>29.25</option>
  												   <option>29.5</option>
  												   <option>29.75</option>
  												   <option>30</option>
  												   <option>30.25</option>
  												   <option>30.5</option>
  												   <option>30.75</option>
  												   <option>31</option>
  												   <option>31.25</option>
  												   <option>31.5</option>
  												   <option>31.75</option>
  												   <option>32</option>
  												   <option>32.25</option>
  												   <option>32.5</option>
  												   <option>32.75</option>
  												   <option>33</option>
  												   <option>33.25</option>
  												   <option>33.5</option>
  												   <option>33.75</option>
  												   <option>34</option>
  												   <option>34.25</option>
  												   <option>34.5</option>
  												   <option>34.75</option>
  												   <option>35</option>
  												   <option>35.25</option>
  												   <option>35.5</option>
  												   <option>35.75</option>
  												   <option>36</option>
  												   <option>36.25</option>
  												   <option>36.5</option>
  												   <option>36.75</option>
  												   <option>37</option>
  												   <option>37.25</option>
  												   <option>37.5</option>
  												   <option>37.75</option>
  												   <option>38</option>
  												   <option>38.25</option>
  												   <option>38.5</option>
  												   <option>38.75</option>
  												   <option>39</option>
  												   <option>39.25</option>
  												   <option>39.5</option>
  												   <option>39.75</option>
  												   <option>40</option>
  												   <option>40.25</option>
  												   <option>40.5</option>
  												   <option>40.75</option>
  												   <option>41</option>
  												   <option>41.25</option>
  												   <option>41.5</option>
  												   <option>41.75</option>
  												   <option>42</option>
  												   <option>42.25</option>
  												   <option>42.5</option>
  												   <option>42.75</option>
  												   <option>43</option>
  												   <option>43.25</option>
  												   <option>43.5</option>
  												   <option>43.75</option>
  												   <option>44</option>
  												   <option>44.25</option>
  												   <option>44.5</option>
  												   <option>44.75</option>
  												   <option>45</option>
  												   <option>45.25</option>
  												   <option>45.5</option>
  												   <option>45.75</option>
  												   <option>46</option>
  												   <option>46.25</option>
  												   <option>46.5</option>
  												   <option>46.75</option>
  												   <option>47</option>
  												   <option>47.25</option>
  												   <option>47.5</option>
  												   <option>47.75</option>
  												   <option>48</option>
  												   <option>48.25</option>
  												   <option>48.5</option>
  												   <option>48.75</option>
  												   <option>49</option>
  												   <option>49.25</option>
  												   <option>49.5</option>
  												   <option>49.75</option>
  												   <option>50</option>
										   </select>
									  </td>
								  	  <td id = "table_td">
								  	  	   <select onchange = "runTotal(this.form);calcAmount(this.form)" id = "combo_box">
  												   <option>1</option>
  												   <option>1.25</option>
  												   <option>1.5</option>
  												   <option>1.75</option>
  												   <option>2</option>
  												   <option>2.25</option>
  												   <option>2.5</option>
  												   <option>2.75</option>
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
										   </select>
								  	  </td>
									  <td id = "table_td">
									  	    <input id = "text_box_disabled" value = "0.0" readonly = true></input>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td id = "table_td">
									  	   <select onchange = "calcAmount(this.form)" id = "combo_box">
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco paint</option>
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
</table>"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Apr 27 21:58:59 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/kitchen.scala.html
                    HASH: 595478a7ef90ac3607dffaaca45e08ab0ee043fd
                    MATRIX: 1435->312
                    LINES: 36->5
                    -- GENERATED --
                */
            