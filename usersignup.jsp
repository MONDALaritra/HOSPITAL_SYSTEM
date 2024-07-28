<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User signup</title>
<style>
	body{
		background: url("Image/family3.jpg");
		background-position-x: top;
		background-position-y: -15%;
   		background-size: 100%;
   		background-repeat: no-repeat;
   
	}
nav ul{
    width:100%;
    text-align: right;
}

nav ul li{
    display:inline-block;
    list-style:none;
    margin:5px 110px;
}

nav ul li a{
    color:#fff;
    text-decoration: none;
}
    .container-signup{
		position:absolute;
		top:19%;
		left:15%;
		background-color:aliceblue;
		width:500px;
        padding:40px 50px;
        border-radius: 20px;
        box-shadow: 5px 0 8px 7px rgba(0,0,0,0.5);
        height:560px;
	}
	form h1{
		color:#3269a8;
		text-align:center;
		font-weight:900;
	}

      #input1,#input2,#input3,#input4,#input5{
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
    .new_user_signup{
    	position:absolute;
    	top:90%;
    	left:40%;
        font-size: 16px;
        
    }
    .new_user_signup a{
    	text-decoration: none;
    }
    #name{
    	position: absolute;
        left:85%;
        top:24%;
        font-size: 18px;
        color:#3269a8;
    }
    #phone{
    	position: absolute;
        left:85%;
        top:48%;
        font-size: 18px;
        color:#3269a8;
    }
    #add{
    	position: absolute;
        left:85%;
        top:59%;
        font-size: 18px;
        color:#3269a8;
    }
    #mail{
        position: absolute;
        left:85%;
        top:36%;
        font-size: 18px;
        color:#3269a8;
    }
    #eye{
        position: absolute;
        left:85%;
        top:70%;
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
	#pop-up{
    	position:absolute;
    	top:8%;
    	left:67%;
    	background: green;
    	padding:25px 15px;
    	color:white;
    	width:500px;
    	height:80px;
    	font-size:25px;
    	text-align:center;
    	border-radius:5px;
    	z-index:10;
    }	
    #pop-up-failed{
    	position:absolute;
    	top:8%;
    	left:67%;
    	background: crimson;
    	padding:25px 15px;
    	color:white;
    	width:500px;
    	height:80px;
    	font-size:25px;
    	text-align:center;
    	border-radius:5px;
    	z-index:10;
    }
</style>
<%@include file="component/allcss.jsp" %>
</head>
<body>
	<%@include file="component/navbar.jsp" %>	
	<%String register = request.getParameter("registration");
	  
                 if(register != null && register.equals("success")){ %>
                 <div id="pop-up">
         			<p> ✅ Successfully Registered</p>
         		</div>
         		
         <% } %>
         
     <%String error1 = request.getParameter("error");
	  
                 if(error1 != null && error1.equals("1")){ %>
                 <div id="pop-up-failed">
         			<p> ❌ Registration Failed</p>
         		</div>
         		
         <% } %>
	 <div class="container-signup">
		<form action="UsersignupServlet" method="post">
			<h1>SIGNUP</h1><br>
			<div class="infield">
                    <input required type="text" placeholder="Full name" name="name" id="input1"/>
                    <i class="fa-solid fa-user" id="name"></i>
            </div>
            <div class="infield">
                    <input required type="email" placeholder="Email" name="email" id="input2"/>
                    <i class="fa-solid fa-envelope" id="mail"></i>
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
           	<p class="new_user_signup">Already have an account? <a href="userlogin.jsp">Signin</a></p>
		</form>
		
	</div>
	
	<div class="group">
	<p class="text">WELCOME TO  SAFE HEALTH USER REGISTRATION PANEL, REGISTER YOURSELF TO START THE AMAZING HEALTH CHECKUP JOURNEY WITH US</p>
</div>

<script src="index.js"></script>
</body>
</html>