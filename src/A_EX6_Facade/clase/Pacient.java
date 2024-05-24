package A_EX6_Facade.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private StareSanatate stareSanatate;

    public Pacient(String nume, int varsta, StareSanatate stareSanatate) {
        this.nume = nume;
        this.varsta = varsta;
        this.stareSanatate = stareSanatate;
    }

    public String getNume() {
        return nume;
    }

    public Pacient setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public int getVarsta() {
        return varsta;
    }

    public Pacient setVarsta(int varsta) {
        this.varsta = varsta;
        return this;
    }

    public StareSanatate getStareSanatate() {
        return stareSanatate;
    }

    public Pacient setStareSanatate(StareSanatate stareSanatate) {
        this.stareSanatate = stareSanatate;
        return this;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", stareSanatate=" + stareSanatate +
                '}';
    }
}
