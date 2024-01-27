package com.example.cotactList.controller;

import com.example.cotactList.exception.ContactNotFoundException;
import com.example.cotactList.model.Contact;
import com.example.cotactList.service.ContactService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class contactController {


    private final ContactService contactService;

    public contactController(ContactService contatService) {
        this.contactService = contatService;
    }

    @GetMapping("/test")
    public String test() {
        return "olá mundo";
    }

    @PostMapping("/contacts")
    @ResponseStatus(HttpStatus.CREATED)
    public void createContact(@RequestBody Contact contact) {
        contactService.create(contact);
    }

    @GetMapping("/contacts/{id}")
    public  Contact getContactById(@PathVariable Long id) throws ContactNotFoundException {
        return contactService.getById(id);
    }

    @PutMapping("/contacts")
    public void upsertContact(@RequestBody Contact contact){
        contactService.upsert(contact);
    }


    @DeleteMapping("/contacts/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.delete(id);
    }

    @GetMapping("/contacts")
    public List<Contact> findContacts(@RequestParam String name) {
        return contactService.findAllFiltering(name);
    }


}


