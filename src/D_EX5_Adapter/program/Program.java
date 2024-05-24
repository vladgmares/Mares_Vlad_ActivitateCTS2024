package D_EX5_Adapter.program;

import D_EX5_Adapter.clase.Adapter;
import D_EX5_Adapter.clase.Client;
import D_EX5_Adapter.clase.ICredit;
import D_EX5_Adapter.clase.ICreditareVeche;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Vlad", false);

        ICreditareVeche adapter = new Adapter();
        adapter.creditare(client.isEligibilCredit());

    }
}
