package A_EX3.clase;

public class Medic implements PersonalSpital {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void prezentare() {
        System.out.println("Numele meu este " + this.nume + " si sunt Medic.");
    }
}
