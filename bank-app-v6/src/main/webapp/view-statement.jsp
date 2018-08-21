<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="UTF-8">
<title>bank-app</title>
<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body class="container">

	<hr />
	<h1>my-bank</h1>
	<hr />
	<a class="btn btn-sm btn-danger" href="/txr-form.html">Fund
		Transfer</a>
	<a class="btn btn-sm btn-danger" href="/txr-form.html">View
		Statement</a>
	<hr />

	<form action="statement">
		<div class="form-group">
			<label>Select Account:</label> <select class="" name="accNum">
				<option value="1">1</option>
				<option value="2">2</option>
			</select>
			<button class="btn btn-sm btn-primary">View</button>
		</div>
	</form>
	<hr />


	<c:if test="${allTxns ne null }">
		<table class="table table-bordered table-sm">
			<thead>
				<tr>
					<th>Txn-id</th>
					<th>Date</th>
					<th>Amount</th>
					<th>Type</th>
					<th>Closing balance</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="txn" items="${allTxns}">
					<tr>
						<td>${txn.id}</td>
						<td>${txn.date}</td>
						<td>&#8377;${txn.amount}</td>
						<td>${txn.type}</td>
						<td>&#8377;${txn.closing_balance}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:if>



</body>
</html>