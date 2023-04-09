<!DOCTYPE html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <title>EatLikeALocal</title>
        <!-- CSS -->  
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">      
        <link rel="stylesheet" type="text/css" href="Home.css">
    </head>
    
  <body style="background: -webkit-radial-gradient(rgb(136, 15, 159), rgb(6, 19, 31));  background: radial-gradient(rgb(136, 15, 159), rgb(6, 19, 31)); background:url(ressources/R.png);">  

      <jsp:include page="Header.jsp"/>
      
      <h1 class="Top-right">Immersive and unforgettable culinary experiences</h1>
                           
                           
                            <br>
                        	<br>
                        	<br>
       
                <!-- Top content -->
        <div class="top-content">
            <div class="inner-bg" style="padding:0px 0px 80px 0;">
                <div class="container">
                    <div class="row" style="margin-left:25%;">
	                            <div class="form-bottom" style="color:white;">
				                    <form role="form" action="" method="post" class="experience-search-form"> 
                                                        <div class="row" >                                                            
				                    	<div class="form-group col-lg-4 ui-widget">
				                    		<label for="from">What are you looking?</label>
				                        	<input required type="text" name="from" placeholder="traditional dish..." class="form-control" id="osearch" style = "height: 50px; weight:500px    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">                                                                
				                        </div>
				              
				                    	<div class="form-group col-lg-4">
				                    		<label for="depart">When are you available?</label>
				                        	<input required type="date" name="select a date" class="form-control" id="form-date" style = "height: 50px;    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 500;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">											
				                        </div>
				                        <div class="form-group col-lg-4">
				                        	<label for="people">Number of guests</label>
				                        	<input required type="number" min="1" max="100" placeholder="Number of People.." name="people" class="form-control" id="form-people"style = "height: 50px; weight:500px    margin: 0;    padding: 0 20px;    vertical-align: middle;    background: #fff;    border: 3px solid #fff;    font-family: 'Roboto', sans-serif;    font-size: 16px;    font-weight: 300;    line-height: 50px;    color: #888;    -moz-border-radius: 4px;    -webkit-border-radius: 4px;    border-radius: 4px;    -moz-box-shadow: none;    -webkit-box-shadow: none;    box-shadow: none;    -o-transition: all .3s;    -moz-transition: all .3s;    -webkit-transition: all .3s;    -ms-transition: all .3s;    transition: all .3s;">
				                        </div>

                                                                        </div>
                                                                        </br>
                                                                        </br>
                                                                        </br>
                                            <div class="container-button">
                                            <button type="submit" class="how_to_search-btn">Search</button>
            </div>                  
										
									</form>
			                    </div>
		                    </div>
                    </div>
                    
                </div>
            </div>
            
        </div>
<br>
<br>
<br>
<br>

                        	
        <jsp:include page="Footer.jsp"/>

   
     
  </body>

</html>


