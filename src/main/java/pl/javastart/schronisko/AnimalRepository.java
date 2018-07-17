package pl.javastart.schronisko;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository {

    private List<Animal> animals;

    public AnimalRepository() {
        animals = new ArrayList<>();
        animals.add(new Animal("Klakier", "Super kot Gargamela", "https://vignette.wikia.nocookie.net/smerfy/images/e/e9/Klakier-odcinek.jpg/revision/latest?cb=20150225163512&path-prefix=pl"));
        animals.add(new Animal("Reksio", "Pieseł", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr2c930xpht5KLIiguBCHt93guksu2NNYRUg-51memYIEcjBhB"));
        animals.add(new Animal("Mrówka", "", ""));
        animals.add(new Animal("Żyrafa", "", ""));
        animals.add(new Animal("Słoń", "", ""));
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
