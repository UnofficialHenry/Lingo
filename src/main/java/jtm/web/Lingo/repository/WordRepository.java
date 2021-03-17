package jtm.web.Lingo.repository;


import jtm.web.Lingo.model.Words;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordRepository extends JpaRepository<Words, Integer> {

}