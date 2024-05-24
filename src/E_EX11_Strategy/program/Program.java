package E_EX11_Strategy.program;

import E_EX11_Strategy.clase.Spectator;
import E_EX11_Strategy.clase.VerificarePeluza;
import E_EX11_Strategy.clase.VerificareTribuna;
import E_EX11_Strategy.clase.VerificareVIP;

public class Program {
    public static void main(String[] args) {
        Spectator spectator1 = new Spectator(1, new VerificareVIP());
        spectator1.verificaLaSosire();
    }
}
