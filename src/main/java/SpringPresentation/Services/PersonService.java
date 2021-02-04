package SpringPresentation.Services;

import SpringPresentation.Models.Person;
import SpringPresentation.Repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;

    @Autowired
    public PersonService(@Qualifier("PersonRepository") PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void updateNameById(String name, long id) {
        personRepository.updateNameById(name, id);
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Optional<Person> findById(long id) {
        return personRepository.findById(id);
    }

    public void deleteById(long id) {
        personRepository.deleteAll(personRepository.findAllById(List.of(id)));
    }
}
