package pl.javastart.schronisko;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private AnimalRepository animalRepository;

    public MainController(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        List<Animal> animals = animalRepository.getAnimals();

        model.addAttribute("zwierzaczki", animals);

        return "animals"; // animals.html
    }



}
