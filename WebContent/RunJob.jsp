<!doctype html>
<html lang="en">
<head>
<%@ include file="navbar.jsp" %>
<title>Run job - Bacula Web GUI</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<style type="text/css">
.panel-body{
  overflow-y:scroll;
  width:100%;
}
</style>
</head>
<body>
	<div class="container">

	<%
	ArrayList<String>[] output = (ArrayList<String>[])new ArrayList[2] ;
	ArrayList<String> cmd_output = new ArrayList<String>();
	ArrayList<String> error_output = new ArrayList<String>();
	if(request.getAttribute("cmd_output") != null){
			out.println("<div class=\"page-header\">");
			out.println("<h1>Done</h1>");
			out.println("</div>");
			out.println("<div class=\"alert alert-info\" role=\"alert\">");
			out.println("<span> The run job command has been launched. Check log below for detail. </span>");
			out.println("</div>");

		output = (ArrayList<String>[])request.getAttribute("cmd_output");
		cmd_output = output[0];
		error_output = output[1];
		int i = 0 ;%>
		<div class="panel panel-default">

		<div id="log" class="panel-body" style="min-height: 450px; max-height: 450px;">
		<%
		for(i=0;i<cmd_output.size();i++){
			out.println(cmd_output.get(i)+"<br/>");
		}
		for(i=0;i<error_output.size();i++){
			out.println(error_output.get(i)+"<br/>");
		}%>
		</div>
		</div>
		<%
	}
	else{
	%>
	<div class="page-header">
		<h1>Run job</h1>
	</div>
<form data-toggle="validator" class="form-horizontal" action="runjobservlet" method="post" novalidate>
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="client">Choose a Job to run :</label>
		<select class="form-control" name="job_name" required>
			<% out.println(PrintJSP.printSelectOptionByType("Job")); %>
		</select>
		<br/>			
		</div>
		</div>
	<br/>
	<br/>
	<input class = "btn btn-primary" type="submit" id="submit" name="submit" value="Run" />
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	</form>
		<%} %>
	</div>
		<script type="text/javascript">
		var div = document.getElementById("log");
		div.scrollTop = div.scrollHeight;
	</script>
</body>
</html>