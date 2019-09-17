package com.springframe.sfgpetclinic.services;

import com.springframe.sfgpetclinic.model.Vet;

import java.util.Set;

//Vet Interface provide methods
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
