package uk.bnta.examples.BrightBakery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.bnta.examples.BrightBakery.models.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
