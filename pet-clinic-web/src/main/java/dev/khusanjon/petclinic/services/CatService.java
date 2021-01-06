package dev.khusanjon.petclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("cat")
@Service
public class CatService implements PetFeature{
    @Override
    public String getPetType() {
        return "Cat is best";
    }
}
