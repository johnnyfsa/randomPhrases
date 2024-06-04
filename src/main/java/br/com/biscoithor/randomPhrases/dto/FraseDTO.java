package br.com.biscoithor.randomPhrases.dto;

import jakarta.persistence.Column;

public record FraseDTO(long id,
     String titulo,
     String frase,
     String personagem,
     String poster)
{
}
