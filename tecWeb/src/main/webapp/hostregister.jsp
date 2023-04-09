<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">  
<link rel="stylesheet" type="text/css" href="hostregister.css">
</head>
<body>
<jsp:include page="Header.jsp"/>


 <div class="y" align="center">
 <br>
<br>

<br>
<br>

  <h1>host Registration Form</h1>
  <br>
<br>
  <form enctype="multipart/form-data" action="<%= request.getContextPath() %>/serv" method="post">
   <table style="with: 80%">
    <tr>
     <td>full Name</td>
     <td><input type="text" name="fullName" /></td>
    </tr>
    <tr>
     <td>languagespoken</td>
     <td><input type="text" name="languagespoken" /></td>
    </tr>
    <tr>
     <td>Brandname</td>
     <td><input type="text" name="Brandname" /></td>
    </tr>
    <tr>
     <td>address</td>
     <td><input type="email" name="address" /></td>
    </tr>
    <tr>
     <td>Contact No</td>
     <td><input type="tel" name="contact" /></td>
    </tr>
    <tr>
     <td>city</td>
     <td><input type="text" name="city" /></td>
    </tr>
    <tr>
     <td>Host Venue Location</td>
     <td><input type="file" name="photo" size="50" /></td>
    </tr>
   </table>
   <div class="container-button">
   <input type="submit" class="how_to_search-btn" value="Submit" />
   <br>
<br>

<br>
<br>
<br>
<br>
<br>
<br>

<br>
<br>

   </div>
  </form>
 </div>
 <jsp:include page="Footer.jsp"/>
</body>
</html>