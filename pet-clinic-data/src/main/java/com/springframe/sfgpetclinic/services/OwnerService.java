package com.springframe.sfgpetclinic.services;

import com.springframe.sfgpetclinic.model.Owner;

//Owner Interface provide methods
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
