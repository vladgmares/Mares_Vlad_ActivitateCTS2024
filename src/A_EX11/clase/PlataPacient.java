package A_EX11.clase;

public class PlataPacient {
    private String numePacient;
    private IModPlata modPlata;

    public PlataPacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public PlataPacient setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
        return this;
    }
    public void efectuarePlata(double suma){
        modPlata.plateste(suma);
    }
}
