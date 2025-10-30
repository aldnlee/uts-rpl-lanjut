<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form Produk</title>
</head>
<body>
    <h1>${produk.id == null ? 'Tambah' : 'Edit'} Produk</h1>

    <form:form action="/produk/save" method="post" modelAttribute="produk">
        <form:hidden path="id"/>
        
        <label for="nama">Nama Produk:</label>
        <form:input path="nama" id="nama"/><br><br>

        <label for="harga">Harga:</label>
        <form:input path="harga" id="harga"/><br><br>

        <input type="submit" value="Simpan">
    </form:form>
    
    <p><a href="/produk/list">Kembali ke Daftar</a></p>
</body>
</html>