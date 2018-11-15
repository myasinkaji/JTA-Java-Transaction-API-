package ir.transaction.spring.data.p2;

import ir.transaction.spring.data.p2.config.AppConfig;
import ir.transaction.spring.data.p2.entity.Person;
import ir.transaction.spring.data.p2.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        PersonService personService = context.getBean(PersonService.class);
        // Add Persons
        personService.add(new Person("Rahul", "Gupta", "rahulgupta@company.com"));
        personService.add(new Person("Akshay", "Sharma", "akshaysharma@company.com"));
        personService.add(new Person("Ankit", "Sarraf", "ankitsarraf@company.com"));
        // Get Persons
        List<Person> persons = personService.listPersons();
        for (Person person : persons) {
            System.out.println("Id = " + person.getId());
            System.out.println("First Name = " + person.getFirstName());
            System.out.println("Last Name = " + person.getLastName());
            System.out.println("Email = " + person.getEmail());
            System.out.println();
        }
        context.close();
    }
}
