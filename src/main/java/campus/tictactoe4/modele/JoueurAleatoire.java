package campus.tictactoe4.modele;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoueurAleatoire extends Joueur {


    /**
     * initialisation des constantes
     */
    protected static final String NOM_JOUEUR_ALEATOIRE = "random";
    /**
     * Creation objet SecureRandom
     */
    private final Random aleatoire = new SecureRandom();

    /**
     * constructeur
     */
    public JoueurAleatoire(int indexJoueur)  {
        this.setNomJoueur(NOM_JOUEUR_ALEATOIRE+indexJoueur);
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
        retourCoordonnees.add(aleatoire.nextInt(taille)+1);
        retourCoordonnees.add(aleatoire.nextInt(taille)+1);
        return retourCoordonnees;
    }
}
