package ch.ferme.animal;

public class Volaille extends Animal implements IAnimal{

    public Volaille() {
        super(2022, "poule pondueuse", "P002");
        System.out.println ("Je suis dans Volaille");
    }

    public void setNbrOeufs ( int nbrOeufs ) {
        this.nbrOeufs = nbrOeufs;
    }

    public int getNbrOeufs () {
        return nbrOeufs;
    }

    public void seDeplacer() {
        System.out.println ("La volaille vole");
    }

    private int nbrOeufs = 5;
}
