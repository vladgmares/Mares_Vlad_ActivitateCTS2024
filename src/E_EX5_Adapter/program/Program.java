package E_EX5_Adapter.program;

import E_EX5_Adapter.clase.Adapter;
import E_EX5_Adapter.clase.IBilet;

public class Program {
    public static void main(String[] args) {
        IBilet bilet = new Adapter();
        bilet.rezervaOnline("Bilet_meci");
    }
}
