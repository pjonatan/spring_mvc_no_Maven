<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PGKICIC</title>
		<link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="all" />        
    <body>
	  <div class='blue'>
		<div class='menu'>
		  <div class='loginbtn'>
			<a href='isi'>${test}Tambah data</a>
		  </div>
         </div>
		<div class='menu'>
		   <div class='loginbtn'>
			<a href='cari'>Cari nama</a>
		   </div>
        </div>
		<div class='menu'>
		   <div class='loginbtn'>
		    <a href='ulang'>Ulang Tahun</a>
		   </div>
         </div>
		<div class='menu'>
		   <div class='loginbtn'>
		    <a href='pilih'>Pilih</a>
		   </div>
         </div>
      </div>
    </body>
</html>