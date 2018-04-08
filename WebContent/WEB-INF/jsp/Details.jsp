<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
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
   .modal-content{
         position: relative;
    background-color: #fff;
    -webkit-background-clip: padding-box;
    background-clip: padding-box;
    border: 1px solid #999;
    border: 1px solid rgba(0,0,0,.2);
    border-radius: 6px;
    outline: 0;
    -webkit-box-shadow: 0 3px 9px rgba(0,0,0,.5);
    box-shadow: 0 3px 9px rgba(0,0,0,.5);
     
   }
   
   .btn-primary {
    color: #fff;
    background-color: #428bca;
    border-color: #357ebd;
}
.btn {
    display: inline-block;
    padding: 6px 12px;
    margin-bottom: 0;
    font-size: 14px;
    font-weight: 400;
    line-height: 1.42857143;
    text-align: center;
    white-space: nowrap;
    vertical-align: middle;
    cursor: pointer;
    -webkit-user-select: none;
    -moz-user-select: none;
    -ms-user-select: none;
    user-select: none;
    background-image: none;
    border: 1px solid transparent;
    border-radius: 4px;
}
.modal-dialog {
    position: relative;
    width: auto;
    margin: 10px;
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
           <a class="active" href="#news" onclick ="document.getElementById('id02').style.display='block'" class="w3-button w3-black">News</a>
           <a class="active" href="#contact" onclick ="document.getElementById('id03').style.display='block'" class="w3-button w3-black">Contact</a>
           <a class="active" href="#about" onclick ="document.getElementById('id04').style.display='block'" class="w3-button w3-black">About</a>
           </div> 
           
              <jsp:include page="ModelGlobal.jsp" />
   </div>
   
   <div class="date" id="dateSystem"></div>
   
   
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="margin-left: 130px;">
  <div class="modal-dialog">
    <div class="modal-content" style="height: 122px;width: 289px;margin-left: 130px;">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true" style="float: right;margin-top: -10px;">&times;</button>
        <h4 class="modal-title" id="myModalLabel" style="margin-left: 74px;">Welcome...</h4>
      </div>
      <div class="modal-body" style="margin-left: 71px;">
        This is test 
      </div>
      <div class="modal-footer" style="margin-left: 25px;">
      <form action="/Hospital_Management/newUser.html" method="post">
        <button type="button" class="btn btn-primary" data-dismiss="modal">New User</button>
      </form>  
        <button type="button" class="btn btn-primary" style="position: relative;margin-left: 108px;margin-top: -34px;">Registered User</button>
      </div>
    </div> 
  </div>
</div>
   
           
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
       
       $(window).load(function(){
    	   setTimeout(function(){
    		   $('#myModal').modal('show');
    	   },3000);
       });
         
         
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
         
         
        
         $('button').click(function(){
        	 $('#myModal').modal('hide');
        	 });
        
        </script>
        
       
        
       
</body>
</html>
