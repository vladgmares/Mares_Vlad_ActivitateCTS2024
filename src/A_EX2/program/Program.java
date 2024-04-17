package A_EX2.program;

import A_EX2.clase.ETipPersonal;
import A_EX2.clase.PersonalSpital;
import A_EX2.clase.PersonalSpitalFactory;

public class Program {
    public static void main(String[] args) {
        PersonalSpitalFactory personalSpitalFactory = new PersonalSpitalFactory();
        PersonalSpital persoana_1 = null;
        PersonalSpital persoana_2 = null;
        try {
            persoana_1 = personalSpitalFactory.crearePersonal(ETipPersonal.MEDIC);
            persoana_2 = personalSpitalFactory.crearePersonal(ETipPersonal.BRANCARDIER);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        persoana_1.prezentare();
        persoana_2.prezentare();
    }
}
