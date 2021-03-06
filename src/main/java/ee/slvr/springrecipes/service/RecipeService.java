package ee.slvr.springrecipes.service;

import ee.slvr.springrecipes.commands.RecipeCommand;
import ee.slvr.springrecipes.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
