package pl.madison.services;

import pl.madison.domain.Visit;

import java.util.List;
import java.util.Optional;

public interface VisitService {

    List<Visit> findAll();
    Optional<Visit> findOne(Long id);
    void add(Visit visit);
    void update(Visit visit);
    void delete(Long id);
}
