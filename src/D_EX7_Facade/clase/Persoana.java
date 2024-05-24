package D_EX7_Facade.clase;

public class Persoana {
    private String nume;
    private int varsta;
    private boolean cazier;
    private boolean datornic;

    public Persoana(String nume, int varsta, boolean cazier, boolean datornic) {
        this.nume = nume;
        this.varsta = varsta;
        this.cazier = cazier;
        this.datornic = datornic;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean isCazier() {
        return cazier;
    }

    public boolean isDatornic() {
        return datornic;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", cazier=" + cazier +
                ", datornic=" + datornic +
                '}';
    }
}
