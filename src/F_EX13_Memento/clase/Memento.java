package F_EX13_Memento.clase;

public class Memento {
    private String sofer;
    private double consum;

    public Memento(String sofer, double consum) {
        this.sofer = sofer;
        this.consum = consum;
    }

    public String getSofer() {
        return sofer;
    }

    public double getConsum() {
        return consum;
    }
}
