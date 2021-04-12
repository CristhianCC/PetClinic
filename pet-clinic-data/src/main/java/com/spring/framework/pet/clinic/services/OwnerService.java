package com.spring.framework.pet.clinic.services;

import com.spring.framework.pet.clinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
