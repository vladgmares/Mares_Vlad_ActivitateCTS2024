package A_EX2.program;

import A_EX2.clase.Factory;
import A_EX2.clase.FactoryBrancardier;
import A_EX2.clase.PersonalSpital;

public class Program {
    public static void main(String[] args) {
        Factory fabrica = new FactoryBrancardier();
        PersonalSpital p1 = fabrica.crearePersonal("Daniel");
        p1.prezentare();
    }
}
