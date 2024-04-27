package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepo pr;

    public Person createMethod(Person p) {
        return pr.save(p);
    }

    public void deletePerson(Person p) {
        pr.delete(p);
    }
    public Person getPersonById(int bookId) {
        return pr.findById(bookId).orElse(null);
    }
}