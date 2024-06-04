package br.com.biscoithor.randomPhrases.service;

import br.com.biscoithor.randomPhrases.dto.FraseDTO;
import br.com.biscoithor.randomPhrases.model.Frase;
import br.com.biscoithor.randomPhrases.repository.PhraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FraseService
{
    @Autowired
    PhraseRepository repo;

    public FraseDTO obterFraseAleatoria()
    {
        Optional<Frase> fraseOpt = repo.getRandomPhase();
        if(fraseOpt.isPresent())
        {
            Frase frase = fraseOpt.get();
            FraseDTO fraseDto = new FraseDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
            return fraseDto;
        }
        return null;
    }
}
