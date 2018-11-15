package ir.transaction.spring.data.p2.service;

import ir.transaction.spring.data.p2.entity.Person;

import java.util.List;

public interface PersonService {
    void add(Person person);

    List<Person> listPersons();
}