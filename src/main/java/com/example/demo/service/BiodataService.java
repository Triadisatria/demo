package com.example.demo.service;

import com.example.demo.dto.MyDtoRequest;
import com.example.demo.dto.MyDtoResponse;
import org.springframework.stereotype.Service;

@Service
public class BiodataService {
    public MyDtoResponse isiBiodata(MyDtoRequest a){
        MyDtoResponse myDtoResponse = new MyDtoResponse();
        myDtoResponse.setNama(a.getNama());
        myDtoResponse.setMataKuliah(a.getMataKuliah());
        myDtoResponse.setHobi(a.getHobi());
        myDtoResponse.setKelas(a.getKelas());
        myDtoResponse.setDosen("Budi");
        myDtoResponse.setSks(14);
        myDtoResponse.setIp(3.4);
        return myDtoResponse;
        //buat 3 API
    }
}
