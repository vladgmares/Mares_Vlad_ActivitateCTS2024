package A_EX5.clase;

public class MedicamentSpital implements Medicament{
    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("Reteta verificata! Medicament cu reteta din spital!");
    }

    @Override
    public void prezintaReteta() {
        System.out.println("Reteta valida!");
    }
}
