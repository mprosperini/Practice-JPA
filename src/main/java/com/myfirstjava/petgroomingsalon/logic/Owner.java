package com.myfirstjava.petgroomingsalon.logic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Owner implements Serializable {
    
    // ---- ---- ---- ---- ---- ---- ----- ATTRIBUTES ---- ---- ---- ---- ---- ---- ---- ---- //
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private String owner_id ;
    private String owner_name;
    private String owner_cellphone;
    // ---- ---- ---- ---- ---- ---- ----- CONSTRUCTOR ---- ---- ---- ---- ---- ---- ---- ---- //
    public Owner() {
    }

    public Owner(String ownerID, String ownerName, String ownerCellPhone) {
        this.owner_id = ownerID;
        this.owner_name = ownerName;
        this.owner_cellphone = ownerCellPhone;
    }
    // ---- ---- ---- ---- ---- ---- ----- GETTERS ---- ---- ---- ---- ---- ---- ---- ---- //
    public String getOwner_id() {
        return owner_id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public String getOwner_cellphone() {
        return owner_cellphone;
    }
    // ---- ---- ---- ---- ---- ---- ----- SETTERS ---- ---- ---- ---- ---- ---- ---- ---- //
    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public void setOwner_cellphone(String owner_cellphone) {
        this.owner_cellphone = owner_cellphone;
    }
    
}
