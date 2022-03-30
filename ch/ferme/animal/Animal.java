
package ch.ferme.animal;

public class Animal {
    private int anneeNaissance ;
    private String race ;
    private String numero ;
    private String sexe = "femelle";
    private String commentaire ;

    public Animal (int anneeNaissance, String race) {
        System.out.println ("Je suis dans Animal() avec 2 params");
        this.anneeNaissance = anneeNaissance;
        this.race = race;
    }  

    public Animal (int anneeNaissance, String race, String numero) {
        this(anneeNaissance, race);
        System.out.println ("Je suis dans Animal() avec 3 params");
        this.numero = numero;
    }  
    

    public Animal() {
        System.out.println ("Je suis dans Animal");
    }
}
