package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.web.bind.annotation.GetMapping; // Anotasi yang mungkin ada
// import org.springframework.web.bind.annotation.RestController; // Anotasi yang mungkin ada

// Anotasi @SpringBootApplication sering mengandung @ComponentScan
// @RestController // Mungkin ada di sini dan menyebabkan konflik
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    
    // HAPUS METODE INI (atau yang serupa) jika ada di DemoApplication.java
    /*
    @GetMapping("/") 
    public String home() {
        return "Hello World!";
    }
    */
}