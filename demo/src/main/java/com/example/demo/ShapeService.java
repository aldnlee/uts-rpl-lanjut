package com.example.demo;

import org.springframework.stereotype.Service;

@Service // Wajib agar Spring mengenalinya sebagai komponen untuk di-inject
public class ShapeService {

    public ShapeResult calculateRectangle(double p, double l) {
        String jenis;
        
        // Cek kondisi: p = l -> Bujur Sangkar; p != l -> Persegi Panjang
        if (p == l) {
            jenis = "Bujur Sangkar";
        } else {
            jenis = "Persegi Panjang";
        }
        
        // a. Cari Keliling: Keliling = 2(p + l)
        double keliling = 2 * (p + l);
        
        // a. Cari Luas: Luas = p x l
        double luas = p * l;
        
        // Kembalikan hasilnya
        return new ShapeResult(jenis, p, l, keliling, luas);
    }
}