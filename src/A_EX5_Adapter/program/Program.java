package A_EX5_Adapter.program;

import A_EX5_Adapter.clase.Adapter;
import A_EX5_Adapter.clase.Medicament;
import A_EX5_Adapter.clase.MedicamentFarmacie;
import A_EX5_Adapter.clase.MedicamentSpital;

public class Program {
    public static void main(String[] args) {
        Medicament medicamentSpital= new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie = new Adapter(medicamentSpital);

        medicamentSpital.achizitioneazaMedicament();
        medicamentFarmacie.cumparaMedicament();
    }
}
