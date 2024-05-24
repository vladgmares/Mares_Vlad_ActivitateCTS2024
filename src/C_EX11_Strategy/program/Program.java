package C_EX11_Strategy.program;

import C_EX11_Strategy.clase.BonFiscal;
import C_EX11_Strategy.clase.PlataCard;
import C_EX11_Strategy.clase.PlataCash;

public class Program {
    public static void main(String[] args) {
        BonFiscal bf1 = new BonFiscal(1, new PlataCard(), 21.2);
        bf1.achita();
        bf1.setModPlata(new PlataCash());
        bf1.achita();
    }
}
