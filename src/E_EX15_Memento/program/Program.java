package E_EX15_Memento.program;

import E_EX15_Memento.clase.Caretaker;
import E_EX15_Memento.clase.Meci;

public class Program {
    public static void main(String[] args) {
        Meci meci1 = new Meci("20 decembrie", 100, 10);
        Caretaker managerMeciuri = new Caretaker();

        managerMeciuri.adaugaVersiune(meci1.salvareMeci());
        meci1.setEchipa1("Romania");
        meci1.setEchipa2("Franta");
        managerMeciuri.adaugaVersiune(meci1.salvareMeci());
        System.out.println(meci1);
        System.out.println("\n---Recuperare versiuni --");
        meci1.refacereVersiune(managerMeciuri.recuperareVersiune(0));
        System.out.println(meci1);



    }

}
