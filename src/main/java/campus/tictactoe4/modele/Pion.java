package campus.tictactoe4.modele;

public class Pion {

    /**
     * Initialisation des constantes
     */
    private static final char[] REPRESENTATION_TICTACTOE = {' ','X','O','H'};

    /**
     * creation variables d'instance
     */
    private char representation;

    private int indexJoueur;

    /**
     * constructeur
     */
    protected Pion(int indexJoueur) {
        this.representation = REPRESENTATION_TICTACTOE[indexJoueur];
        this.indexJoueur = indexJoueur;
    }

    protected Pion(char representation, int indexJoueur) {
        this.representation = representation;
        this.indexJoueur = indexJoueur;
    }

    public char getRepresentation() {
        return representation;
    }

    public void setRepresentation(char representation) {
        this.representation = representation;
    }

    public int getIndexJoueur() {
        return indexJoueur;
    }

    public void setIndexJoueur(int indexJoueur) {
        this.indexJoueur = indexJoueur;
    }
}
