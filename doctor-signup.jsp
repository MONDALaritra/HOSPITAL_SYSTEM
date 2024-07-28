<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body{
		background: url("Image/login-doctor.jpg");
		background-position-x: bottom;
		background-position-y: 190px;
   		background-size: 55%;
   		background-repeat: no-repeat;
   
	}
	

    .container-doctor-signup{
		position:absolute;
		top:18%;
		left:55%;
		background-color:aliceblue;
		width:500px;
        padding:40px 50px;
        border-radius: 20px;
        box-shadow: 5px 0 8px 7px rgba(0,0,0,0.5);
         height:590px;
         margin-bottom:20px;
	}
	form h1{
		color:#3269a8;
		text-align:center;
	}

     #input1,#input2,#input3,#input4,#input5,#input6{
        width:100%;
        height:45px;
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
     .new_doctor_signup{
    	position:absolute;
    	top:97;
    	left:40%;
        font-size: 16px;
        
    }
    .new_doctor_signup a{
    	text-decoration: none;
    }
    #name{
    	position: absolute;
        left:85%;
        top:22.5%;
        font-size: 18px;
        color:#3269a8;
    }
    #phone{
    	position: absolute;
        left:85%;
        top:56%;
        font-size: 18px;
        color:#3269a8;
    }
    #add{
    	position: absolute;
        left:85%;
        top:67%;
        font-size: 18px;
        color:#3269a8;
    }
    #mail{
        position: absolute;
        left:85%;
        top:34%;
        font-size: 18px;
        color:#3269a8;
    }
    #eye{
        position: absolute;
        left:85%;
        top:78%;
        font-size: 18px;
        color:#3269a8;
    }
    #doc{
    	position: absolute;
        left:85%;
        top:45%;
        font-size: 18px;
        color:#3269a8;
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
	 <div class="container-doctor-signup">
		<form action="DoctorsignupServlet" method="post">
			<h1>SIGNUP</h1><br>
			<div class="infield">
                    <input required type="text" placeholder="Patient name" name="name" id="input1"/>
                    <i class="fa-solid fa-user" id="name"></i>
            </div>
            <div class="infield">
                    <input required type="email" placeholder="Email" name="email" id="input2"/>
                    <i class="fa-solid fa-envelope" id="mail"></i>
           	</div>
           	<div class="infield">
                    <input required type="text" placeholder="Specialist" name="specialist" id="input6"/>
                    <i class="fa-solid fa-stethoscope" id="doc"></i>
           	</div>
           	<div class="infield">
                    <input required type="number" placeholder="Phone number" name="phone" id="input3"/>
                    <i class="fa-solid fa-phone" id="phone"></i>
           	</div>
           	<div class="infield">
                    <input required type="text" placeholder="Address" name="address" id="input4"/>
                    <i class="fa-solid fa-address-book" id="add"></i>
           	</div>
           	<div class="infield">
                    <input required type="password" placeholder="Password" name="password" id="input5"/>
                    <i class="fa-solid fa-eye" id="eye"></i>
           	</div>
           	 <button id="signin">Sign up</button>
           	<p class="new_doctor_signup">Already have an account? <a href="doctorlogin.jsp">Signin</a></p>
		</form>
		
	</div>
	
	<div class="group">
	<p class="text">WELCOME TO  SAFE HEALTH DOCTOR REGISTRATION PANEL, REGISTER YOURSELF TO START THE AMAZING JOURNEY WITH US.</p>
</div>
<script src="index.js"></script>
</body>
</html>