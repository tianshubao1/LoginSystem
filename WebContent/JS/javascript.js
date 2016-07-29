function checkNum(){
	var num1 = document.getElementById("num1").value;
	var num2 = document.getElementById("num2").value;
	if(num1=="" ||num2==""){
		window.alert("cant be empty");
		return false;
	}
	
	var reg = /^[1-9]\d*(\.[0-9]+)?$|^0$/i;
	if(!reg.test(num1) || !reg.test(num2)){
		window.alert("not a number");
		return false;
	}	
//	window.alert(reg.test(num1));
	
	
}