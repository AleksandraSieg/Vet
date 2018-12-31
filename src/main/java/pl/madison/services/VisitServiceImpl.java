package pl.madison.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.madison.domain.Visit;
import pl.madison.repositories.VisitRepository;

import java.util.List;
import java.util.Optional;

@Service
public class VisitServiceImpl implements VisitService {

    @Autowired
    private VisitRepository visitRepository;


    @Override
    public List<Visit> findAll() {
        return visitRepository.findAll();
    }

    @Override
    public Optional<Visit> findOne(Long id) {
        return visitRepository.findById(id);
    }

    @Override
    public void add(Visit visit) {
        visitRepository.save(visit);
    }

    @Override
    public void update(Visit visit) {
        visitRepository.saveAndFlush(visit);
    }

    @Override
    public void delete(Long id) {
        visitRepository.deleteById(id);
    }
}
