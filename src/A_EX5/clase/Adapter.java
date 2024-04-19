package A_EX5.clase;

public class Adapter extends MedicamentFarmacie{
    private Medicament medicament;
    public Adapter(Medicament medicament) {
        this.medicament =  medicament;
    }

    @Override
    public void cumparaMedicament() {
        super.cumparaMedicament();
    }
}
