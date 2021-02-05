package dev.khusanjon.petclinic.services;

import dev.khusanjon.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String last);

}
