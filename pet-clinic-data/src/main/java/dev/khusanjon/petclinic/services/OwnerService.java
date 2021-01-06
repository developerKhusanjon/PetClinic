package dev.khusanjon.petclinic.services;

import dev.khusanjon.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findByLastName(String last);

    Owner findById(Long id);

    void save(Owner owner);

    Set<Owner> findAll();
}
