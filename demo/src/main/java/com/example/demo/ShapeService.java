package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class ShapeService {

    public ShapeResult calculateRectangle(double p, double l) {
        // Penyederhanaan penentuan jenis bangun
        String jenis = (p == l) ? "Bujur Sangkar" : "Persegi Panjang";
        
        // Perhitungan
        double keliling = 2 * (p + l);
        double luas = p * l;
        
        // Mengembalikan hasilnya
        return new ShapeResult(jenis, p, l, keliling, luas);
    }
}