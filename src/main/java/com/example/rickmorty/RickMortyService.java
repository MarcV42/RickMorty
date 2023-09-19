package com.example.rickmorty;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RickMortyService {

    private final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");

    public String getCharacter() {

        webClient
                .get()
                .uri("/1")
                .retrieve()
                .toEntity(RickMortyCharacterResponse.class)
                .block();


        return "Character";
    }
}
