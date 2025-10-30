package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/shape") 
public class ShapeController {

    private final ShapeService shapeService;

    @Autowired
    public ShapeController(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @PostMapping("/calculate-rectangle") // Menanggapi permintaan POST ke /api/shape/calculate-rectangle
    public ShapeResult calculate(@RequestBody ShapeRequest request) {
        double p = request.getP();
        double l = request.getL();
        
        // Panggil service untuk melakukan perhitungan
        return shapeService.calculateRectangle(p, l);
    }
}