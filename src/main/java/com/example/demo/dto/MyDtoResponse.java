package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyDtoResponse {
    private String nama;
    private String mataKuliah;
    private int kelas;
    private String hobi;
    private String dosen;
    private int sks;
    private double ip;

    //sama kaya tadi tapi namanya didapet dari request body, matkul dari request body, dosen sks ip hard code
}
