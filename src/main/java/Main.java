
import Dao.AnimalFileRepository;
import Entity.Animal;
import Entity.ChauveSouris;
import Entity.Perroquet;

import java.util.ArrayList;
import java.util.List;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {


            Animal animal=new Perroquet(5,"XXW",8,0,"Coco",4);
            Animal animal2=new ChauveSouris(5,"eec",4,5,"eer","brun");
            //enregistrement
            AnimalFileRepository animalFileRepository=new AnimalFileRepository("anim.txt");
            List<Animal>animals=new ArrayList<>();
            animals.add(animal);
            animals.add(animal2);
            animalFileRepository.save(animals);
            System.out.println(animal.toString());





        }
    }

