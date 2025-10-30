package com.example.demo;

public class ShapeResult {
    private String jenisBangun;
    private double panjang;
    private double lebar;
    private double keliling;
    private double luas;

    // Constructor untuk mengisi semua hasil
    public ShapeResult(String jenisBangun, double panjang, double lebar, double keliling, double luas) {
        this.jenisBangun = jenisBangun;
        this.panjang = panjang;
        this.lebar = lebar;
        this.keliling = keliling;
        this.luas = luas;
    }

    // Getters (Wajib untuk serialisasi JSON oleh Spring/Jackson)
    public String getJenisBangun() {
        return jenisBangun;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getLuas() {
        return luas;
    }
}