package com.example.demo.service;

import com.example.demo.dto.RolePlayRequest;
import com.example.demo.dto.RolePlayResponse;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RolePlayService {
    public RolePlayResponse charMaking(RolePlayRequest charCreation){
        Random random = new Random();
        int rmatk = random.nextInt(100, 999);
        String nameInput = charCreation.getName();
        String jobInput = charCreation.getJob();
        String raceInput = charCreation.getRace();
        String uid = String.valueOf(Integer.valueOf(nameInput.length())).concat(String.valueOf(jobInput.length())).concat(String.valueOf(raceInput.length())).concat(String.valueOf(rmatk)).concat(String.valueOf(jobInput.charAt(0)));
        Integer tdps = rmatk / (nameInput.length() + 5);
        if (nameInput.length() != 20){
            RolePlayResponse invalidInput = new RolePlayResponse();
            invalidInput.setUniqueId(null);
            invalidInput.setName(null);
            invalidInput.setJob(null);
            invalidInput.setRace(null);
            invalidInput.setMatk(null);
            invalidInput.setFinalSkill(null);
            invalidInput.setDps(null);
            return invalidInput;
        } else {
            RolePlayResponse rolePlayResponse = new RolePlayResponse();
            rolePlayResponse.setUniqueId(uid);
            rolePlayResponse.setName(charCreation.getName());
            rolePlayResponse.setJob(charCreation.getJob());
            rolePlayResponse.setRace(charCreation.getRace());
            rolePlayResponse.setMatk(rmatk);
            switch (jobInput){
                case "Magician":
                    rolePlayResponse.setFinalSkill("Meteora");
                    break;
                case "Alchemist":
                    rolePlayResponse.setFinalSkill("Water Bomb");
                    break;
                case "Assassin":
                    rolePlayResponse.setFinalSkill("Poison Mist");
                    break;
                case "Ranger":
                    rolePlayResponse.setFinalSkill("Arrow Storm");
                    break;
                case "Paladin":
                    rolePlayResponse.setFinalSkill("Ray of Genesis");
            }
            rolePlayResponse.setDps(tdps);
            return rolePlayResponse;
        }
    }
}
