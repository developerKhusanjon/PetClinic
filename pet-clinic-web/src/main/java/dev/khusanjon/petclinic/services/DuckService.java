package dev.khusanjon.petclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("duck")
@Service
public class DuckService implements PetFeature {
    @Override
    public String getPetType() {
        return "Duck is cute";
    }
}
