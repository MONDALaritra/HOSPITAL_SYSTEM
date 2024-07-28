<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User login</title>
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
    .container-login{
		position:absolute;
		top:25%;
		left:15%;
		background-color:aliceblue;
		width:500px;
        padding:40px 50px;
        border-radius: 20px;
        box-shadow: 5px 0 8px 7px rgba(0,0,0,0.5);
        height:420px;
	}
	form h1{
		color:#3269a8;
		text-align:center;
		font-weight:900;
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
    .new_user{
    	position:absolute;
    	top:85%;
    	left:40%;
        font-size: 16px;
        
    }
    .new_user a{
    	text-decoration: none;
    }
    #mail{
        position: absolute;
        left:85%;
        top:32%;
        font-size: 18px;
        color:#3269a8;
    }
    #eye{
        position: absolute;
        left:85%;
        top:49%;
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
	 #pop-up-notlogin{
    	position:absolute;
    	top:10%;
    	left:30%;
    	background: crimson;
    	padding: 15px;
    	color:white;
    	width:500px;
    	height:70px;
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
	<%String notlogin = request.getParameter("notlogin");
	  
                 if(notlogin != null && notlogin.equals("1")){ %>
                 <div id="pop-up-notlogin">
         			<p>❕ You have to login  at first</p>
         		</div>
         		
         <% } %>
	 <div class="container-login">
		<form action="UserloginServlet" method="post">
	
			<h1>SIGN IN</h1><br>
			
			<div class="infield">
                    <input required type="email" placeholder="Email" name="email" id="input1"/>
                    <i class="fa-solid fa-envelope" id="mail"></i>
            </div>
            <div class="infield">
                    <input required type="password" placeholder="Password" name="password" id="input2"/>
                    <i class="fa-solid fa-eye" id="eye"></i>
           	</div>
           	 <button id="signin">Sign in</button>
           	 <% String error = request.getParameter("error");
                 if(error != null && error.equals("1")){ %>
         		<p style="color:red;text-align:center;margin-top:20px;">Invalid email or password </p>
         	
         	<% } %>
           	<p class="new_user">Create an account? <a href="usersignup.jsp">Signup</a></p>
		</form>
		
	</div>
	<div class="group">
	<p class="text">WELCOME TO  SAFE HEALTH USER LOGIN PANEL, LOGIN YOURSELF TO START THE HEALTH CHECKUP.</p>
</div>
<script src="index.js"></script>
</body>
</html>