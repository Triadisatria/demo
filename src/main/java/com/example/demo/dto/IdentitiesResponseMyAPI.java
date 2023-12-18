package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdentitiesResponseMyAPI {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private Address address;
}
