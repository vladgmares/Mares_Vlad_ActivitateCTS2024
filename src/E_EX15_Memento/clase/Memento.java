package E_EX15_Memento.clase;

public class Memento {
    private int nrSpectatori;
    private String echipa1;
    private String echipa2;
    private String data;

    public Memento(int nrSpectatori, String echipa1, String echipa2, String data) {
        this.nrSpectatori = nrSpectatori;
        this.echipa1 = echipa1;
        this.echipa2 = echipa2;
        this.data = data;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getEchipa1() {
        return echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public String getData() {
        return data;
    }
}
