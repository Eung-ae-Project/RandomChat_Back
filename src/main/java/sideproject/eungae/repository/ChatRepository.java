package sideproject.eungae.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sideproject.eungae.model.Chat;
import sideproject.eungae.model.Person;

import java.util.List;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    List<Chat> findAllByFirstPersonOrSecondPersonOrderByCreatedAt(Person firstPerson, Person secondPerson);
    boolean existsByFirstPersonAndSecondPerson(Person firstPerson, Person secondPerson);
}