package com.example.demo.service;

import com.example.demo.dto.RequestPr;
import com.example.demo.dto.ResponsePr;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GeneratorService {
    public ResponsePr generator(RequestPr inputRandomId){
        Random random = new Random();
        int ran4 = random.nextInt(1000, 9999);
        String requestInput = ran4 + inputRandomId.getRequestId();
        if (requestInput.length() != 10) {
            ResponsePr errorRespond = new ResponsePr();
            errorRespond.setError("Only 10 characters possible");
            return errorRespond;
        } else {
            ResponsePr responsePr = new ResponsePr();
            responsePr.setRandomId(requestInput);
            responsePr.setSecured("i Hope So");
            return responsePr;
        }


    }
}
