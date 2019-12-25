package ee.slvr.springrecipes.repositories;

import ee.slvr.springrecipes.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
