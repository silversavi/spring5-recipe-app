package ee.slvr.springrecipes.controllers;

import ee.slvr.springrecipes.domain.Category;
import ee.slvr.springrecipes.domain.UnitOfMeasure;
import ee.slvr.springrecipes.repositories.CategoryRepository;
import ee.slvr.springrecipes.repositories.UnitOfMeasureRepository;
import ee.slvr.springrecipes.service.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
