<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">
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
   
   
   .w3-button w3-display-topright
   {
     
   }
   
   
   

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title>DFS HOSPITAL MANAGEMENT SYSTEM</title>
<link href="/WEB-INF/assets/css/main.css" rel="stylesheet" type="text/css"/>
</head>
<body>
  
  <div class="header">
 <h1 style="text-align: center"><img src="C:\Users\User\Desktop\plus.jpg" width="42" height="42">DFS HOSPITAL SYSTEM</h1>
          <div class="topnav"  style="text-align: right;background-color: powderblue;">
           <a class="active" href="#home"  onclick ="document.getElementById('id01').style.display='block'" class="w3-button w3-black">Home</a>
           <a href="#news">News</a>
           <a href="#contact">Contact</a>
           <a href="#about">About</a>
           </div> 
           
             <div id="id01" class="w3-modal">
               <div class="w3-modal-content">
                 <div class="w3-container">
                   <span onclick="document.getElementById('id01').style.display='none'" class="w3-button w3-display-topright">X</span>
                   <p class="modalText">DFS HOME</p>
                 </div>
                </div>
              </div>
            </div>
   
   <div class="date" id="dateSystem"></div>
           
 <h2>${Message}</h2>
<form:errors path="userId" cssClass="error" />
 <form action="/Hospital_Management/userlogin.html" method="post" name="HospMan" onsubmit="return validate_form()">
   
   <select name="gender">
      <option value="Male" >Male</option>
      <option value="Female">Female</option>
  </select>
   
   <table>
     <tr>
        <td>
          <input type="text" id="uname" name="userId"  placeholder="enter userId"  required >
          
        </td>
     </tr>
     <tr>
       <td>
          <input type="text" id="name" name="userName"  placeholder="enter user name" required>
      </td>
     </tr>
     
   </table>
    
       <input type="submit" value="Continue" id="btncontinue">
       </form>
       
       <script>
        var date=document.getElementById("dateSystem").innerHTML = Date();
       
         
         
         
         function validate_form()
         {
        	 var x = document.forms["HospMan"]["userId"].value;
        	 
        	 var y= document.forms["HospMan"]["userName"].value;
        	 
        	 var splChars = "*|,\":<>[]{}`\';()@&$#%";
        	 //var count = $("#uname").value.length;
        	 for(var i=0;i<x.length;i++)
        		 {
        		   if(splChars.indexOf(x.charAt(i)) != -1)
        			   {
        			     alert("Special Characters are not allowed. Please Enter Numeric values");
        			     return false;
        			   }
        		 } // use of spclchrc for userId
        	 
        	 for(var i=0;i<y.length;i++)
        	{
        	   if(splChars.indexOf(y.charAt(i)) != -1)
        	      {
        		   alert("Special Characters are not allowed. Please Enter Numeric alphabets");
        		    return false;
        		  }
        	} // use of spclchrc for userName
        	 
         }
        
        </script>
       
</body>
</html>
