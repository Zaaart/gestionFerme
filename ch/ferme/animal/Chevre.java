package ch.ferme.animal;

public class Chevre extends Animal implements IAnimal{
        public void seDeplacer() {
            marcher();
        }

        public void marcher() {
            System.out.println ("La chevre marcher");
        }
}