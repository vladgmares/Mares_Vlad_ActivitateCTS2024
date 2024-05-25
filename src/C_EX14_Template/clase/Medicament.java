package C_EX14_Template.clase;

public class Medicament {
    private String nume;
    private int cantitate;

    public Medicament(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public int getCantitate() {
        return cantitate;
    }

    public Medicament setCantitate(int cantitate) {
        this.cantitate = cantitate;
        return this;
    }
}
