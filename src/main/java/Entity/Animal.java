package Entity;

import Gestion.AgeValidatorException;

import java.io.Serializable;

    public abstract class Animal implements Serializable {

        private static long SerialVersionUID=1L;
        protected double taille;
        protected String espece;
        protected double poids;
        protected String nom;
        protected int age;
        public Animal(double taille, String espece, double poids, int age, String nom) {
            this.taille = taille;
            this.espece = espece;
            this.poids = poids;
            this.age = age;
            this.nom = nom;
        }
        public abstract void faireDubruit(String cri);

        @Override
        public String toString() {
            return this.taille+","+espece+","+poids+","+age+","+nom;
        }

        public double getTaille() {
            return taille;
        }

        public void setTaille(double taille) {
            this.taille = taille;
        }

        public String getEspece() {
            return espece;
        }

        public void setEspece(String espece) {
            this.espece = espece;
        }

        public double getPoids() {
            return poids;
        }

        public void setPoids(double poids) {
            this.poids = poids;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public void setAge(int age) throws AgeValidatorException {
            if(age<0){
                throw new AgeValidatorException("Age est négatif");
            }
            else this.age = age;
        }

        public  void description(){
            System.out.println("Nom : "+this.nom);
            System.out.println("Age : "+this.age);
            System.out.println("Taille : "+this.taille);
            System.out.println("Poids : "+this.poids);
            System.out.println("Espece : "+this.espece);

        }
        public void manger(){
            System.out.println(this.nom+ "est entrain de manger");
        }
        public void dormir(){
            System.out.println(this.nom+ "est entrain de dormir");
        }
    }

