package B_EX9.clase;

public class Rezervare implements IRezervare {
    private int nrPersoane;

    public Rezervare(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public void rezerva() {
        System.out.println("A fost facuta o rezervare!");
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
