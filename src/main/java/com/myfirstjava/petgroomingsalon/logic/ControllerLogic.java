package com.myfirstjava.petgroomingsalon.logic;

import com.myfirstjava.petgroomingsalon.persistence.ControllerPersistence;

public class ControllerLogic {
    
    ControllerPersistence controlPersis = new ControllerPersistence();

    public void save(String pet_name, String pet_race, String owner_name, String owner_cell, String notes, String pet_color, String client_id, String alergic) {
        
        //CREATE OWNER AND ASSIGNING VALUES//
        Owner owner = new Owner();
        owner.setOwner_cellphone(owner_cell);
        owner.setOwner_name(owner_name);
        
        //CREATE PET AND ASSIGNING VALUES//
        Pet pet = new Pet();
        pet.setAlergic(alergic);
        pet.setColor(pet_color);
        pet.setNotes(notes);
        pet.setPet_name(pet_name);
        pet.setRace(pet_race);
        pet.setUnicOwner(owner);
        
        controlPersis.save(owner, pet);


    }
    
}
