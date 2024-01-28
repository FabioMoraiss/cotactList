package com.example.cotactList.service;

import com.example.cotactList.exception.ContactNotFoundException;
import com.example.cotactList.model.Contact;
import com.example.cotactList.repository.ContactRepository;
import com.example.cotactList.repository.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contacRepository) {
        this.contactRepository = contacRepository;
    }




    public void create(Contact contact) {
        contactRepository.save(contact);

    }

    public Contact getById(Long id) throws ContactNotFoundException {
        return contactRepository.findById(id)
                .orElseThrow(ContactNotFoundException::new);
    }

    public void upsert(Contact contact) {
        contactRepository
                .findById(contact.getId())
                .ifPresentOrElse(
                        (savedContact) -> {
                            savedContact.updateName(contact.getName());
                            savedContact.updatePhone(contact.getPhone());

                            contactRepository.save(savedContact);

                        },
                        () -> {create(contact);}
                );

    }

    public void delete(Long id) {
        contactRepository.deleteById(id);
    }

    public List<Contact> findAllFiltering(String name) {
       return contactRepository.findByNameContaining(name);
    }

    public List<Contact> getAll() {
        return contactRepository.findAll();
    }

    @Transactional
    public void creteBatch(List<Contact> contacts) {
        for (Contact contact : contacts) {
            contactRepository.save(contact);
        }
    }

    @Transactional
    public void deleteAllById(List<Long> ids) {
        for (Long id : ids) {
            contactRepository.deleteById(id);
        }
    }
}
