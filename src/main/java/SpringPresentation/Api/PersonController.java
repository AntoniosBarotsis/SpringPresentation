package SpringPresentation.Api;

import SpringPresentation.Models.Person;
import SpringPresentation.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/insert")
    Person save(@RequestBody Person person) {
        return personService.save(person);
    }

    @GetMapping("/get/{id}")
    public Optional<Person> findById(@PathVariable long id) {
        return personService.findById(id);
    }

    @GetMapping
    List<Person> findAll() {
        return personService.findAll();
    }

    @PutMapping("/update/{id}")
    public void updateNameById(@PathVariable long id,
                               @RequestBody Person person) {
        personService.updateNameById(person.getName(), id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable long id) {
        personService.deleteById(id);
    }
}
