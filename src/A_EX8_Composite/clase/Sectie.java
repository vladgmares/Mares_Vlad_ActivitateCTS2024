package A_EX8_Composite.clase;

public class Sectie extends ANod{
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        super();
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public int getNrAngajati() {
        return this.nrAngajati;
    }

    @Override
    public String getNume() {
        return this.numeSectie;
    }

    @Override
    public void add(ANod fiu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(ANod fiu) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ANod getFiu(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare() {
        System.out.println("Sectia: "+this.numeSectie.toUpperCase());
    }
}
