package F_EX13_Memento.clase;

public class Autobuz {
    private String sofer;
    private double consumMediu;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(String model, int anFabricatie, int nrLocuri) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.nrLocuri = nrLocuri;
    }

    public String getSofer() {
        return sofer;
    }

    public Autobuz setSofer(String sofer) {
        this.sofer = sofer;
        return this;
    }

    public double getConsumMediu() {
        return consumMediu;
    }

    public Autobuz setConsumMediu(double consumMediu) {
        this.consumMediu = consumMediu;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Autobuz setModel(String model) {
        this.model = model;
        return this;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public Autobuz setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
        return this;
    }

    public int getNrLocuri() {
        return nrLocuri;
    }

    public Autobuz setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
        return this;
    }

    @Override
    public String toString() {
        return "Autobuz{" +
                "sofer='" + sofer + '\'' +
                ", consumMediu=" + consumMediu +
                ", model='" + model + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", nrLocuri=" + nrLocuri +
                '}';
    }
    public Memento salvareAutobuz() {
        System.out.println("Salvare stare autobuz");
        return new Memento(this.sofer, this.consumMediu);
    }

    public void refacereVersiune(Memento memento) {
        if(memento != null) {
            this.sofer = memento.getSofer();
            this.consumMediu = memento.getConsum();
        } else {
            System.out.println("Nu exista aceasta versiune!");
        }
    }
}
