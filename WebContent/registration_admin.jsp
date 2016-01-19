<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<FORM ACTION="Librarian_Servlet" METHOD="post">

<TABLE BORDER="0">
 <TR>
  <TD>Last Name</TD>
  <TD ALIGN="left">
    <INPUT TYPE="text" SIZE="25" NAME="lname">
  </TD>
 </TR>
 <TR>
  <TD>First Name</TD>
  <TD ALIGN="left">
    <INPUT TYPE="text" SIZE="25" NAME="fname" >
  </TD>
 </TR>
 <TR>
  <TD>Your Preferred User Name</TD>
  <TD ALIGN="left">
    <INPUT TYPE="text" SIZE="25" NAME="userName" >
  </TD>
 </TR>
 <TR>
  <TD>Email Address</TD>
  <TD ALIGN="left">
    <INPUT TYPE="text" SIZE="25" NAME="emailaddr" >
  </TD>
 </TR>

<tr>  <TD> Password</TD>
  <TD ALIGN="left">
    <INPUT TYPE="password" SIZE="25" NAME="accpwdone" >
  </TD>
 </TR>
 <TR>
  <TD> Verify Password</TD>
  <TD ALIGN="left"> <INPUT TYPE="password" SIZE="25" NAME="accpwdtwo" >
  </TD>
 </TR>
</TABLE>

<INPUT TYPE="submit" VALUE="Submit">
<INPUT TYPE="reset" VALUE="Clear">

</FORM>



</body>
</html>