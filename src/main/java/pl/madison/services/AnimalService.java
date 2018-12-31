package pl.madison.services;

import pl.madison.domain.Animal;

import java.util.List;
import java.util.Optional;

public interface AnimalService {

    List<Animal> findAll();
    Optional<Animal> findOne(Long id);
    void add(Animal animal);
    void update(Animal animal);
    void delete(Long id);

}
