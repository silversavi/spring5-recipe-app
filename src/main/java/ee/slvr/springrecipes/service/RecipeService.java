package ee.slvr.springrecipes.service;

import ee.slvr.springrecipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
