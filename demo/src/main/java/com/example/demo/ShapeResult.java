package com.example.demo;

public class ShapeResult {
    private String jenisBangun;
    private double panjang;
    private double lebar;
    private double keliling;
    private double luas;

    // Tambahkan Constructor kosong (No-Arg Constructor)
    public ShapeResult() {
    }
    
    // Constructor untuk mengisi semua hasil (sudah ada)
    public ShapeResult(String jenisBangun, double panjang, double lebar, double keliling, double luas) {
        this.jenisBangun = jenisBangun;
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = keliling;
        this.luas = luas;
    }

    // Getters (Sudah benar)
    public String getJenisBangun() {
        return jenisBangun;
    }
    // ... (Getter lainnya)
    public double getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
}