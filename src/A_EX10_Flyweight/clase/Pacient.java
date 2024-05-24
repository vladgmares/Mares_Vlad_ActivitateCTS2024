package A_EX10_Flyweight.clase;

public class Pacient {
    private String nrTelefon;
    private String nume;

    public Pacient(String nrTelefon, String nume) {
        this.nrTelefon = nrTelefon;
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public Pacient setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
        return this;
    }

    public String getNume() {
        return nume;
    }

    public Pacient setNume(String nume) {
        this.nume = nume;
        return this;
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nrTelefon='" + nrTelefon + '\'' +
                ", nume='" + nume + '\'' +
                '}';
    }
}
