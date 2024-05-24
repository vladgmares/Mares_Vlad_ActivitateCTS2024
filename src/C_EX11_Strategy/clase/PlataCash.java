package C_EX11_Strategy.clase;

public class PlataCash implements IModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Se plateste CASH suma de " + suma + " RON");
    }
}
