package A_EX15_Command.clase;

public class Medic {
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void trateaza(String pacient) {
        System.out.println("Medicul " + this.nume + " trateaza pacientul " + pacient);
    }
    public void interneaza(String pacient) {
        System.out.println("Medicul " + this.nume + " interneaza pacientul " + pacient);
    }
}
