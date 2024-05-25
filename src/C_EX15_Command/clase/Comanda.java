package C_EX15_Command.clase;

public class Comanda implements IComanda{
    private String medicamente;
    private AjutorFarmacist ajutorFarmacist;

    public Comanda(String medicamente, AjutorFarmacist ajutorFarmacist) {
        this.medicamente = medicamente;
        this.ajutorFarmacist = ajutorFarmacist;
    }

    @Override
    public void prelucreaza() {
        ajutorFarmacist.aduceMedicamente(medicamente);
    }
}
