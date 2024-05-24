package C_EX11_Strategy.clase;

public class BonFiscal {
    private int nrBon;
    private IModPlata modPlata;
    private double totalPlata;

    public BonFiscal(int nrBon, IModPlata modPlata, double totalPlata) {
        this.nrBon = nrBon;
        this.modPlata = modPlata;
        this.totalPlata = totalPlata;
    }

    public BonFiscal setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
        return this;
    }

    public void achita() {
        modPlata.plateste(this.totalPlata);
    }
}
