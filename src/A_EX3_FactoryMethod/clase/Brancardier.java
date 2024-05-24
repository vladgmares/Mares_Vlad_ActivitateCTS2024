package A_EX3_FactoryMethod.clase;



public class Brancardier implements PersonalSpital {
    private String nume;

    public Brancardier(String nume) {
        this.nume = nume;
    }

    @Override
    public void prezentare() {
        System.out.println("Numele meu este " + this.nume + " si sunt Brancardier.");
    }
}
