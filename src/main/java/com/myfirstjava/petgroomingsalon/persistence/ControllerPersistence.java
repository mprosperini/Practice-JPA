package com.myfirstjava.petgroomingsalon.persistence;

import com.myfirstjava.petgroomingsalon.logic.Owner;
import com.myfirstjava.petgroomingsalon.logic.Pet;

public class ControllerPersistence {
    
    OwnerJpaController ownerJpa = new OwnerJpaController();
    PetJpaController petJpa = new PetJpaController();

    public void save(Owner owner, Pet pet) {
        
        //creating owner entitie in Data Base
        ownerJpa.create(owner);
        //creating pet entitie in Data Base
        petJpa.create(pet);
    }
    
    
    
    
}
