<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Enrollment</title>
</head>
<body>
<div>
 <h1 style="text-align: center"><img src="C:\Users\User\Desktop\plus.jpg" width="42" height="42">${Msg}</h1>
 
   <div class="topnav"  style="text-align: right;background-color: powderblue;">
           <a class="active" href="#home">Home</a>
           <a href="#news">News</a>
           <a href="#contact">Contact</a>
           <a href="#about">About</a>
           </div>
           
</div>  
  <form action="/Hospital_Management/ConfirmRegistration.html" method="post">
    <table>
     <tr>
        <td>
          <h2>${Message}</h2>
          <h3>Please fill the details.</h3>
          <input type="text" id="dob" name="DOB"  placeholder="Enter D.O.B"/>
        </td>
     </tr>
     <tr>
       <td>
          <input type="text" id="address" name="address"  placeholder="Enter address"/>
       </td>
     </tr>
     
     <tr>
       <td>
          <input type="text" id="status" name="maritalStatus"  placeholder="Enter Marital Status"/>
       </td>
     </tr>
     
   </table>
   
      <input type="submit" id="btnContinue" value="Proceed"/>
  </form>
</body>
</html>