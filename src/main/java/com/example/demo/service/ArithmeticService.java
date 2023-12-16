package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ArithmeticService {
    int hasil;
    double hasildouble;
public int perkalian(int a, int b) {
    hasil = a * b;
    return hasil;
}
public double pembagian(double c, double d){
    hasildouble = c / d;
    return hasildouble;
}
public int pertambahan(int a, int b){
    hasil = a + b;
    return hasil;
}
public int pengurangan(int a, int b){
    hasil = a - b;
    return hasil;
}
public int perpangkatan(int a){
    hasil = a * a;
    return hasil;
}
public  String random(String a){
    return a;
}
}
//perkalian, bagi, tambah,kurang,pangkat,
//