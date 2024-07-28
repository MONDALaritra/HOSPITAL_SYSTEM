<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Neurologist appointment</title>
<style>
	body{
		background:url("Image/neuro-back.jpeg");
		background-position-x:top;
   		background-size: 100%;
   		background-repeat: no-repeat;
	}
	 .neuro-appoint{
		position:absolute;
		top:14%;
		left:15%;
		background:transparent;
		width:500px;
        padding:40px 50px;
        border-radius: 20px;
        box-shadow: 5px 0 8px 7px rgba(0,0,0,0.5);
         height:590px;
         margin-bottom:20px;
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
    
     #name{
    	position: absolute;
        left:85%;
        top:21%;
        font-size: 18px;
        color:#3269a8;
    }
    #phone{
    	position: absolute;
        left:85%;
        top:32%;
        font-size: 18px;
        color:#3269a8;
    }
    #add{
    	position: absolute;
        left:85%;
        top:76%;
        font-size: 18px;
        color:#3269a8;
    }
    #mail{
        position: absolute;
        left:85%;
        top:65%;
        font-size: 18px;
        color:#3269a8;
    }
    #age{
        position: absolute;
        left:85%;
       	top:43%;
        font-size: 18px;
        color:#3269a8;
    }
    #gender{
    	position: absolute;
        left:85%;
        top:54%;
        font-size: 18px;
        color:#3269a8;
    }
     #appointment{
        position:absolute;
        top:85%;
        left:30%;
        background:#3269a8;
        color:white;
        font-size: 16px;
        padding:10px;
        border-radius: 10px;
        border:none;
        outline:none;
        width:200px;
        cursor: pointer;
    }
     #pop-up{
    	position:absolute;
    	top:8%;
    	left:30%;
    	background: green;
    	padding:25px 15px;
    	color:white;
    	width:500px;
    	height:80px;
    	font-size:25px;
    	text-align:center;
    	border-radius:5px;
    	z-index:10;
    	animation: slideDown 1s forwards;
    }	
    #pop-up-failed{
    	position:absolute;
    	top:8%;
    	left:30%;
    	background: crimson;
    	padding:25px 15px;
    	color:white;
    	width:500px;
    	height:80px;
    	font-size:25px;
    	text-align:center;
    	border-radius:5px;
    	z-index:10;
    	animation: slideDown 1s forwards;
    }
    @keyframes slideDown {
    0% {
        transform: translateY(-100%);
        opacity: 0;
    }
    100% {
        transform: translateY(0);
        opacity: 1;
    }
</style>
<%@include file="component/allcss.jsp" %>
</head>
<body>
<%
	HttpSession session1 = request.getSession(false);

	if(session1 != null && session1.getAttribute("email")!=null){
		String email = (String) session1.getAttribute("email");
	
	%>
	<%@include file="component/navbar-login.jsp" %>	
	<%String appointment1 = request.getParameter("appointment");
	  
                 if(appointment1 != null && appointment1.equals("success")){ %>
                 <div id="pop-up">
         			<p> ✅ Your Appointment Is Successful</p>
         		</div>
         		
         <% } %>
         
     <%String error1 = request.getParameter("error");
	  
                 if(error1 != null && error1.equals("1")){ %>
                 <div id="pop-up-failed">
         			<p> ❌ Your Appointment Failed</p>
         		</div>
         		
         <% } %>
	<div class="neuro-appoint">
		<form action="NeuroServlet" method="post">
			<h2>NEUROLOGIST</h2>
			<br>
			<div class="infield">
                    <input required type="text" placeholder="Patient name" name="name" id="input1"/>
                    <i class="fa-solid fa-user" id="name"></i>
            </div>
            <div class="infield">
                    <input required type="number" placeholder="Phone" name="phone" id="input2"/>
                    <i class="fa-solid fa-phone" id="phone"></i>
           	</div>
           	<div class="infield">
                    <input required type="number" placeholder="Patient Age" name="age" id="input3"/>
                    <i class="fa-solid fa-person" id="age"></i>
                    
           	</div>
           	<div class="infield">
           		<select id="input4" name="gender" >
				  <option value="male">Male</option>
				  <option value="female">Female</option>
				 <option value="Other">Others</option>
				</select>
				<i class="fa-solid fa-venus-mars" id="gender"></i>
           	</div>
           	
           	<div class="infield">
                    <input required type="email" placeholder="Email" name="email" id="input5"/>
                    <i class="fa-solid fa-envelope" id="mail"></i>
           	</div>
           	<div class="infield">
                    <input required type="text" placeholder="Address" name="address" id="input6"/>
                    <i class="fa-solid fa-address-book" id="add"></i>
           	</div>
           
           	 <button id="appointment">Book appointment</button>
		</form>
	</div>
	<%
	} else{
		response.sendRedirect("userlogin.jsp?notlogin=1");
	}
	%>
</body>
</html>