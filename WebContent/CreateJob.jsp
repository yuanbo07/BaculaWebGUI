<!doctype html>
<html lang="en">

<head>
<title>Create Job - Bacula Web GUI</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>

<body>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">Bacula Web GUI</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Pool <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="CreatePool.jsp">Create Pool</a></li>
							<li><a href="#">Delete Pool</a></li>
							<li><a href="#">Edit Pool</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">FileSet <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="CreateFileSet.jsp">Create FileSet</a></li>
							<li><a href="#">Delete FileSet</a></li>
							<li><a href="#">Edit FileSet</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Job <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="CreateJob.jsp">Create Job</a></li>
							<li><a href="#">Delete Job</a></li>
							<li><a href="#">Edit Job</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Schedule <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="CreateSchedule.jsp">Create Schedule</a></li>
							<li><a href="#">Delete Schedule</a></li>
							<li><a href="#">Edit Schedule</a></li>
						</ul></li>

					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Client <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="AddClient.jsp">Add Client</a></li>
							<li><a href="#">Delete Client</a></li>
							<li><a href="#">Edit Client</a></li>
						</ul></li>

				</ul>
				<form class="navbar-form navbar-left" role="search">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="Search">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">Login <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">Separated link</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>

	<div class="container">
	
		<div class="page-header">
			<h1>Create a Job</h1>
		</div>

		<form id="form_create_fileset" class="form-horizontal"
				action="createfilesetservlet.do" method="post" novalidate>

		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_name">Job name :</label>
		<input type="text" class="form-control" name="client_name" placeholder="job name"
			required />
		</div>
		</div>

		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_type">Job type :</label>
		<select class="form-control" name="jobType" required>
			<option>Backup</option>
			<option>Restore</option>
		</select>
		</div>
		</div>
		
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_type">Client :</label>
		<select class="form-control" name="client" required>
			<option>Nagios</option>
		</select>
		</div>
		</div>
		
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_type">Storage :</label>
		<select class="form-control" name="storage" required>
			<option>Default</option>
		</select>
		</div>
		</div>
		
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_type">Pool :</label>
		<select class="form-control" name="pool" required>
			<option>File</option>
		</select>
		</div>
		</div>
		
		
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_type">Message type :</label>
		<select class="form-control" name="messageType" required>
			<option>Standard</option>
		</select>
		</div>
		</div>
		
		<div class = "form-group">
		<div class="col-xs-3">
		<label for="pool_name">Location (optional) :</label>
		<input type="text" class="form-control" name="client_name" placeholder="Location"/>
		</div>
		</div>

		<br/>
		<br/>
		<input class = "btn btn-primary" type="submit" id="submit" name="submit_fileset" value="Create" />

		</form>
		</div>
</body>
</html>