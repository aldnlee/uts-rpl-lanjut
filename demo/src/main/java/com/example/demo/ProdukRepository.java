package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepository menyediakan method CRUD dasar secara otomatis (save, findAll, findById, delete)
@Repository
public interface ProdukRepository extends JpaRepository<Produk, Long> {
    // Kita tidak perlu menulis implementasi di sini. Spring Data JPA melakukannya.
}