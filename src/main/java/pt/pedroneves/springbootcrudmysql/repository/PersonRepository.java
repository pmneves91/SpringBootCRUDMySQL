package pt.pedroneves.springbootcrudmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.pedroneves.springbootcrudmysql.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
