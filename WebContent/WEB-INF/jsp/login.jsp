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
 
  .topnav a:hover {
      background-color: #ddd;
      color: black;
   }
   
   .date
   {
     text-align:right;
   }
   
   .w3-modal .w3-modal-content .w3-container
   {
    height: 675px;
   }
   
   h2
   {
   font-size: 22px;
   }
   
   .modalText
   {
     text-align: center;
     background-color: lightgoldenrodyellow;
     font-size: 19px;
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

 <div class="header">
  <h1 style="text-align: center"><img src="C:\Users\User\Desktop\plus.jpg" width="42" height="42">WELCOME TO DSP HOSPITAL</h2>
           <div class="topnav"  style="text-align: right;background-color: powderblue;">
            <a class="active" href="#home"  onclick ="document.getElementById('id01').style.display='block'" class="w3-button w3-black">Home</a>
            <a class="active" href="#news"  onclick ="document.getElementById('id02').style.display='block'" class="w3-button w3-black">News</a>
            <a class="active" href="#contact" onclick ="document.getElementById('id03').style.display='block'" class="w3-button w3-black">Contact</a>
            <a class="active" href="#about"   onclick ="document.getElementById('id04').style.display='block'" class="w3-button w3-black">About</a>
           </div> 
            
          
          
   </div>
   
   
   <div class="logout">
          <form action="${pageContext.request.contextPath}/logout" method="post">
           <h1><input type="submit" value="Logout" /></h1>
           </form>
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