package com.aluracursos.screenmatch.modelo;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DatosSerie(
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Genre") String genero,
        @JsonAlias("Poster") String poster,
        @JsonAlias("Actors") String actores,
        @JsonAlias("Plot") String sinopsis

) {
}
