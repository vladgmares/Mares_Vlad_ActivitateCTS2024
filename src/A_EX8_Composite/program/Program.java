package A_EX8_Composite.program;

import A_EX8_Composite.clase.ANod;
import A_EX8_Composite.clase.Departament;
import A_EX8_Composite.clase.Sectie;

public class Program {
    public static void main(String[] args) {
        ANod spital = new Departament("Spital");
        ANod departament1 = new Departament("Chirurgie");
        ANod departament2 = new Departament("ATI");
        ANod sectie1 = new Sectie("Chirurgie pediatrica", 10);
        ANod sectie2 = new Sectie("Chirurgie generala", 30);

        spital.add(departament1);
        spital.add(departament2);
        departament1.add(sectie1);
        departament2.add(sectie2);

        spital.afisare();


    }
}
