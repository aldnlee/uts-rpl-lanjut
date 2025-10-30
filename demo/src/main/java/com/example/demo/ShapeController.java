package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller; // HARUS @Controller, BUKAN @RestController
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller // Wajib: Untuk mengembalikan view/JSP
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
        return "rectangle_form"; // Mencari rectangle_form.jsp
    }

    // Endpoint 2: Memproses Hasil Perhitungan dari Form HTML
    @PostMapping("/calculate") 
    public String calculate(@RequestParam("p") double p, 
                            @RequestParam("l") double l, 
                            Model model) {
        
        ShapeResult result = shapeService.calculateRectangle(p, l);
        
        // Mengirim hasil ke JSP
        model.addAttribute("hasil", result);
        
        return "rectangle_result"; // Mencari rectangle_result.jsp
    }
}