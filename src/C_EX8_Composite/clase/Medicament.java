package C_EX8_Composite.clase;

public class Medicament implements INod{
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adaugaNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(INod nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public INod getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisareNod(String indent) {
        System.out.println(indent + "Medicamentul " + this.nume + " pret " + this.pret);
    }
}
