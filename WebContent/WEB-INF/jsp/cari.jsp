<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PGKICIC Cari Jemaat</title>
<link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="all" />        
</head>
<body>
   <div class='logincontent'>
   <div class='loginheading'>PGKICIC Cari Jemaat&nbsp;&nbsp;&nbsp;
   	<a href='index'><img src='<c:url value="/resources/img/back.png" />' ></a></div>
   <form:form action='list' method='post' >
   <label for='txtNama'>Nama </label>
   <input class='input1' type='text' name='nama' required >
   <div class='loginremember'>
   <input type='submit' class='loginbtn' value='Cari'  name='cari'  /></div> 
   </form:form></div> 
</body>
</html>