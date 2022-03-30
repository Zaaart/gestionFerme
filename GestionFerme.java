
import ch.ferme.animal.*;

import java.util.List;
import java.util.ArrayList;

public class GestionFerme {
    
    public static void main (String[] args) {
        System.out.println ("Test de Gestion Ferme");
        Volaille v = new Volaille();
        List<Vache> mesVaches = creerListeVaches();
    }

    public static List<Vache> creerListeVaches() {
        List<Vache> listeVaches = new ArrayList<Vache>();
        Vache v = new Vache(2019, "Holstein", "V003");
        listeVaches.add( v );
        listeVaches.add( new Vache(2020, "Holstein", "V004"));
        listeVaches.add( new Vache(2021, "Simental", "V010"));
        listeVaches.add( new Vache(2019, "Holstein", "V023"));
        listeVaches.add( new Vache(2021, "Brune", "V041"));
        return listeVaches;
    }


}
