$(document).ready(function() {
	var start = 2000;
	var end = new Date().getFullYear();
	var options = "";
	for(var year = start ; year <=end; year++){
	  options += "<option>"+ year +"</option>";
	}
	document.getElementById("year").innerHTML = options;
});
