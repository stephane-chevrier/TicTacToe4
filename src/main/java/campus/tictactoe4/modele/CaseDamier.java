package campus.tictactoe4.modele;

public class CaseDamier {

    /**
     * creation variables d'instance
     */
    private Pion pion;

    /**
     * constructeur
     */
    protected CaseDamier() {
        this.pion = new Pion(0);
    }

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }
}
