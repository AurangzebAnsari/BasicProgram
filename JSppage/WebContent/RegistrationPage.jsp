<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
#firstdiv {
	position: fixed;
	top: 0;
	left: 0;
	width: 100%;
	height: 100%;
	background-color: #FFEBCD;
}

#seconddiv {
	width: 100%;
	height: 8%;
	top: 5px;
	left: 0;
	margin: 0 auto;
	position: relative;
	background: orange;
}

#thirddiv {
	width: 100%;
	height: 80%;
	top: 1%;
	right: 0%;
	margin: 0 auto;
	position: relative; //
	background-color: #FFEBCD;
	background: Lightgray;
}

h1 {
	color: white;
	text-align: center;
	text-shadow: 2px 2px #FF0000;
}

h2 {
	color: blue;
	text-align: center;
	text-shadow: 2px 2px #FF0000;
}




</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div id="firstdiv">
		<img src="day.jpg" width="900" height="80" />


		<div id="seconddiv">
			<center>
				<h1>Registration Page</h1>
			</center>
		</div>

		<div id="thirddiv">


			<form name="registration" action="servelet" method="post">
				<table bgcolor="00ffff" width="50%" height="70%" align="center"
					cellpadding="5" cellspacing="5">

					<tr>
						<td>First Name</td>
						<td><input type="text" name="txtfname" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><input type="text" name="txtlname" /></td>
					</tr>
					<tr>
						<td>Id</td>
						<td><input type="text" name="txtid" /></td>
					</tr>
					
					<tr>
						<td>Gender</td>
						<td><input type="radio" name="rgender" id="Male" value="Male" /><label
							for="Male">Male</label> <input type="radio" name="rigender"
							id="Female" value="Female" /><label for="Female">Female</label></td>
					</tr>
					<tr>
						<td>Email-Id</td>
						<td><input type="text" name="txtemail" /></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="txtpassword" /></td>
					</tr>
					<tr>
						<td>state</td>
						<td><select name="cmostate"><option value="Andhra Pradesh">Andhra Pradesh</option>
						<option value="Arunachal Pradesh">Arunachal Pradesh</option>
						<option value="Assam">Assam</option>
						<option value="Bihar">Bihar</option>
						<option value="Chhattisgarh">Chhattisgarh</option>
						<option value="Goa">Goa</option>
						<option value="Gujarat">Gujarat</option>
					    <option value="Haryana">Haryana</option>
					    <option value="Himachal Pradesh">Himachal Pradesh</option>
					    <option value="Jammu & Kashmir">Jammu & Kashmir</option>
					    <option value="Jharkhand">Jharkhand</option>
					    <option value="Karnataka">Karnataka</option>
					    <option value="Kerala">Kerala</option>
					    <option value="Madhya Pradesh">Madhya Pradesh</option>
					    <option value="Maharashtra">Maharashtra</option>
					    <option value="Manipur">Manipur</option>
					    <option value="Meghalaya">Meghalaya</option>
					    <option value="Mizoram">Mizoram</option>
					    <option value="Nagaland">Nagaland</option>
					    <option value="Odisha (Orissa)">Odisha (Orissa)</option>
					    <option value="Punjab">Punjab</option>
					    <option value="Rajasthan">Rajasthan</option>
					    <option value="Sikkim">Sikkim</option>
					    <option value="Tamil Nadu">Tamil Nadu</option>
					    <option value="Telangana">Telangana</option>
					    <option value="Tripura">Tripura</option>
					    <option value="Uttar Pradesh">Uttar Pradesh</option>
					    <option value="Uttarakhand">Uttarakhand</option>
					    <option value="West Bengal">West Bengal</option>
					    </select>
					    </td>
					    </tr>
					    <tr>
					    <td>Date Of Borth</td>
					    <td><input type="date" id="myDate"name="dob"></td>
					    </tr>
					    </td>
					    <tr>
					    <td>Address</td>
					    <td><textarea name="txtAddress"></textarea></td>
					    </tr>
					    <tr>
					    <td>Skill</td>
					    <td><input type="checkbox"name="chskill"value="Java"/>Java
					        <input type="checkbox"name="chskill"value="PHP"/>PHP
					        <input type="checkbox"name="chskill"value="C,C++"/>C,C++
					        
					    
					   </td></tr>
					   <tr>
					   <center>
					   <td><input type="submit"name="submit"/></td></center></tr>
					    
					    
						             
						
						
				</table>
			</form>
		</div>

	</div>
</body>
</html>