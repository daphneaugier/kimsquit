package com.kimsquitsystem.kimsquitdemo.api;

import com.kimsquitsystem.kimsquitdemo.model.Person;
import com.kimsquitsystem.kimsquitdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }

    @GetMapping
    public List<Person> getAllPeople() {
        return personService.getAllPeople();
    }

    @GetMapping(path = "{id}")
    public Person getPersonByID(@PathVariable("id") UUID id) {
        return personService.getPersonById(id)
                .orElse(null);
    }

}
