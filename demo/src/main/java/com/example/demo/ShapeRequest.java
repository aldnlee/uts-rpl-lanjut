package com.example.demo;

public class ShapeRequest {
    private double p; // Panjang
    private double l; // Lebar

    // Constructor kosong (Wajib untuk deserialisasi JSON oleh Spring/Jackson)
    public ShapeRequest() {
    }

    // Getters dan Setters (Wajib untuk mapping data JSON)
    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}