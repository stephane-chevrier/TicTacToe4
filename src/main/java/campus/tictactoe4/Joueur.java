package campus.tictactoe4;

import java.util.List;

public abstract class Joueur {

    /**
     * initialisation des constantes
     */
    protected static final String NOM_JOUEUR_ALEATOIRE = "random";

    /**
     * tableau des représentations des joueurs, joueur n°1 a l'index 1
     */
    private static final String[] REPRESENTATION_JOUEUR = {"","X","O","H"};

    /**
     * Initialisation variables d'instance
     */
    private String nomJoueur;
    private String representationJoueur;

    /**
     * constructeur
     */
    protected Joueur() {
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getRepresentationJoueur() {
        return representationJoueur;
    }

    public void setRepresentationJoueur(int indexJoueur) {
        this.representationJoueur = REPRESENTATION_JOUEUR[indexJoueur];
    }

    /**
     * Methode de choix des coordonnees
     * @param taille taille du plateau
     * @return ArrayList<Integer> : {Y,X}
     */
    public abstract List<Integer> setCoupJoueur(int taille);

}
