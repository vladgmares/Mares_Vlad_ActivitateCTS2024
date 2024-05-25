package A_EX15_Command.clase;

public class Tratare implements IComanda{
    private Medic medic;
    private String numePacient;

    public Tratare(Medic medic, String numePacient) {
        this.medic = medic;
        this.numePacient = numePacient;
    }

    @Override
    public void actiune() {
        medic.trateaza(numePacient);
    }
}
