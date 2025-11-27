package Entity;

    public abstract class Oiseau extends Animal {
        private static long SerialVersionUID=1L;
        private double envergureAiles;


        public Oiseau(double taille, String espece, double poids, int age, String nom,double envergureAiles) {
            super(taille, espece, poids, age, nom);
            this.envergureAiles=envergureAiles;
        }

        @Override
        public String toString() {
            return super.toString()+","+envergureAiles;
        }

        public void description(){
            super.description();
            System.out.println("Envergure :"+this.envergureAiles);
        }
    }

