<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>

<style type="text/css">

.logout{
   float: right;
 }
</style>
</head>
<body>

<script type="text/javascript">
var gender;
var username;
  gender:  ${userbean1.gender}
  username:${userbean1.userName}
</script>
<div>
 <div class="logout">
 
  <form action="${pageContext.request.contextPath}/logout" method="post">
  <h1><input type="submit" value="Logout" /></h1>
  </form>
  </div>
  <h2 style="text-align: center">WELCOME TO DSP HOSPITAL</h2>
           <div class="topnav"  style="text-align: right;background-color: powderblue;">
           <a class="active" href="#home">Home</a>
           <a href="#news">News</a>
           <a href="#contact">Contact</a>
           <a href="#about">About</a>
           </div> 
</div>
  <table>
    <tr>
     ${userbean1.gender} <td> ${userbean1.userName} Thank you for using DSP Hospital </td>
   </tr>
   
   <tr>
      <td>
        <form action="/Hospital_Management/GenareteRecords.html" method="get">
          <input type="submit" id=btncreate  value="Enroll Customer Details"/>
        </form>
      
      </td>
   </tr>
  </table> 
   </body>
</html>