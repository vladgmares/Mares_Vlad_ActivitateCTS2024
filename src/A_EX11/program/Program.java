package A_EX11.program;

import A_EX11.clase.ModPlataCard;
import A_EX11.clase.ModPlataCash;
import A_EX11.clase.PlataPacient;

public class Program {
    public static void main(String[] args) {
        // DP Strategy
        PlataPacient plata1 = new PlataPacient("Doru");

        plata1.setModPlata(new ModPlataCard());
        plata1.efectuarePlata(123);

        plata1.setModPlata(new ModPlataCash());
        plata1.efectuarePlata(500);
    }
}
