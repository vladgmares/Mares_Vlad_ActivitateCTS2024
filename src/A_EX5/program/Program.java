package A_EX5.program;

import A_EX5.clase.Adapter;
import A_EX5.clase.Medicament;
import A_EX5.clase.MedicamentFarmacie;
import A_EX5.clase.MedicamentSpital;

public class Program {
    public static void main(String[] args) {
        Medicament medicamentSpital= new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie = new Adapter(medicamentSpital);

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
    }
}
