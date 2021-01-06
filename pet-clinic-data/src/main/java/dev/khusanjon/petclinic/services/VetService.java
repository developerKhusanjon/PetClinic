package dev.khusanjon.petclinic.services;

import dev.khusanjon.petclinic.models.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    void save(Vet vet);

    Set<Vet> findAll();
}
