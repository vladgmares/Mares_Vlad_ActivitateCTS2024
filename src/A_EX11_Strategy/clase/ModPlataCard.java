package A_EX11_Strategy.clase;

public class ModPlataCard implements IModPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Pacientul plateste cu CARD suma de " + suma + " RON.");
    }
}
