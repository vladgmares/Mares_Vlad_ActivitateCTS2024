package A_EX3_FactoryMethod.program;

import A_EX3_FactoryMethod.clase.Factory;
import A_EX3_FactoryMethod.clase.FactoryBrancardier;
import A_EX3_FactoryMethod.clase.PersonalSpital;

public class Program {
    public static void main(String[] args) {
        Factory fabrica = new FactoryBrancardier();
        PersonalSpital p1 = fabrica.crearePersonal("Daniel");
        p1.prezentare();
    }
}
