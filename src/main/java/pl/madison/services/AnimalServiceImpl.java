package pl.madison.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.madison.domain.Animal;
import pl.madison.repositories.AnimalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> findAll() {
        return animalRepository.findAll();
    }

    @Override
    public Optional<Animal> findOne(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public void add(Animal animal) {
        animalRepository.save(animal);
    }

    @Override
    public void update(Animal animal) {
        animalRepository.saveAndFlush(animal);
    }

    @Override
    public void delete(Long id) {
        animalRepository.deleteById(id);
    }
}
