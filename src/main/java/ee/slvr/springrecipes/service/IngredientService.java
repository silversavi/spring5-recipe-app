package ee.slvr.springrecipes.service;

import ee.slvr.springrecipes.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand findByRecipeIdAndId(Long recipeId, Long ingredientId);
}