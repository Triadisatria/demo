package com.example.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolePlayResponse {
    private String uniqueId;
    private String name;
    private String job;
    private String race;
    private Integer matk;
    private String finalSkill;
    private Integer dps;

}
