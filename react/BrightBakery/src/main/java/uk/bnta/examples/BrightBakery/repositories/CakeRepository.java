package uk.bnta.examples.BrightBakery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.bnta.examples.BrightBakery.models.Cake;

public interface CakeRepository extends JpaRepository<Cake, Long> {
}
