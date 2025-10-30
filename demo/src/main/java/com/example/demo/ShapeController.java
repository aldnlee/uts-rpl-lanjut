package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // GANTI: Harus @Controller untuk View
import org.springframework.ui.Model;             // Import untuk mengirim data ke JSP
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; // Digunakan untuk form HTML

@Controller // WAJIB GANTI: Mengembalikan nama view (JSP)
@RequestMapping("/") 
public class ShapeController {

    private final ShapeService shapeService;

    @Autowired
    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    // Endpoint 1: Menampilkan Form Input (Akses: http://localhost:8080/)
    @GetMapping("/")
    public String showForm() {
        // Akan merender src/main/webapp/WEB-INF/jsp/rectangle_form.jsp
        return "rectangle_form"; 
    }

    // Endpoint 2: Memproses Hasil Perhitungan dari Form HTML
    @PostMapping("/calculate") // URL yang dipanggil oleh form
    public String calculate(@RequestParam("p") double p, // Ambil 'p' dari form field
                            @RequestParam("l") double l, // Ambil 'l' dari form field
                            Model model) {               // Objek untuk membawa data
        
        // Panggil service untuk melakukan perhitungan
        ShapeResult result = shapeService.calculateRectangle(p, l);
        
        // Kirim objek hasil ke halaman JSP
        model.addAttribute("hasil", result);
        
        // Akan merender src/main/webapp/WEB-INF/jsp/rectangle_result.jsp
        return "rectangle_result"; 
    }
}