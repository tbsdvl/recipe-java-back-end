package com.example.recipe.controller;

import com.example.recipe.model.Recipe;
import com.example.recipe.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepo;

    @GetMapping("/recipes")
    @ResponseStatus(value = HttpStatus.OK)
    public List<Recipe> getRecipes() {
        return recipeRepo.findAll();
    }

}
