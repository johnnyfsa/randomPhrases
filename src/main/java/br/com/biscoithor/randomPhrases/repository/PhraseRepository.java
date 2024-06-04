package br.com.biscoithor.randomPhrases.repository;

import br.com.biscoithor.randomPhrases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PhraseRepository extends JpaRepository<Frase,Long>
{
    @Query("SELECT f FROM Frase f ORDER BY function('RANDOM') LIMIT 1")
    Optional<Frase> getRandomPhase();
}
