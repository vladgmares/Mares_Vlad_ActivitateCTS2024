package B_EX7.clase;

public class NotaPlata implements INotaPlata{
    private int cod;
    private double total;

    public NotaPlata(int cod, double total) {
        this.cod = cod;
        this.total = total;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota de plata Nr.#" + this.cod +" are TOTAL="+this.total +" RON.");
    }
}
