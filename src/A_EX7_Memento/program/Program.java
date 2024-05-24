package A_EX7_Memento.program;

import A_EX7_Memento.clase.ETipRezultat;
import A_EX7_Memento.clase.ManagerRezultate;
import A_EX7_Memento.clase.Rezultat;

public class Program {
    public static void main(String[] args) throws Exception {
        Rezultat rezultat = new Rezultat("Vlad", ETipRezultat.ELECTRONIC);
        System.out.println(rezultat);
        ManagerRezultate managerRezultate = new ManagerRezultate();
//        managerRezultate.adaugaVersiuni(rezultat.salvareStare());
        rezultat.setModalitateTrimitere(ETipRezultat.PRINTAT);
        System.out.println(rezultat);
        System.out.println("Recuperare versiune");
        rezultat.refacereStare(managerRezultate.recuperareUltimaVersiune());

        System.out.println(rezultat);

    }
}
