<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="NewFile.css">
		<title>identification</title>
	</head>

	<body>
		<h1>Identification</h1>




		<div class="wrap-login">
			<form class="login-form">
				<span class="login-form-title">
					Welcome back!
				</span> <br>
				<div>
					<button class="img">
						<img  src="resources/Facebook.png" alt="Facebook login" width="50px" heigth="10px">
					Log in with Facebook
					</button> <br></div>
					<div>
					<button class="img">
<img src="resources/gg.png" alt="Facebook login" width="30px" heigth="8px" padding-right="10px">					  Log in with Google
					</button> 
					<br>
					</div>
				
				
				<div class="wrap-input100 validate-input m-b-20" data-validate="Enter username or email">
					<label id="label-1">Your email*:
					</label>
					<input class="email" type="email" name="Email" placeholder="email">
					<span class="focus-input100"></span>
				</div>
				<div class="wrap-input100 validate-input m-b-25" data-validate="Enter password">
					<label id="label-1">Password*:</label>
					<input class="email" type="password" name="pass" placeholder="password">
					<span class="focus-input100"></span>
				</div>
				<div class="checkbox"> 
					<input type="checkbox" name="rememberme" value="Remember me">
						<label id="checkbox-2">Remember me</label>
				</div>

				<div class="container-login100-form-btn">
					<button class="login100-form-btn">
						<a href="">S'identifier</a>
					</button>
				</div>
			</form> 
			<hr>
		</div>
		<div style="clear:both;"></div>

	</body>

	</html>