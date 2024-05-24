package F_EX13_Memento.program;

import F_EX13_Memento.clase.Autobuz;
import F_EX13_Memento.clase.Caretaker;
import F_EX13_Memento.clase.Memento;

import javax.swing.text.Caret;

public class Program {
    public static void main(String[] args) {
        Caretaker managerAutobuze = new Caretaker();
        Autobuz autobuz1 = new Autobuz("Otokar", 2024, 60);
        managerAutobuze.adaugaVersiuni(autobuz1.salvareAutobuz());
        System.out.println(autobuz1.toString());
        autobuz1.setSofer("Vlad");
        managerAutobuze.adaugaVersiuni(autobuz1.salvareAutobuz());
        System.out.println(autobuz1.toString());
        autobuz1.setConsumMediu(5.6);
        managerAutobuze.adaugaVersiuni(autobuz1.salvareAutobuz());
        System.out.println(autobuz1.toString());

        System.out.println("\n---Nr versiuni de autobuz salvate: " + managerAutobuze.getNrStari());
        System.out.println("---- UNDO 1 pas ----");
        autobuz1.refacereVersiune(managerAutobuze.recuperareVersiuni(1));
        System.out.println(autobuz1);
        System.out.println("---- UNDO 2 pas ----");
        autobuz1.refacereVersiune(managerAutobuze.recuperareVersiuni(0));
        System.out.println(autobuz1);
    }
}
