package A_EX3_FactoryMethod.clase;



public class Asistent implements PersonalSpital {
    private String nume;

    public Asistent(String nume) {
        this.nume = nume;
    }

    @Override
    public void prezentare() {
        System.out.println("Numele meu este " + this.nume + " si sunt Asistent.");
    }
}
