package E_EX11_Strategy.clase;

public class Spectator {
    private int idSpectator;

    private IModVerificare modVerificare;

    public Spectator(int idSpectator, IModVerificare modVerificare) {
        this.idSpectator = idSpectator;
        this.modVerificare = modVerificare;
    }

    public int getIdSpectator() {
        return idSpectator;
    }

    public Spectator setModVerificare(IModVerificare modVerificare) {
        this.modVerificare = modVerificare;
        return this;
    }

    public void verificaLaSosire(){
        modVerificare.verifica();
    }
}
