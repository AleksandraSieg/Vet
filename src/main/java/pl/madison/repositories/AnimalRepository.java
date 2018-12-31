package pl.madison.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.madison.domain.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
