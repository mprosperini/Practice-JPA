package com.myfirstjava.petgroomingsalon.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pet implements Serializable {
    // ---- ---- ---- ---- ---- ---- ----- ATTRIBUTES ---- ---- ---- ---- ---- ---- ---- ---- //
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String owner_id ;
    private String pet_name;
    private String race ;
    private String color ;
    private String alergic ;
    private String notes ;
    
    @OneToOne
    private Owner unicOwner;
    // ---- ---- ---- ---- ---- ---- ----- CONSTRUCTOR ---- ---- ---- ---- ---- ---- ---- ---- //
    public Pet() {
    }
    
    public Pet(String owner_id, String pet_name, String race, String color, String alergic, String notes, Owner unicOwner) {
        this.owner_id = owner_id;
        this.pet_name = pet_name;
        this.race = race;
        this.color = color;
        this.alergic = alergic;
        this.notes = notes;
        this.unicOwner = unicOwner;
    }
    // ---- ---- ---- ---- ---- ---- ----- GETTERS ---- ---- ---- ---- ---- ---- ---- ---- //
    public String getOwner_id() {
        return owner_id;
    }

    public String getPet_name() {
        return pet_name;
    }

    public String getRace() {
        return race;
    }

    public String getColor() {
        return color;
    }

    public String getAlergic() {
        return alergic;
    }

    public String getNotes() {
        return notes;
    }

    public Owner getUnicOwner() {
        return unicOwner;
    }    
    // ---- ---- ---- ---- ---- ---- ----- SETTERS ---- ---- ---- ---- ---- ---- ---- ---- //

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public void setPet_name(String pet_name) {
        this.pet_name = pet_name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergic(String alergic) {
        this.alergic = alergic;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setUnicOwner(Owner unicOwner) {
        this.unicOwner = unicOwner;
    }


    


}
