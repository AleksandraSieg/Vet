package pl.madison.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.madison.domain.Animal;
import pl.madison.domain.Visit;
import pl.madison.services.AnimalService;
import pl.madison.services.VisitService;

import javax.validation.Valid;

@Controller
@RequestMapping("/visit")
public class VisitController {

    @Autowired
    private VisitService visitService;

    @Autowired
    private AnimalService animalService;

    @GetMapping("/find-all")
    public String findAll(Model model) {
        model.addAttribute("visits", visitService.findAll());
        return "visits";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("visit", new Visit());
        model.addAttribute("animals", animalService.findAll());
        return "add-visit";
    }

    @PostMapping("/adding")
    public String add(@Valid Visit visit, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-visit";
        }

        visitService.add(visit);
        model.addAttribute("visits", visitService.findAll());
        return "visits";
    }

}
