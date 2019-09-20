package com.springframe.sfgpetclinic.bootstrap;

import com.springframe.sfgpetclinic.model.Owner;
import com.springframe.sfgpetclinic.model.Pet;
import com.springframe.sfgpetclinic.model.PetType;
import com.springframe.sfgpetclinic.model.Vet;
import com.springframe.sfgpetclinic.services.OwnerService;
import com.springframe.sfgpetclinic.services.PetTypeService;
import com.springframe.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType savedDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedCatType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Fiona");
        owner1.setLastName("Glenanne");
        owner1.setAddress("123 Brickerel");
        owner1.setCity("Miami");
        owner1.setTelephone("283-7782382");

        Pet fionaspet = new Pet();
        fionaspet.setPetType(savedDogType);
        fionaspet.setOwner(owner1);
        fionaspet.setBirthDate(LocalDate.now());
        fionaspet.setName("Puppies");
        owner1.getPets().add(fionaspet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Michael");
        owner2.setLastName("Weston");
        owner2.setAddress("123 Northwest Ave");
        owner2.setCity("Orlando");
        owner2.setTelephone("283-7234382");

        Pet mikespet = new Pet();
        mikespet.setPetType(savedCatType);
        mikespet.setOwner(owner2);
        mikespet.setBirthDate(LocalDate.now());
        mikespet.setName("Lulo");
        owner2.getPets().add(mikespet);

        ownerService.save(owner2);

        System.out.println("Loaded Owners....");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);

        System.out.println("Loaded Vets....");

    }
}
