package pl.madison.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Animal {
    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private String owner;
    private int age;
    @OneToMany(mappedBy = "animal", cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Visit> visits = new ArrayList<>();

}
