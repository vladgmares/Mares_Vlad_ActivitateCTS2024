package E_EX15_Memento.clase;

public class Meci {
    private String data;
    private String echipa1;
    private String echipa2;
    private int nrSpectatori;
    private int nrBileteVandute;
    private int nrJandarmi;

    public Meci(String data, int nrBileteVandute, int nrJandarmi) {
        this.data = data;
        this.nrBileteVandute = nrBileteVandute;
        this.nrJandarmi = nrJandarmi;
    }

    public String getData() {
        return data;
    }

    public String getEchipa1() {
        return echipa1;
    }

    public String getEchipa2() {
        return echipa2;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public int getNrBileteVandute() {
        return nrBileteVandute;
    }

    public int getNrJandarmi() {
        return nrJandarmi;
    }

    public Meci setData(String data) {
        this.data = data;
        return this;
    }

    public Meci setEchipa1(String echipa1) {
        this.echipa1 = echipa1;
        return this;
    }

    public Meci setEchipa2(String echipa2) {
        this.echipa2 = echipa2;
        return this;
    }

    public Meci setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
        return this;
    }

    public Meci setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
        return this;
    }

    public Meci setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
        return this;
    }

    @Override
    public String toString() {
        return "Meci{" +
                "data='" + data + '\'' +
                ", echipa1='" + echipa1 + '\'' +
                ", echipa2='" + echipa2 + '\'' +
                ", nrSpectatori=" + nrSpectatori +
                ", nrBileteVandute=" + nrBileteVandute +
                ", nrJandarmi=" + nrJandarmi +
                '}';
    }
    public Memento salvareMeci(){
        System.out.println("A fost salvat meciul!");
        return new Memento(this.nrSpectatori, this.echipa1, this.echipa2, this.data);
    }
    public void refacereVersiune(Memento memento) {
        this.echipa1 = memento.getEchipa1();
        this.echipa2 = memento.getEchipa2();
        this.data = memento.getData();
        this.nrSpectatori = memento.getNrSpectatori();
    }

}
