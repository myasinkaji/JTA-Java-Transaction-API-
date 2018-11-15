package ir.transaction.spring.data.p2.dao;

import ir.transaction.spring.data.p2.entity.Person;

import java.util.List;

public interface PersonDao {
    void add(Person person);

    List<Person> listPersons();
}