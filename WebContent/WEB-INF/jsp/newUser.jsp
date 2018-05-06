<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h2>${Message}</h2>
  <form action="/Hospital_Management/newUser.html" method="post" name="HospNew" onsubmit="return validate_form()">
   
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
</body>
</html>