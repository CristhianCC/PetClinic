package com.spring.framework.pet.clinic.services;

import com.spring.framework.pet.clinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
