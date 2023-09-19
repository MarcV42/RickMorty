package com.example.rickmorty;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class RickMortyController {




    @GetMapping()
    public List<Product> getAllProducts() {
        System.out.println("Du hast die testGetAllProducts() Methode über MockMvc aufgerufen ");
        return productService.findAllProducts();
    }
}
