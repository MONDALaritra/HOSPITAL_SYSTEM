<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Doctor login</title>
<style>
	body{
		background: url("Image/login-doctor.jpg");
		background-position-x: bottom;
		background-position-y: 190px;
   		background-size: 55%;
   		background-repeat: no-repeat;
   
	}
	

    .container-doctor{
		position:absolute;
		top:25%;
		left:55%;
		background-color:aliceblue;
		width:500px;
        padding:40px 50px;
        border-radius: 20px;
        box-shadow: 5px 0 8px 7px rgba(0,0,0,0.5);
        height:400px;
	}
	form h1{
		color:#3269a8;
		text-align:center;
	}
      #input1,#input2{
        width:100%;
        height:50px;
        margin-bottom:20px;
        border:none;
        padding:10px;
        font-size: 16px;
        border-radius: 10px;
        border: 1px solid #3269a8;
    }
    #signin{
        margin-left:35%;
        background:#3269a8;
        color:white;
        font-size: 16px;
        padding:10px;
        border-radius: 10px;
        border:none;
        outline:none;
        width:120px;
        cursor: pointer;
    }
    .new_doctor{
    	position:absolute;
    	top:80%;
    	left:40%;
        font-size: 16px;
        
    }
    .new_doctor a{
    	text-decoration: none;
    }
    #mail{
        position: absolute;
        left:85%;
        top:33%;
        font-size: 18px;
        color:#3269a8;
    }
    #eye{
        position: absolute;
        left:85%;
        top:52%;
        font-size: 18px;
        color:#3269a8;
    }
    
    .image{
    	float:right;
    	width:50%;
    	
    }
    .image img{
    position:absolute;
    top:15%;
    	height:500px;
    	width:600px;
    }
    .group{
		position:relative;
		height:70px;
		overflow:hidden;
		color:#3269a8;
		background:transparent;
		border-top: 4px solid #222;
		font-weight:900;
		
	}
	
	.group .text{
		position:absolute;
		margin:5px 0;
		font-size:25px;
		padding:0;
		width:max-content;
		animation: my-animation 24s linear infinite;
	}
</style>
<%@include file="component/allcss.jsp" %>
</head>
<body>
	<%@include file="component/navbar.jsp" %>	
	 <div class="container-doctor">
		<form action="DoctorloginServlet" method="post">
			<h1>SIGNUP</h1><br>
			<div class="infield">
                    <input required type="email" placeholder="Email" name="email" id="input1"/>
                    <i class="fa-solid fa-envelope" id="mail"></i>
            </div>
            <div class="infield">
                    <input required type="password" placeholder="Password" name="password" id="input2"/>
                    <i class="fa-solid fa-eye" id="eye"></i>
           	</div>
           	 <button id="signin">Sign in</button>
           	<p class="new_doctor">Create an account? <a href="doctor-signup.jsp">Signup</a></p>
		</form>
		
	</div>
	
	
	
	<div class="group">
	<p class="text">WELCOME TO  SAFE HEALTH DOCTOR LOGIN PANEL, REGISTER YOURSELF TO START THE AMAZING JOURNEY WITH US.</p>
</div>
<script src="index.js"></script>
</body>
</html>