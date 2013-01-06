/*
 * Copyright (c) Dream Hut Interiors
 */
	function runTotal(myForm1) {
		var height = myForm1.elements[0].value;
		var width = myForm1.elements[1].value;
		myForm1.elements[2].value = parseFloat(height) * parseFloat(width);
	}
	
	function changeOptionsWR(myForm1,myForm2) {
		myForm2.elements[3].value = myForm1.elements[3].value;
		myForm2.elements[4].value = myForm1.elements[4].value;
		myForm2.elements[5].value = myForm1.elements[5].value;
	}
	
	function changeOptionsK(myForm1,myForm2,myForm3) {
		myForm2.elements[3].value = myForm1.elements[3].value;
		myForm2.elements[4].value = myForm1.elements[4].value;
		myForm2.elements[5].value = myForm1.elements[5].value;
		myForm3.elements[3].value = myForm1.elements[3].value;
		myForm3.elements[4].value = myForm1.elements[4].value;
		myForm3.elements[5].value = myForm1.elements[5].value;
	}
	
	function calculateAmount(myForm1, option) {
		var selection = 0;
		var height = myForm1.elements[0].value;
		var width = myForm1.elements[1].value;
		var sqft = parseFloat(height) * parseFloat(width);
		
		switch (myForm1.elements[3].value)
  		{
  			case "Woodland":
   				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
  									switch (option)
  										{
  											case 1:
  												selection = 800;
  											break;
  												
  											case 2:
  												selection = 500;  												
  											break;	
  										}
     							break;

  								case "Design laminate":
  									switch (option)
  										{
  											case 1:
  												selection = 815;
  											break;
  												
  											case 2:
												selection = 510;
											break;	
  										}
    							break;
  
  								case "White paint":
  									switch (option)
  										{
  											case 1:
  												selection = 775;
  											break;
  												
  											case 2:
  												selection = 490;
  											break;	
  										}
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 875;
  											break;
  												
  											case 2:
  												selection = 550;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 890;
  											break;
  												
  											case 2:
  												selection = 560;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 850;
  											break;
  												
  											case 2:
  												selection = 540;
  											break;	
  										}
    							break;
  							}   						
    				break;
  
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 925;
  											break;
  												
  											case 2:
  												selection = 600;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection =950;
  											break;
  												
  											case 2:
  												selection = 625;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 900;
  											break;
  												
  											case 2:
  												selection = 590;
  											break;	
  										}
    							break;
  							}   						
    				break;
  				}
    		break;
			
  			case "Century ply":
  			case "Green ply":
   				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 925;
  											break;
  												
  											case 2:
  												selection = 550;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 940;
  											break;
  												
  											case 2:
  												selection = 560;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 900;
  											break;
  												
  											case 2:
  												selection = 540;
  											break;	
  										}
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 1000;
  											break;
  												
  											case 2:
  												selection = 590;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection =1015;
  											break;
  												
  											case 2:
  												selection = 610;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 975;
  											break;
  												
  											case 2:
  												selection = 590;
  											break;	
  										}
    							break;
  							}   						
    				break;
  
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 1050;
  											break;
  												
  											case 2:
  												selection = 650;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 1075;
  											break;
  												
  											case 2:
  												selection = 675;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 1025;
  											break;
  												
  											case 2:
  												selection = 640;
  											break;	
  										}
    							break;
  							}   						
    				break;
  				}
    		break;
  
  			case "Normal ISI":
  				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 770;
  											break;
  												
  											case 2:
  												selection = 485;
 											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 785;
  											break;
  												
  											case 2:
  												selection = 495;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 745;
  											break;
  												
  											case 2:
  												selection = 475;
  											break;	
  										}
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 845;
  											break;
  												
  											case 2:
  												selection = 535;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 860;
  											break;
  												
  											case 2:
  												selection = 545;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 820;
  											break;
  												
  											case 2:
  												selection = 525;
  											break;	
  										}
    							break;
  							}   						
    				break;
  
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 895;
  											break;
  												
  											case 2:
  												selection = 590;
  											break;	
  										}
    							break;

  								case "Design laminate":
   									switch (option)
  										{
  											case 1:
  												selection = 920;
  											break;
  												
  											case 2:
  												selection = 615;
  											break;	
  										}
    							break;
  
  								case "White paint":
   									switch (option)
  										{
  											case 1:
  												selection = 870;
  											break;
  												
  											case 2:
  												selection = 580;
  											break;	
  										}
    							break;
  							}   						
    				break;
  				}
  			break;			
  		}
		
		myForm1.elements[6].value = parseFloat(selection) * parseFloat(sqft);
    }
    
    function calcAmount(myForm1) {
		var selection = 0;
		var height = myForm1.elements[0].value;
		var width = myForm1.elements[1].value;
		var sqft = parseFloat(height) * parseFloat(width);
		
		switch (myForm1.elements[3].value)
  		{
  			case "Woodland":
   				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
  									selection = 875;
     							break;

  								case "Design laminate":
  									selection = 890;
    							break;
  
  								case "White paint":
  									selection = 850;
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 945;
    							break;

  								case "Design laminate":
   									selection = 960;
    							break;
  
  								case "White paint":
   									selection = 925;
    							break;
  							}   						
    				break;
  
  					case "Duco paint":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 1000;
    							break;

  								case "Design laminate":
   									selection = 1015;
    							break;
  
  								case "White paint":
   									selection = 975;
    							break;
  							}   						
    				break;
  
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 975;
    							break;

  								case "Design laminate":
   									selection = 990;
    							break;
  
  								case "White paint":
   									selection = 950;
    							break;
  							}   						
    				break;
  				}
    		break;
			
  			case "Century ply":
  			case "Green ply":
   				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 1000;
    							break;

  								case "Design laminate":
   									selection = 1015;
    							break;
  
  								case "White paint":
   									selection = 975;
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 1070;
    							break;

  								case "Design laminate":
   									selection = 1085;
    							break;
  
  								case "White paint":
   									selection = 1045;
    							break;
  							}   						
    				break;
  
  					case "Duco paint":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 1125;
    							break;

  								case "Design laminate":
   									selection = 1140;
    							break;
  
  								case "White paint":
   									selection = 1100;
    							break;
  							}   						
    				break;
    
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 1100;
    							break;

  								case "Design laminate":
   									selection = 1115;
    							break;
  
  								case "White paint":
   									selection = 1075;
    							break;
  							}   						
    				break;
  				}
    		break;
  
  			case "Normal ISI":
  				switch (myForm1.elements[5].value)
  				{
  					case "1mm century laminate":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 850;
    							break;

  								case "Design laminate":
   									selection = 865;
    							break;
  
  								case "White paint":
   									selection = 825;
    							break;
  							}
    				break;

  					case "4mm veneer with polish":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 920;
    							break;

  								case "Design laminate":
   									selection = 935;
    							break;
  
  								case "White paint":
   									selection = 900;
    							break;
  							}   						
    				break;
  
  					case "Duco paint":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 975;
    							break;

  								case "Design laminate":
   									selection = 990;
    							break;
  
  								case "White paint":
   									selection = 950;
    							break;
  							}   						
    				break;
  
  					case "MDF moduler doors":
  						switch (myForm1.elements[4].value)
  							{
  								case "White laminate":
   									selection = 950;
    							break;

  								case "Design laminate":
   									selection = 965;
    							break;
  
  								case "White paint":
   									selection = 925;
    							break;
  							}   						
    				break;
  				}
  			break;			
  		}
		
		myForm1.elements[6].value = parseFloat(selection) * parseFloat(sqft);
    }