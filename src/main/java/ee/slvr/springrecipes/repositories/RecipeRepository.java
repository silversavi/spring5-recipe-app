package ee.slvr.springrecipes.repositories;

import ee.slvr.springrecipes.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
