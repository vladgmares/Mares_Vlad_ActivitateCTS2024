package A_EX11.clase;

public class ModPlataCash implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul plateste CASH suma de " + suma + " RON.");
    }
}
