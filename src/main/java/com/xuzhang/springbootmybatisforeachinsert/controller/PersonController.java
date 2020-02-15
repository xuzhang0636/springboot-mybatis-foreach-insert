package com.xuzhang.springbootmybatisforeachinsert.controller;

import com.xuzhang.springbootmybatisforeachinsert.model.Person;
import com.xuzhang.springbootmybatisforeachinsert.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return personService.getAllPerson();
    }
}
