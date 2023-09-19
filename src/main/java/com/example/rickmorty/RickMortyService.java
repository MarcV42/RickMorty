package com.example.rickmorty;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class RickMortyService {

    public final WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");

    public RickMortyCharacterResponse getCharacter() {

        ResponseEntity<RickMortyCharacterResponse> response = webClient
                .get()
                .retrieve()
                .toEntity(RickMortyCharacterResponse.class)
                .block();
        System.out.println(response);

        return response.getBody();
    }
}
