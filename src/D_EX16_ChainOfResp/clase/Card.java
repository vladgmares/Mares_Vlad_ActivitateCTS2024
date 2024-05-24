package D_EX16_ChainOfResp.clase;

public class Card {
    private String nume;
    private double sold;

    public Card(String nume, double sold) {
        this.nume = nume;
        this.sold = sold;
    }

    public String getNume() {
        return nume;
    }

    public Card setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public double getSold() {
        return sold;
    }

    public Card setSold(double sold) {
        this.sold = sold;
        return this;
    }
}
