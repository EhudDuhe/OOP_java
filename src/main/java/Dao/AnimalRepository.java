package Dao;
import Entity.Animal;

import java.util.List;

public interface AnimalRepository {

        public void save(List<Animal> animals);
        public List<Animal> load();
        public void update(Animal animal);
        public void delete(Animal animal);

    }

