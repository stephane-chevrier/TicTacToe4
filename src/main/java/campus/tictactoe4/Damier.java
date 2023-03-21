package campus.tictactoe4;

import java.util.List;

public class Damier {

    /**
     * Creation variable d'instance
     */
    public final CaseDamier[][] plateauJeu;

    /**
     * Constructeur
     * @param taille taille du plateau de jeu
     */
    public Damier(int taille) {
        this.plateauJeu = initialiserDamier(taille);
    }

    /**
     * Fonction d'initialisation du damier
     * @param taille pour un plateau de nxn, taille = n
     * @return CaseDamier[][] : CaseDamier[taille][taille]
     */
    private CaseDamier[][] initialiserDamier(int taille) {
        CaseDamier[][] caseDamiers = new CaseDamier[taille + 1][taille + 1];
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= taille; j++) {
                caseDamiers[i][j] = new CaseDamier();
            }
        }
        return caseDamiers;
    }

        /**
     * methode d'entree du coup joue dans le damier
     * @param joueur joueur
     * @param coordonnees coordonnes de la case
     */
    public void setCasePlateau(Joueur joueur, List<Integer> coordonnees) {
        plateauJeu[coordonnees.get(0)][coordonnees.get(1)].setRepresentation(joueur.getRepresentationJoueur());
    }

    public CaseDamier[][] getPlateauJeu() {
        return plateauJeu;
    }

//    /**
//     * Fonction de vérification que la case n’est pas occupée
//     * @param coup
//     * @return boolean : true si la case est libre
//     */
//    public boolean verifCaseLibre(ArrayList<Integer> coup) {
//        return (plateau[coup.get(0)][coup.get(1)].getValue() == Player.CASE_VALUE[0]);
//    }

}
