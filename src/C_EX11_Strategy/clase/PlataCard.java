package C_EX11_Strategy.clase;

public class PlataCard implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Se plateste CARD suma de " + suma + " RON");
    }
}
