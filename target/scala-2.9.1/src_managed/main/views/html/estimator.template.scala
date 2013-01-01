
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
* Index. This is the home page.                        						   *
*                                                                              *
*******************************************************************************/
object estimator extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /*******************************************************************************
* Index. This is the home page.                        						   *
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
	<link href=""""),_display_(Seq[Any](/*22.15*/routes/*22.21*/.Assets.at("stylesheets/styles.css"))),format.raw/*22.57*/("""" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*23.63*/routes/*23.69*/.Assets.at("stylesheets/login.css"))),format.raw/*23.104*/("""">
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*24.39*/routes/*24.45*/.Assets.at("javascripts/cufon-yui.js"))),format.raw/*24.83*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*25.39*/routes/*25.45*/.Assets.at("javascripts/Monotype_Corsiva_italic_400.font.js"))),format.raw/*25.106*/(""""></script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#logo')('.box_tit_text');
	</script>
	<script type="text/javascript">
       Cufon.replace ('h1')('h2')('h4')('#header_title')('.box_tit_text');
	</script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*32.39*/routes/*32.45*/.Assets.at("javascripts/jquery-1.4.3.min.js"))),format.raw/*32.90*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*33.39*/routes/*33.45*/.Assets.at("javascripts/jquery.nivo.slider.pack.js"))),format.raw/*33.97*/(""""></script>
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*34.39*/routes/*34.45*/.Assets.at("javascripts/jquery.call.nivo.slider.js"))),format.raw/*34.97*/(""""></script>
	<link href=""""),_display_(Seq[Any](/*35.15*/routes/*35.21*/.Assets.at("stylesheets/nivo-slider.css"))),format.raw/*35.62*/("""" rel="stylesheet" type="text/css" media="screen" />
""")))};def /*43.2*/content/*43.9*/:play.api.templates.Html = {_display_(

Seq[Any](format.raw/*43.13*/("""
"""),_display_(Seq[Any](/*44.2*/views/*44.7*/.html.header())),format.raw/*44.21*/("""
	<div id="signin_button_container" class="signin_button_container">
				<div>
	                <h1><a href="#wardrobe">Wardrobe</a></h1>
	                <h1><a href="#kitchen">Kitchen</a></h1>
	                <h1 id ="wardrobe">Wardrobe</h1><img src ="http://upload.wikimedia.org/wikipedia/commons/d/d6/Sliding-wardrobe.jpg"></img>
				  <form action="#">
   					   <div>
					  		<table>
								   <tr>
								   	   <th>
									   	   Width(feet)
									   </th>
									   <th>
									   	   Height(feet)
									   </th>
									   <th>
									   	   Square Feet
									   </th>
									   <th>
									   	   Ply
									   </th>
									   <th>
									   	   Inside
									   </th>
									   	<th>
										   Outside
									   </th>
								   </tr>
								   <tr>
								   	   <td>
									   	   <select>
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
								  	  <td>
								  	  	   <select>
  												   <option>6</option>
												   <option>6.5</option>
												   <option>7</option>
										   </select>
								  	  </td>
									  <td>
									  	   <input type = "text" width = "125px"></input>
									  </td>
									  <td>
									  	   <select>
										   		   <option>Woodland</option>
												   <option>Century ply</option>
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td>
									  	   <select>
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td>
									  	   <select>
												   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
								 </tr>
					  		</table>
   					   </div>
   					   <div>
					  		<input type="submit" value="submit">
   					   </div>
				  </form>
  		<h1>Loft</h1><img src ="http://upload.wikimedia.org/wikipedia/commons/d/d6/Sliding-wardrobe.jpg"></img>
				  <form action="#">
   					   <div>
					  		<table>
								   <tr>
								   	   <th>
									   	   Width(feet)
									   </th>
									   <th>
									   	   Height(feet)
									   </th>
									   <th>
									   	   Square Feet
									   </th>
									   <th>
									   	   Ply
									   </th>
									   <th>
									   	   Inside
									   </th>
									   	<th>
										   Outside
									   </th>
								   </tr>
								   <tr>
								   	   <td>
									   	   <select>
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
								  	  <td>
								  	  	   <select>
  												   <option>2</option>
												   <option>2.25</option>
												   <option>2.5</option>
												   <option>2.75</option>
												   <option>3</option>
												   <option>3.25</option>
												   <option>3.5</option>
										   </select>
								  	  </td>
									  <td>
									  	   <input type = "text" width = "125px"></input>
									  </td>
									  <td>
									  	   <select>
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td>
									  	   <select>
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td>
									  	   <select>
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
								 </tr>
						 </table>
				   </div>
				   <div>
				   		<input type="submit" value="submit">
				   </div>
				  </form>				   
  		<h1 id="kitchen">Under the slabe</h1><img src ="http://upload.wikimedia.org/wikipedia/commons/d/d6/Sliding-wardrobe.jpg"></img>
				  <form action="#">
   					   <div>
					  		<table>
								   <tr>
								   	   <th>
									   	   Width(feet)
									   </th>
									   <th>
									   	   Height(feet)
									   </th>
									   <th>
									   	   Square Feet
									   </th>
									   <th>
									   	   Ply (Water proof)
									   </th>
									   <th>
									   	   Inside
									   </th>
									   	<th>
										   Outside
									   </th>
								   </tr>
								   <tr>
								   	   <td>
									   	   <select>
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
								  	  <td>
								  	  	   <select>
  												   <option>2.75</option>
										   </select>
								  	  </td>
									  <td>
									  	   <input type = "text" width = "125px"></input>
									  </td>
									  <td>
									  	   <select>
										   		   <option>Woodland</option>
												   <option>Century ply</option>
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td>
									  	   <select>
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td>
									  	   <select>
												   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco Paint</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
								 </tr>
					  		</table>
   					   </div>
   					   <div>
					  		<input type="submit" value="submit">
   					   </div>
				  </form>
  		<h1>Above the slabe</h1><img src ="http://upload.wikimedia.org/wikipedia/commons/d/d6/Sliding-wardrobe.jpg"></img>
				  <form action="#">
   					   <div>
					  		<table>
								   <tr>
								   	   <th>
									   	   Width(feet)
									   </th>
									   <th>
									   	   Height(feet)
									   </th>
									   <th>
									   	   Square Feet
									   </th>
									   <th>
									   	   Ply
									   </th>
									   <th>
									   	   Inside
									   </th>
									   	<th>
										   Outside
									   </th>
								   </tr>
								   <tr>
								   	   <td>
									   	   <select>
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
								  	  <td>
								  	  	   <select>
												   <option>2</option>
												   <option>2.25</option>
												   <option>2.5</option>
										   </select>
								  	  </td>
									  <td>
									  	   <input type = "text" width = "125px"></input>
									  </td>
									  <td>
									  	   <select>
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td>
									  	   <select>
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td>
									  	   <select>
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco Paint</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
								 </tr>
						 </table>
				   </div>
				   <div>
				   		<input type="submit" value="submit">
				   </div>
				  </form>
  		<h1>Other Unit</h1><img src ="http://upload.wikimedia.org/wikipedia/commons/d/d6/Sliding-wardrobe.jpg"></img>
				  <form action="#">
   					   <div>
					  		<table>
								   <tr>
								   	   <th>
									   	   Width(feet)
									   </th>
									   <th>
									   	   Height(feet)
									   </th>
									   <th>
									   	   Square Feet
									   </th>
									   <th>
									   	   Ply
									   </th>
									   <th>
									   	   Inside
									   </th>
									   	<th>
										   Outside
									   </th>
								   </tr>
								   <tr>
								   	   <td>
									   	   <select>
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
								  	  <td>
								  	  	   <select>
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
									  <td>
									  	   <input type = "text" width = "125px"></input>
									  </td>
									  <td>
									  	   <select>
										   		   <option>Woodland</option>
												   <option>Century ply</option>												   
												   <option>Green ply</option>
												   <option>Normal ISI </option>
										   </select>
									  </td>
									  <td>
									  	   <select>
  												   <option>White laminate</option>
												   <option>Design laminate</option>
												   <option>White paint</option>
										   </select>
									  </td>
									  <td>
									  	   <select>
										   		   <option>1mm century laminate</option>
												   <option>4mm veneer with polish</option>
												   <option>Duco Paint</option>
												   <option>MDF moduler doors</option>
										   </select>
									  </td>
								 </tr>
						 </table>
				   </div>
				   <div>
				   		<input type="submit" value="submit">
				   </div>
				  </form>
	            </div>
	</div>
"""),_display_(Seq[Any](/*1159.2*/views/*1159.7*/.html.footer())),format.raw/*1159.21*/("""
""")))};
Seq[Any](format.raw/*9.3*/("""
"""),format.raw/*14.2*/("""

"""),format.raw/*20.3*/("""
"""),format.raw/*36.2*/("""

"""),format.raw/*42.3*/("""
"""),format.raw/*1160.2*/("""
	
"""),format.raw/*1166.3*/("""
"""),_display_(Seq[Any](/*1167.2*/main(pageSpecificMetadata)(pageSpecificCss)(content))))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 02 01:40:55 IST 2013
                    SOURCE: /var/svn/DreamHut/app/views/estimator.scala.html
                    HASH: ad04675e17f38489114763b966aa0d70303678ad
                    MATRIX: 1416->408|1445->428|1513->432|1724->706|1748->721|1816->725|1867->740|1882->746|1940->782|2076->882|2091->888|2149->923|2226->964|2241->970|2301->1008|2387->1058|2402->1064|2486->1125|2802->1405|2817->1411|2884->1456|2970->1506|2985->1512|3059->1564|3145->1614|3160->1620|3234->1672|3296->1698|3311->1704|3374->1745|3451->1885|3466->1892|3534->1896|3571->1898|3584->1903|3620->1917|42547->40807|42562->40812|42600->40826|42640->406|42668->620|42697->704|42725->1799|42754->1883|42784->40828|42816->40960|42855->40962
                    LINES: 35->10|35->10|37->10|41->21|41->21|43->21|44->22|44->22|44->22|45->23|45->23|45->23|46->24|46->24|46->24|47->25|47->25|47->25|54->32|54->32|54->32|55->33|55->33|55->33|56->34|56->34|56->34|57->35|57->35|57->35|58->43|58->43|60->43|61->44|61->44|61->44|1176->1159|1176->1159|1176->1159|1178->9|1179->14|1181->20|1182->36|1184->42|1185->1160|1187->1166|1188->1167
                    -- GENERATED --
                */
            