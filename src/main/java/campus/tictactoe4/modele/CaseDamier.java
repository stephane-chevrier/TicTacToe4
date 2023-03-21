package campus.tictactoe4.modele;

import java.util.List;

public class CaseDamier {

    /**
     * Initialisation des constantes
     */
    protected static final Joueur CASE_VIDE_VALUE = new JoueurVide();

    /**
     * creation variables d'instance
     */
    private Joueur proprietaire;

    /**
     * constructeur
     */
    protected CaseDamier() {
        this.proprietaire = CASE_VIDE_VALUE;
    }

    protected void setJoueur(Joueur joueur) {
        this.proprietaire=joueur;
    }
}
