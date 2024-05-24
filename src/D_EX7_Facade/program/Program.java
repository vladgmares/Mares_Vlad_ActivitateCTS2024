package D_EX7_Facade.program;

import D_EX7_Facade.clase.Facade;
import D_EX7_Facade.clase.Persoana;

public class Program {
    public static void main(String[] args) {
        Persoana p1 = new Persoana("Vlad", 20, true, true);

        Facade facade = new Facade();
        facade.verificaPersoana(p1);
    }
}
