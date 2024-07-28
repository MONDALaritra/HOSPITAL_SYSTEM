<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index page</title>
<style>
	



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
	.paint-card{
		box-shadow: 0 0 10px 0 rgba(0,0,0,0.3);
		background:none;
	}
	
	.medicine{
		background: url(Image/pharmacy.jpg);
		height:450px;
		width:100%;
	}
	.medicine h2{
		text-align:center;
	}
	
	
	.group{
		position:relative;
		height:50px;
		overflow:hidden;
		color:#fff;
		background-color:#333;
		border-top: 4px solid #222;
		border-bottom: 4px solid #222;
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
	
	
	<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-indicators">
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
     <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3" aria-label="Slide 4"></button>
  </div>
  <div class="carousel-inner" style="background:black;">
    <div class="carousel-item " style="height:550px; width:90%; margin-left:5%;">
       <img src="Image/doctor5.jpg" class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item active" style="height:550px; width:90%; margin-left:5%;">
      <img src="Image/doctor6.jpg" class="d-block w-100" alt="..."style="height:550px">
    </div>
    <div class="carousel-item" style="height:550px; width:90%; margin-left:5%;">
      <img src="Image/doctor8.jpg" class="d-block w-100 " alt="..."style="height:550px">
    </div>
    <div class="carousel-item" style="height:550px; width:90%; margin-left:5%;">
      <img src="Image/doctors.jpg" class="d-block w-100" alt="..."style="height:550px">
    </div>
  </div>
  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Previous</span>
  </button>
  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="visually-hidden">Next</span>
  </button>
</div>

<div class="group">
	<p class="text">Welcome to Safe Health Hospital  – Your Partner in Health and Wellness!</p>
</div>


<div class="container p-3">
	<p class="text-center fs-2" >Key Features of our Hospital</p>
	
	<div class="row">
		<div class="col-md-8 p-5">
			<div class="row">
				<div class="col-md-6">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">100% Safety </p>
							<p>It's our promise to provide 100% safety for any treatment.</p>
						</div>
					</div>
				</div>
				<div class="col-md-6">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Clean Environment </p>
							<p>The hospital is totally clean and very much the environment is suitable for patients.</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-6 mt-2">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Friendly Doctors </p>
							<p>We can assure that we have the best doctors who are friendly as well as very much helpful.</p>
						</div>
					</div>
				</div>
				<div class="col-md-6 mt-2">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Medical Research</p>
							<p>Not only for patients the medical students can also do research on our premises</p>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="col-md-4">
			<img src="Image/login-doctor.jpg" alt="" style="height:350px; width:529px">
		</div>
	</div>
</div>
<hr>



<div class="medicine">
	
	<h2>The features of our SAFE HEALTH pharmacy</h2>
	
	
	<div class="row">
		<div class="col-md-12 p-5">
			<div class="row">
				<div class="col-md-4">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Quality Assurance</p>
							<p>Implement strict quality control procedures for all medications.
							Regularly audit and review processes to maintain high standards.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Patient-Centered Services </p>
							<p>Offer personalized medication counseling and support.
							Provide patient education on medication usage, side effects, and interactions.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Safety and Cleanliness</p>
							<p>Maintain a clean and organized environment.
							Ensure proper storage conditions for different types of medications.</p>
						</div>
					</div>
				</div>
				
				<div class="col-md-4 mt-2">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Customer Service </p>
							<p>Ensure friendly and knowledgeable staff are available to assist patients.
H							andle patient inquiries and concerns promptly and professionally.</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mt-2">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Medication Availability</p>
							<p>Stock a comprehensive range of medications, including over-the-counter (OTC) and prescription drugs.
							Ensure availability of specialty medications as neede</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mt-2">
					<div class="card paint-card">
						<div class="card-body">
							<p class="fs-5">Technology Integration</p>
							<p>Utilize electronic health records (EHR) for accurate and efficient prescription processing.
							Implement automated systems for dispensing and managing medications.</p>
						</div>
					</div>
				</div>
			</div>
		</div>
</div>
</div>
<hr>
<div>
	<div class="container p-2">
		<p class="text-center fs-2 ">Our Doctors</p>
		<div class="row">
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor9.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor10.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor11.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor12.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>





<div>
	<div class="container p-2">
		
		<div class="row">
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor13.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO and Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor14.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor15.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img src="Image/doctor16.jpeg" width="250px" height="300px">
						<p class="fw-bold fs-5">Aritra Mondal</p>
						<p class="fs-7"> (CEO & Chairman)</p>	
						<button style="background:blue;padding:10px;color:white;border:none;border-radius:10px">Book Appointment</button>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

<script src="index.js"></script>
<%@include file="component/footer.jsp" %>
	
</body>
</html>