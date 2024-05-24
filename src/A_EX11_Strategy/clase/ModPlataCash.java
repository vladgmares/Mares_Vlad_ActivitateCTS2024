package A_EX11_Strategy.clase;

public class ModPlataCash implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul plateste CASH suma de " + suma + " RON.");
    }
}
