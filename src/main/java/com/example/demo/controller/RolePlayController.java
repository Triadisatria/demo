package com.example.demo.controller;

import com.example.demo.dto.IdentitiesRequest;
import com.example.demo.dto.IdentitiesResponseMyAPI;
import com.example.demo.dto.RolePlayRequest;
import com.example.demo.dto.RolePlayResponse;
import com.example.demo.service.RolePlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolePlayController {
    @Autowired
    RolePlayService rolePlayService;

    @PostMapping("/character/creation")
    public RolePlayResponse postChar(@RequestBody RolePlayRequest characterCreationInput){
        return rolePlayService.charMaking(characterCreationInput);
    }
    @GetMapping("/apiurl/change")
    public List<IdentitiesResponseMyAPI> geturl(){
        return rolePlayService.listIdentitiesResponse();
    }
}
