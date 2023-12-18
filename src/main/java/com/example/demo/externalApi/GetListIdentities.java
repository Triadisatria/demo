package com.example.demo.externalApi;


import com.example.demo.dto.IdentitiesResponse;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
@Service
public class GetListIdentities {
    protected RestTemplate restTemplate;
    public List<IdentitiesResponse> getListIdentitiesFunction() {
        System.out.println("\nCreating a new user using Spring RestTemplate's exchange method:");
        String url = "https://jsonplaceholder.typicode.com/users";
        ResponseEntity<IdentitiesResponse> response;
        List<IdentitiesResponse> listOfIdentitiesRespond = new ArrayList<>();
        try {
            response = restTemplate.exchange(
                    url,
                    HttpMethod.GET,
                    new HttpEntity<>(null),
                    IdentitiesResponse.class
            );
            listOfIdentitiesRespond.add(response.getBody());
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
        return listOfIdentitiesRespond;
    }
}
