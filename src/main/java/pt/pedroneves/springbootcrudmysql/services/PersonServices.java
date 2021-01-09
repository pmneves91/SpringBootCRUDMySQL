package pt.pedroneves.springbootcrudmysql.services;

import org.springframework.stereotype.Service;
import pt.pedroneves.springbootcrudmysql.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    public Person create(Person person) {
        return person;
    }

    public Person update(Person person) {
        return person;
    }

    public void delete(String id) {

    }

    public Person findById(String id) {
        Person person = new Person();
        person.setId((int) counter.incrementAndGet());
        person.setFirstName("Pedro");
        person.setLastName("Neves");
        person.setAddress("Aveiro");
        person.setGender("Male");
        return person;
    }
    
    public List<Person> findAll() {
        List<Person> persons = new ArrayList<Person>();
        for (int i=0; i < 7; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId((int) counter.incrementAndGet());
        person.setFirstName("First name " + i);
        person.setLastName("Last name");
        person.setAddress("Address");
        person.setGender("Gender");
        return person;
    }
}
