package com.example.cotactList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contact {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phone;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", number='" + phone + '\'' +
                '}';
    }

    public void updateName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public void updatePhone(String phone) {
        if(phone != null) {
            this.phone = phone;
        }
    }
}
