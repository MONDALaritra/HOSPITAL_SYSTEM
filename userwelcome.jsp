<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import = "javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User welcome</title>
<style>
	
	.welcome{
            height:550px;
            width:100%;
            background:url(Image/general-surgeon.jpg);
            background-position-x:center;
            background-size: 100%;
            background-repeat: no-repeat;
        }
        .welcome .one{
            position: absolute;
            top:25%;
            left:15%;
            font-size: 70px;
        }
        .welcome #one{
            color:#1a0d80;
            position: absolute;
            top:24%;
            left:45%;
            font-size: 70px;
            font-weight: 900;
        }
        .welcome .two{
            position: absolute;
            top:35%;
            left:35%;
            font-size: 70px;
        }
        .welcome .three{
            position: absolute;
            top:46%;
            left:25%;
            font-size: 70px;
        }
        .welcome #three{
            color:#1a0d80;
            position: absolute;
            top:45%;
            left:37%;
            font-size: 70px;
            font-weight: 900;
        }
        img{
            width:100px;
            height:100px;
            border-radius:50%;
        }

        .heart,.kidney,.liver, .general,.optometry,.allergy,.anesthe,.dermato,.gastro,.hemato,.neuro,.oncologist,.plastic,.psych,.radio{
        margin:10px;
        background:#d5d8f2;
        padding:20px;
        border-radius:5px;
        box-shadow: 5px 0 6px 5px rgba(0,0,0,0.5);
        color:#3269a8;
        font-size: 19px;
        width:450px;
        }
        
       .section1,.section2,.section3{
        display:flex;
        height:350px;
        padding:50px;
        
       }
       .desc{
            width:40%;
            float:left;
       }
       .photo{
        width:40%;
        float:right;
        margin-top:25px;
       }
       .group{
		position:relative;
		height:50px;
		overflow:hidden;
		color:#fff;
		background-color:#3868ba;
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
	#btn1{
		position:absolute;
		top:125%;
		background:#333;
		color:white;
		padding:12px;
		border-radius:8px;
		border:none;
		outlione:none;
	}
	#btn2{
		position:absolute;
		top:172%;
		background:#333;
		color:white;
		padding:12px;
		border-radius:5px;
		border:none;
		outlione:none;
	}
	#btn3{
		position:absolute;
		top:219%;
		background:#333;
		color:white;
		padding:12px;
		border-radius:5px;
		border:none;
		outlione:none;
	}
	.checkup h2{
		text-align:center;
		color:#1a0d80;
		font-weight:700;
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
<div class="group">
	<p class="text">Welcome  <%=email %>!</p>
	
</div>
	<div class="welcome">
        <h1 class="one">Your Greatest </h1><p id="one">Wealth</p>
        <h1 class="two">Is</h1>
        <h1 class="three">Your </h1><p id="three">Health</p>
    </div>

    <div class="checkup">
        <h2>APPOINTMENT SECTION</h2>
        <div class="section1">
            <div class="heart">
                <section class="desc">
                    <h4>Cardiologist</h4>
                    <a href="heartappointment.jsp"><button id="btn1">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/heart.jpeg">
                </section>
                
                
            </div>
            <div class="kidney">
                <section class="desc">
                    <h4>Kidney specialist</h4>
                <a href="kidneyappointment.jsp"><button id="btn1">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/kidney.jpeg">
                </section>
                
            </div>
            <div class="liver">
                <section class="desc">
                    <h4>Liver specialist</h4>
                    <a href="liverappointment.jsp"><button id="btn1">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/liver.jpeg">
                </section>
                
            </div>
            <div class="general">
                <section class="desc">
                    <h4>General surgeon</h4>
                    <a href="generalAppointment.jsp"><button id="btn1">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/medicine.jpeg">
                </section>
                
            </div>
            <div class="optometry">
                <section class="desc">
                    <h4>Ophthalmologists</h4>
                    <a href="eyeappointment.jsp"><button id="btn1">Book appointment</button></a>
                </section>
               <section class="photo">
                <img src="Image/eyes.jpeg">
               </section>
                
            </div>
        </div>
        <div class="section2">
            <div class="allergy">
                <section class="desc">
                    <h4>Allergists</h4>
                <a href="allergyappointment.jsp"><button id="btn2">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/allergy.jpg">
                </section>
                
            </div>
            <div class="anesthe">
                <section class="desc">
                    <h4>Anesthesiologists</h4>
               <a href="annesthesiaappointment.jsp"><button id="btn2">Book appointment</button></a> 
                </section>
                <section class="photo">
                    <img src="Image/anesthesia.jpeg">
                </section>
                
            </div>
            <div class="dermato">
                <section class="desc">
                    <h4>Dermatologists</h4>
                <a href="dermatoappointment.jsp"><button id="btn2">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/darmatologist.jpeg">
                </section>
                
            </div>
            <div class="gastro">
                <section class="desc">
                    <h4>Gastroenterologists</h4>
                <a href="gastro.jsp"><button id="btn2">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/gastro.jpeg">
                </section>
               
            </div>
            <div class="hemato">
                <section class="desc">
                    <h4>Hematologists</h4>
                <a href="hemato.jsp"><button id="btn2">Book appointment</button></a>
                </section>
                <section class="photo">
                    <img src="Image/hemato.jpeg">
                </section>
                
            </div>
        </div>
       <div class="section3">
        <div class="neuro">
            <section class="desc">
                <h4>Neurologists</h4>
           <a href="neuro.jsp"> <button id="btn3">Book appointment</button></a>
            </section>
            <section class="photo">
                <img src="Image/neuro.jpeg">
            </section>
            
        </div>
        <div class="oncologist">
            <section class="desc">
                <h4>Oncologists</h4>
           <a href="onco.jsp"> <button id="btn3">Book appointment</button></a>
            </section>
            <section class="photo">
                <img src="Image/oncology.jpg">
            </section>
            
        </div>
        <div class="plastic">
            <section class="desc">
                <h4>Plastic Surgeons</h4>
            <a href="plasctic.jsp"><button id="btn3">Book appointment</button></a>
            </section>
            <section class="photo">
                <img src="Image/plastic-sur.jpeg">
            </section>
            
        </div>
        <div class="psych">
            <section class="desc">
                <h4>Psychiatrists</h4>
           <a href="psycho.jsp"> <button id="btn3">Book appointment</button></a>
            </section>
            <section class="photo">
                <img src="Image/psych.jpeg">
            </section>
           
        </div>
        <div class="radio">
            <section class="desc">
                <h4>Radiologist</h4>
            <a href="radiology.jsp"> <button id="btn3">Book appointment</button></a>
            </section>
            <section class="photo">
                <img src="Image/radiology.jpeg">
            </section>
            
        </div>
       </div>
        
    </div>
	
	<%
	} else{
		response.sendRedirect("userlogin.jsp?notlogin=1");
	}
	
	
	
	%>

    <script src="index.js"></script>
    <%@include file="component/footer.jsp" %>
</body>
</html>