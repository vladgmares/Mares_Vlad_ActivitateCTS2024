package A_EX15_Command.clase;

public class Internare implements IComanda{
    private Medic medic;
    private String numePacient;

    public Internare(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void actiune() {
        medic.interneaza(numePacient);
    }
}
