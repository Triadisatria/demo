package com.example.demo.controller;

import com.example.demo.dto.MyDtoRequest;
import com.example.demo.dto.MyDtoResponse;
import com.example.demo.dto.RequestPr;
import com.example.demo.dto.ResponsePr;
import com.example.demo.service.ArithmeticService;
import com.example.demo.service.BiodataService;
import com.example.demo.service.GeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {
    @Autowired
    ArithmeticService arithmeticService;
    @Autowired
    BiodataService biodataService;
    @Autowired
    GeneratorService generatorService;

    @GetMapping("/pertambahan/{a}/{b}")
    public String pertambahan(@PathVariable int a,
                              @PathVariable int b){
        int hasil = arithmeticService.pertambahan(a, b);
        return "Hasilnya adalah: " + hasil;
    }
    @GetMapping("/pengurangan/{a}/{b}")
    public String pengurangan(@PathVariable int a,
                              @PathVariable int b){
        int hasil = arithmeticService.pengurangan(a, b);
        return "Hasilnya adalah: " + hasil;
    }
    @GetMapping("/perkalian/{a}/{b}")
    public String perkalian(@PathVariable int a,
                            @PathVariable int b){
        int hasil = arithmeticService.perkalian(a, b);
        return "Hasilnya adalah: " + hasil;
    }
    @GetMapping("/pembagian/{c}/{d}")
    public String pembagian(@PathVariable double c,
                            @PathVariable double d){
        double hasil = arithmeticService.pembagian(c, d);
        return "Hasilnya adalah: " + hasil;
    }
    @GetMapping("/perpangkatan/{a}")
    public String perpangkatan(@PathVariable int a){
        int hasil = arithmeticService.perpangkatan(a);
        return "Hasilnya adalah: " + hasil;
    }
    @GetMapping("/random/{a}")
    public String random(@PathVariable String a){
        String hasil = arithmeticService.random(a);
        return "Outputnya adalah: " + hasil;
    }
    @PostMapping("/biodata")
    public MyDtoResponse biodata(@RequestBody MyDtoRequest a){
        return biodataService.isiBiodata(a);
    }
    @PostMapping("/generator")
    public ResponsePr generator(@RequestBody RequestPr inputRandomId){
        return generatorService.generator(inputRandomId);
    }
}
//coba biar controller bisa manggil ArithmeticService
//selanjutnya bikin 6 getmapper untuk memanggil semua function di arithmeticservice
//hubungan controller service yang ada di code dengan konsep mvc
//sekalian coba di postman
//pelajari dengan request param (parameter) * ada hubungannya dengan input angka
