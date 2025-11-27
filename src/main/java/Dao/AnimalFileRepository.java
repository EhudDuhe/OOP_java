package Dao;
import Entity.Animal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

    public class AnimalFileRepository implements AnimalRepository {
        String filename;
        public AnimalFileRepository(String filename){
            this.filename=filename;
        }
        @Override
        public void save(List<Animal> animaux) {
            try {
                ObjectOutputStream enregistreurObjet;
                FileOutputStream enregistreuFichier=new FileOutputStream(filename);
                enregistreurObjet=new ObjectOutputStream(enregistreuFichier);
                enregistreurObjet.writeObject(animaux);


            } catch (Exception e) {
                throw new RuntimeException(e);
            }


        }


        @Override
        public List<Animal> load() {
            try {
                ObjectInputStream chargeur;
                FileInputStream chargeurFichier=new FileInputStream(filename);
                chargeur=new ObjectInputStream(chargeurFichier);
                List<Animal>animaux=(List<Animal>) chargeur.readObject();
                return animaux;


            } catch (Exception e) {
                throw new RuntimeException(e);
            }




        }

        @Override
        public void update(Animal animal) {

        }

        @Override
        public void delete(Animal animal) {

        }
    }

