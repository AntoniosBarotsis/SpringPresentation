package SpringPresentation.Repositories;

import SpringPresentation.Models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository("PersonRepository")
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE Person p SET p.name = ?1 WHERE p.id = ?2")
    void updateNameById(String name, long id);
}
