package pl.madison.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.madison.domain.Animal;
import pl.madison.services.AnimalService;

import javax.validation.Valid;

@Controller
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/find-all")
    public String findAll(Model model) {
        model.addAttribute("animals", animalService.findAll());
        return "animals";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("animal", new Animal());
        return "add-pet";
    }

    @PostMapping("/adding")
    public String add(@Valid Animal animal, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-pet";
        }

        animalService.add(animal);
        model.addAttribute("animals", animalService.findAll());
        return "animals";
    }

}
