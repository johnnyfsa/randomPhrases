package br.com.biscoithor.randomPhrases.model;

import jakarta.persistence.*;

@Entity
@Table(name ="frases")
public class Frase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(unique = true)
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    @Override
    public String toString() {
        return "Frase{" +
                ", titulo='" + titulo + '\'' +
                ", frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
}