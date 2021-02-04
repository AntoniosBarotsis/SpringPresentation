package SpringPresentation;

import SpringPresentation.Models.Person;
import SpringPresentation.Repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPresentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPresentationApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(PersonRepository personRepository) {
//		return args -> {
//			personRepository.save(new Person("Test1"));
//			System.out.println(personRepository.findAll());
//			personRepository.updateNameById("UPDATED", 1);
//			System.out.println(personRepository.findAll());
//		};
//	}

}
