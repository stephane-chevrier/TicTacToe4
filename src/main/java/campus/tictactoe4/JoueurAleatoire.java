package campus.tictactoe4;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JoueurAleatoire extends Joueur {

    /**
     * Creation objet SecureRandom
     */
    private final Random aleatoire = SecureRandom.getInstanceStrong();

    /**
     * constructeur
     */
    public JoueurAleatoire(int indexJoueur) throws NoSuchAlgorithmException {
        super.setNomJoueur(Joueur.NOM_JOUEUR_ALEATOIRE+indexJoueur);
        super.setRepresentationJoueur(indexJoueur);
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
