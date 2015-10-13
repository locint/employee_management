$().ready(function() {

	var pageLimit=-1;
	
	employeePager(pageLimit);

});
function addEmployee(employee){
	console.log("Add");
	var $employee=employee.getAttribute('href');
	$firstname = $('#firstname').val();
	$lastname = $('#lastname').val();
	$socialid = $('#socialid').val();
	$task = $('#task').val();
	$type = $('#type').val();
	$status = $('#status').val();
	$start = $('#start').val();
	$quit = $('#quit').val();
	var $id = 0;
	try {
		console.log($employee);
		$.ajax({
			
			type: "POST",
			url: '/persons',
			dataType: 'json',
			data: '&FirstName=' + JSON.stringify($firstname).replace (/"/g,'')+'&LastName=' + JSON.stringify($lastname).replace (/"/g,'')+'&SocialID=' + JSON.stringify($socialid).replace (/"/g,''),
			success: function (data) {
				$id=data;
	        },
	        error:function (data) {
	        		console.log(data);
	        }});
	       }

	
	catch(err){
		console.log(err);
		;
		
	}	
	
}
function removeEmployee(employee){
	
	var $employee=employee.getAttribute('href');
	try {
		console.log($employee);
		$.ajax({
			
			type: "GET",
			headers: { 
			      "Content-Type": "application/json",
			      "X-HTTP-Method-Override": "DELETE" },
			url: '/persons/'+$employee,
			dataType: 'json',
			contentType: "text/html;charset=UTF-8,application/json",
			success: function (data) {
				employeePager();
	        },
	        error:function (data) {
	        		console.log(data);
	        }});
	       }

	
	catch(err){
		console.log(err);
		;
		
	}
}
function employeePager(pageLimit){

	var tbody = $('#employeeTable').find('tbody');
	tbody.html("");

	
	try {
	
		$.ajax({
			type: "GET",
			url: '/persons',
			dataType: 'json',
			contentType: "application/json; charset=utf-8",
			success: function (data) {
				
				//console.log(data[0].FirstName);
				$.each(data, function(i, dat ) {
					
					
	            	$("#employeeTable").append($("<tr><td><input type='text' name='id' value="+dat.id+"><td>"
	           			 +"<td><input type='text' name='firstname' value="+dat.firstname+"><td>"
	           			 +"<td><input type='text' name='lastname' value="+dat.lastname+"><td>"
	           			 +"<td><input type='text' name='socialid' value="+dat.socialid+"><td>"
	           			 +"<td><a href='"+dat.id+"' class='btn btn btn-default' onclick='removeEmployee(this)' id='fwfw' class='demo5'data-toggle='modal'>Poista</a></td></tr>"
					
	            	));
				});
	        },
	        error:function (data) {
	        		console.log(data);
	        }});
	       }

	
	catch(err){
		console.log(err);
		;
		
	}
}
function findByName(){

	
	try {
		$name = $('#name').val();
		
		$.ajax({
			type: "GET",
			url: '/persons/find2/'+$name,
			dataType: 'json',
			contentType: "application/json; charset=utf-8",
			success: function (data) {

	        },
	        error:function (data) {
	        		console.log(data);
	        }});
	       }

	
	catch(err){
		console.log(err);
		;
		
	}
}


