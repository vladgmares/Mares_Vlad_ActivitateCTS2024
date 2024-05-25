package A_EX15_Command.program;

import A_EX15_Command.clase.*;

public class Program {
    public static void main(String[] args) {
        // executant
        Medic medic = new Medic("Dr.Gigel");

        //pacienti
        IComanda pacient1 = new Internare(medic, "John");
        IComanda pacient2 = new Tratare(medic, "Doe");

        Operator operator = new Operator();
        operator.adaugaPacient(pacient1);
        operator.adaugaPacient(pacient2);
        operator.executaTriaj();

    }
}
