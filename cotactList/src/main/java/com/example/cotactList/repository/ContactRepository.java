package com.example.cotactList.repository;

import com.example.cotactList.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    List<Contact> findByNameContaining(String name);
}
