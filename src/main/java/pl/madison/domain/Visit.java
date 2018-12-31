package pl.madison.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateOfVisit;
    private String description;
    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    public Long getId() {
        return id;
    }

    public LocalDateTime getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDateTime dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
