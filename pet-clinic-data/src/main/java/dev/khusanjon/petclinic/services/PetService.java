package dev.khusanjon.petclinic.services;

import dev.khusanjon.petclinic.models.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
