package com.springframe.sfgpetclinic.services;

import com.springframe.sfgpetclinic.model.Pet;

import java.util.Set;

//Pet Interface provide methods
public interface PetServiced {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
