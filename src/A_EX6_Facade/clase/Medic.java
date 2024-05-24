package A_EX6_Facade.clase;

public class Medic {
    private String nume;
    private String specializare;

    public Medic(String nume, String specializare) {
        this.nume = nume;
        this.specializare = specializare;
    }

    public String getNume() {
        return nume;
    }

    public Medic setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public String getSpecializare() {
        return specializare;
    }

    public Medic setSpecializare(String specializare) {
        this.specializare = specializare;
        return this;
    }

    @Override
    public String toString() {
        return "Medic{" +
                "nume='" + nume + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }

    public boolean deInternat(Pacient pacient) {
        if(pacient.getStareSanatate().getSeveritate() >= 1) {
            return true;
        }
        return false;
    }
}
