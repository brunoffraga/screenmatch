package br.com.alura.screenmatch.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie(@JsonAlias("Title") String titulo, 
                            @JsonAlias("totalSeasons") Integer totalTemporada,
                            @JsonAlias("imdbRating") String avaliacao
                            ) {
    //qui ele serve para ler e escrever da mesma forma que é lido
    //@JsonProperty("imdbVotes") String votos
    
    //Já aqui ler e escreve com o nome que vc coloca no final
    //@JsonAlias("imdbRating") String avaliacao
    
    //Aqui é procurado tanto com um nome quanto com o outro
    //@JsonAlias({"nomeCompleto", "nome"})
    //private String nomeCompleto;
}
