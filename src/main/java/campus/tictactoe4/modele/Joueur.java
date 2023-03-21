package campus.tictactoe4.modele;

import java.util.List;

public abstract class Joueur {

    /**
     * initialisation des constantes
     */
    protected static final String NOM_JOUEUR_ALEATOIRE = "random";

    /**
     * Initialisation variables d'instance
     */
    private String nomJoueur;
    private int indexJoueur;

    /**
     * constructeur
     */
    protected Joueur() {
    }

    protected Joueur(String nomJoueur, int indexJoueur) {
        this.nomJoueur = nomJoueur;
        this.indexJoueur = indexJoueur;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public int getIndexJoueur() {
        return indexJoueur;
    }

    public void setIndexJoueur(int indexJoueur) {
        this.indexJoueur = indexJoueur;
    }

    /**
     * Methode de choix des coordonnees
     * @param taille taille du plateau
     * @return ArrayList<Integer> : {Y,X}
     */
    public List<Integer> setCoupJoueur(int taille) {
        return null;
    }
}
