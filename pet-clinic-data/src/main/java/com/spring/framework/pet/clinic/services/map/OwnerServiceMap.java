package com.spring.framework.pet.clinic.services.map;

import com.spring.framework.pet.clinic.model.Owner;
import com.spring.framework.pet.clinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractServiceMap<Owner, Long> implements CrudService<Owner, Long> {
    Owner findByLastName(String lastName) {
        return super.map.values().stream().filter(owner -> owner.getLastName().equals(lastName)).findFirst().get();
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
