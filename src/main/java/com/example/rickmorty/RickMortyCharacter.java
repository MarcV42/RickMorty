package com.example.rickmorty;

import java.util.List;

public record RickMortyCharacter(

        int id,
        String name,
        String age,
        List<RickMortyRelatives> relatives
) {
}
