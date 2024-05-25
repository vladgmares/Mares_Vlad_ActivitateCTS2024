package C_EX15_Command.program;

import C_EX15_Command.clase.AjutorFarmacist;
import C_EX15_Command.clase.Comanda;
import C_EX15_Command.clase.Farmacist;
import C_EX15_Command.clase.IComanda;

public class Program {
    public static void main(String[] args) {
        //executant - ajutorFarmacist
        AjutorFarmacist ajutorFarmacist = new AjutorFarmacist("Gigel");

        //comenzi
        IComanda c1 = new Comanda("aspirina, paracetamol, nurofen", ajutorFarmacist);
        IComanda c2 = new Comanda("siro, crema", ajutorFarmacist);

        Farmacist farmacist = new Farmacist();
        farmacist.adaugaComanda(c1);
        farmacist.adaugaComanda(c2);

        //trimitere aducere din depozit
        farmacist.trimiteComenzile();
    }
}
