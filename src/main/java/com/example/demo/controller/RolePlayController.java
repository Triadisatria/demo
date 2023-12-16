package com.example.demo.controller;

import com.example.demo.dto.RolePlayRequest;
import com.example.demo.dto.RolePlayResponse;
import com.example.demo.service.RolePlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RolePlayController {
    @Autowired
    RolePlayService rolePlayService;

    @PostMapping("/character/creation")
    public RolePlayResponse postChar(@RequestBody RolePlayRequest characterCreationInput){
        return rolePlayService.charMaking(characterCreationInput);
    }
}
