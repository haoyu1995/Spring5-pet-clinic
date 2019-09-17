package com.springframe.sfgpetclinic.services;

import com.springframe.sfgpetclinic.model.Owner;

import java.util.Set;

//Owner Interface provide methods
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
