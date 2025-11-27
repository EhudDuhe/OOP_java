package Entity;

import Interface.Parlant;
import Interface.Volant;

    public class Perroquet extends Oiseau implements Volant, Parlant {
        private static long SerialVersionUID=1L;
        public Perroquet(double taille, String espece, double poids, int age, String nom, double envergureAiles) {
            super(taille, espece, poids, age, nom, envergureAiles);
        }

        @Override
        public void voler(double distance) {
            System.out.println(this.nom+"vole à une distance de"+distance);
        }

        @Override
        public void parler(String langue) {
            System.out.println(this.nom+" parle en "+langue);
        }

        @Override
        public void faireDubruit(String cri) {
            System.out.println(this.nom+" est entrain de "+cri);
        }
    }

