<html>
<head>
<title>Calculator app</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	  integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<div class="container">
<div class="col-md-6">
<div class="panel panel-default">
  <div class="panel-heading">Calculator</div>
  <div class="panel-body">
	<form action="/servlet-jsp-demo/add" method="post">
	  <div class="form-group">
	    <label for="op1">Operand 1</label>
	    <input type="text" class="form-control" id="op1" 
	    	name="op1" placeholder="Operand 1">
	  </div>
	  <div class="form-group">
	    <label for="op2">Operand 2</label>
	    <input type="text" class="form-control" id="op2"
	    	name="op2" placeholder="Operand 2">
	  </div>
	  <button type="submit" class="btn btn-default">Submit</button>
	</form>
  </div>
</div>
</div>
</div>
</body>
</html>
