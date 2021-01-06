package dev.khusanjon.petclinic.controllers;

import dev.khusanjon.petclinic.services.PetFeature;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetFeature myPet;

    public PetController(PetFeature myPet) {
        this.myPet = myPet;
    }

    public String getInfoAboutPet(){
        System.out.println("You are getting information about pets...");
        return myPet.getPetType();
    }
}
