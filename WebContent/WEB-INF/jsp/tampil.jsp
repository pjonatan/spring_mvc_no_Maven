<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="viewport" content="width=device-width"> 
<title>PGKICIC Data Jemaat</title>
<link rel="stylesheet" href="<c:url value="/resources/style.css" />" type="text/css" media="all" />        
</head>
<body>
  <div class='logincontent'>
    <div class='loginheading'>PGKICIC mengubah data&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     <a href='cari'><img src='<c:url value="/resources/img/search.png" />' ></a>&nbsp;&nbsp;&nbsp;&nbsp;
     <a href='index'><img src='<c:url value="/resources/img/back.png" />' ></a>
    </div>

   <form:form action='ubah' method='post' modelAttribute="jemaat" >
    <div class="main"><label>No Ag.</label>
      <form:input class="input3"  path="no_anggota" value="${Jem.no_anggota}" />  
    </div>
    <div class="main"><label>Nama&nbsp;&nbsp;</label>
      <form:input class='input1' path="nama" value="${Jem.nama}" />
    </div>
    <div class="main"><label>Alamat</label>
      <form:input class='input2' path='alamat' value="${Jem.alamat}" />
    </div>
    <div class="main"><label>Phone&nbsp;</label>
      <form:input class='input3' path='phone' value="${Jem.phone}" />
    </div>
    <div class="main"><label>Gender&nbsp;&nbsp;</label>
      <form:select path='gender'>
       <form:option value='${Jem.gender}' label="${Jem.gender}" />
       <form:option value='P' >P</form:option>
       <form:option value='W' >W</form:option>
      </form:select>
    </div>
    <div class='main'><label>Golongan Darah&nbsp;</label>
      <form:select path='darah'>
        <form:option value='${Jem.darah}' label="${Jem.darah}" />
        <c:forEach items="${Darah}" var="darah" varStatus="status" >
           <form:option value="${darah.golongan}">${darah.golongan}</form:option>
        </c:forEach>        
      </form:select>
    </div>
    <div class='main'><label>Status&nbsp;&nbsp;&nbsp;&nbsp;</label>
      <form:select path="status" >
        <form:option value='${Jem.status}' label="${Jem.status}" />
        <form:option value='-' >Nihil</form:option>
        <form:option value='B' >Baptis</form:option>
        <form:option value='S' >Sidi</form:option>
      </form:select>
    </div>  
    <div class='main'><label>Tempat Lahir&nbsp;</label>
      <form:input class='input3' path='tempat_lahir' placeholder='Kota' 
      value="${Jem.tempat_lahir}" />
    </div>
    <div class='main'><label>Tanggal Lahir</label>
      <form:input class='input3' path='tanggal_lahir' 
      placeholder='Tahun-bulan-tanggal' value="${Jem.tanggal_lahir}" />
    </div>
    <div class='main'><label>Pendidikan</label>
      <form:select path='pendidikan'>
        <form:option value='${Jem.pendidikan}' label="${Jem.pendidikan}" />
        <c:forEach items="${Pendidikan}" var="didik"  >
           <form:option value="${didik.pendidikan}">${didik.pendidikan}</form:option>
        </c:forEach>        
      </form:select>
    </div>
    <div class='main'><label>Pekerjaan&nbsp;&nbsp;&nbsp;</label>
      <form:select path='pekerjaan'>
        <form:option value='${Jem.pekerjaan}' label="${Jem.pekerjaan}" />
        <c:forEach items="${Pekerjaan}" var="kerja"  >
           <form:option value="${kerja.pekerjaan}">${kerja.pekerjaan}</form:option>
        </c:forEach>        
      </form:select>
    </div>     
    <div class='loginremember'>
      <input type='submit' class='loginbtn' onclick="return confirm('Mau menyimpan?');" />
    </div>
   </form:form>
  </div>   
</body>
</html>