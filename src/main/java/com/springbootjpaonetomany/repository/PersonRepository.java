package com.springbootjpaonetomany.repository;

import com.springbootjpaonetomany.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    Person findPersonById(Long id);
    void deletePersonById(Long id);

}
