package campus.tictactoe4.modele;

import java.util.ArrayList;
import java.util.List;

public class JoueurHumain extends Joueur {

    /**
     * constructeur
     */
    public JoueurHumain(String nomJoueur, int indexJoueur) {
        this.setNomJoueur(nomJoueur);
        this.setIndexJoueur(indexJoueur);
    }

    /**
     * Methode de choix aleatoire des coordonnees
     * @param taille taille du plateau
     * @return ArrayList<Integer> : {Y,X}
     */
    @Override
    public List<Integer> setCoupJoueur(int taille) {
        List<Integer> retourCoordonnees = new ArrayList<>();
        // ToDo
        return retourCoordonnees;
    }
}
