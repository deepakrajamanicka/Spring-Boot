package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonService ps;

    @PostMapping("/hello/pers")
    public Person createPerson(@RequestBody Person p) {
        return ps.createMethod(p);
    }

    @GetMapping("/hello/pers/{bookId}")
    public Person getPersonById(@PathVariable int bookId) {
        return ps.getPersonById(bookId);
    }
    
    @PutMapping("/hello/pers")
    public Person updatePerson(@RequestBody Person p) {
        return ps.createMethod(p);
    }

    @DeleteMapping("/hello/pers")
    public void deletePerson(@RequestBody Person p) {
        ps.deletePerson(p);
    }
}