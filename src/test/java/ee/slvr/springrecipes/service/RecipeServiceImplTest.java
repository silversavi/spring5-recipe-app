package ee.slvr.springrecipes.service;

import ee.slvr.springrecipes.domain.Recipe;
import ee.slvr.springrecipes.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

//    @Test
//    public void getRecipeByIdTest() throws Exception {
//        Recipe recipe = new Recipe();
//        recipe.setId(1L);
//        Optional<Recipe> recipeOptional = Optional.of(recipe);
//
//        when(recipeRepository.findById(anyLong())).thenReturn(recipeOptional);
//
//        Recipe recipeReturned = recipeService.findById(1L);
//
//        assertNotNull("Null recipe returned", recipeReturned);
//        verify(recipeRepository, times(1)).findById(anyLong());
//        verify(recipeRepository, never()).findAll();
//    }

    @Test
    void getRecipes() {

        Recipe recipe = new Recipe();
        HashSet recipesData = new HashSet();
        recipesData.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipesData);

        Set<Recipe> recipes = recipeService.getRecipes();

        assertEquals(recipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
    }
}