package com.example.training.training;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

    @GetMapping("/test")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/array")
    public ResponseEntity<?> returnArray() {
        String[] cars = {"BMW", "Mercedes-Benz", "Volvo", "KIA", "Toyota"};
        return ResponseEntity.ok(cars);
    }
}
