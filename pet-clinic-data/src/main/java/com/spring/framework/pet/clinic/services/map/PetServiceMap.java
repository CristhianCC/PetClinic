package com.spring.framework.pet.clinic.services.map;

import com.spring.framework.pet.clinic.model.Pet;
import com.spring.framework.pet.clinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractServiceMap<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
