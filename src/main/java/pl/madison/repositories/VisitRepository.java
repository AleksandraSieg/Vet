package pl.madison.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.madison.domain.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
