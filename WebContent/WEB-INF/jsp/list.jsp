<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
  <meta name="viewport" content="width=device-width"> 
<title>PGKICIC Data</title>
<link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="all" />        
</head>
<body>
 <div class='head-top'>
  <div class='loginheading'>PGKICIC Daftar jemaat &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	<a href='index'><img src='<c:url value="/resources/img/back.png" />' ></a>
  </div>
 </div> 
 <form:form action="tampil" method = "post" >
 <div class='main'>
   <div class='red'>
    <span class='emet1'>Nomor</span>
    <span class='emet2'>Nama</span>
    <span class='emet3'>Alamat</span>
    <span class='emet4'> </span>
    <span class='emet5'> </span>
   </div>
   <c:forEach items="${Jemaat}" var="jemaat" >  <%-- model= Jemaat --%>
   <div class='brown'>
     <span class='emet1'>${jemaat.no_anggota}</span>
     <span class='emet2'>${jemaat.nama}</span>
     <span class='emet3'>${jemaat.alamat}</span>
     <span class='emet4'>
         <a href="tampil?data=${jemaat.nama}" > <%-- param=data --%>
           <img src="<c:url value="/resources/img/edit.png" />" /></a>
     </span>      
     <span class='emet4'>       
         <a href="edit?data=${jemaat.nama}" > <%-- param=data --%>
           <img src="<c:url value="/resources/img/delete.png" />" /></a> 
     </span>
   </div>
   </c:forEach> 
 </div>
</form:form> 
</body>
</html>