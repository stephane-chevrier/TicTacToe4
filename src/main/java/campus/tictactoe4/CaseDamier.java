package campus.tictactoe4;

public class CaseDamier {

    /**
     * Initialisation des constantes
     */
    protected static final String CASE_VIDE_VALUE = " ";

    /**
     * creation variables d'instance
     */
    private String representation;

    /**
     * constructeur
     */
    protected CaseDamier() {
        this.representation = CASE_VIDE_VALUE;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation) {
        this.representation = representation;
    }
}
