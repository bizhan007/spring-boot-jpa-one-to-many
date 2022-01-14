package com.springbootjpaonetomany.service;

import com.springbootjpaonetomany.model.Person;

import java.util.List;

public interface PersonService {

    Person findPersonById(Long id);
    List<Person> findAllPerson();
    Person createPerson(Person person);
    Person updatePerson(Person person);
    void deletePersonById(Long id);

}
