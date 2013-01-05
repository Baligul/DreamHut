/*
 * Copyright (c) Dream Hut Interiors
 */
	function runTotal(myForm1) {
		var height = myForm1.elements[0].value;
		var width = myForm1.elements[1].value;
		myForm1.elements[2].value = parseFloat(height)* parseFloat(width);
		myForm1.elements[6].value = myForm1.elements[2].value * 2;
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
	
	function calculateAmountWR(myForm1,myForm2) {
		myForm1.elements[6].value = 4.5;
		
	}
	
	function calculateAmountK(myForm1,myForm2,myForm3) {
		myForm1.elements[6].value = myForm1.elements[2].value * 2;
		myForm2.elements[6].value = myForm2.elements[2].value * 2;
		myForm3.elements[6].value = myForm3.elements[2].value * 2;
	}