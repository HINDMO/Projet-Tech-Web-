<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">  
<link rel="stylesheet" type="text/css" href="hostregister.css">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Header.jsp"/>
	<div class="y" align="center">
	<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>

		<h1>authentification for users</h1>
		<form action="<%=request.getContextPath()%>/LoginServlet" method="post">
			<table style="with: 100%">
				<tr>
					<td>UserName</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass_word" /></td>
				</tr>

			</table>
			<div class="container-button">
   <input type="submit" class="how_to_search-btn" value="Submit" />
   <br>
   <br><br><br><br>
   <br>
   <br>
   <br><br>
   <br>
   <br>
   <br>
   
   </div>

		</form>
	</div>
	<jsp:include page="Footer.jsp"/>
</body>
</html>