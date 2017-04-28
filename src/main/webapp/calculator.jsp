<%@ page %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<form action="/servlet-jsp-demo/calculator" method="post">
	  <div class="form-group">
	    <label for="op1">Operand 1</label>
	    <input type="text" class="form-control" id="op1" 
	    	name="op1" placeholder="Operand 1" value=0>
	  </div>
	  <div class="form-group has-error">
	    <label for="op2">Operand 2</label>
	    <input type="text" class="form-control" id="op2"
	    	name="op2" placeholder="Operand 2" value=0>
	    <span id="helpOp2" class="help-block">Value is mandatory</span>
	  </div>
	  <button type="submit" class="btn btn-default">Submit</button>
	</form>
	<c:if test="${result ne null}">
		<div class="well">${param.op1} + ${param.op2} = ${result}</div>
	</c:if>
  </div>
</div>
</div>
</div>
</body>
</html>
