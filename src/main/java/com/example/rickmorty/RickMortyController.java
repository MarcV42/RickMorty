package com.example.rickmorty;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class RickMortyController {

    private final RickMortyService rickMortyService;


    @GetMapping("characters")
    RickMortyCharacterResponse getCharacter() {
        System.out.println("Du hast die Rick&Morty Api aufgerufen ");
        return rickMortyService.getCharacter();
    }
}
