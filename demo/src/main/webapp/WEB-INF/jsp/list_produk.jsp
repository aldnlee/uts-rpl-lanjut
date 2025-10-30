<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Daftar Produk CRUD</title>
</head>
<body>
    <h1>Daftar Produk</h1>
    <p><a href="/produk/new">Tambah Produk Baru</a></p>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Nama Produk</th>
                <th>Harga</th>
                <th>Aksi</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="produk" items="${listProduk}">
            <tr>
                <td>${produk.id}</td>
                <td>${produk.nama}</td>
                <td>${produk.harga}</td>
                <td>
                    <a href="/produk/edit/${produk.id}">Edit</a>
                    &nbsp;&nbsp;&nbsp;
                    <a href="/produk/delete/${produk.id}" onclick="return confirm('Yakin ingin menghapus?')">Hapus</a>
                </td>
            </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>