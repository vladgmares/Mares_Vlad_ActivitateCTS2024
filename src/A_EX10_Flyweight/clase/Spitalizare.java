package A_EX10_Flyweight.clase;

public class Spitalizare implements Flyweight{

    private int nrSalon;
    private int nrZileSpitalizare;

    public Spitalizare(int nrSalon, int nrZileSpitalizare) {
        this.nrSalon = nrSalon;
        this.nrZileSpitalizare = nrZileSpitalizare;
    }

    @Override
    public String toString() {
        return "Spitalizare{" +
                "nrSalon=" + nrSalon +
                ", nrZileSpitalizare=" + nrZileSpitalizare +
                '}';
    }

    @Override
    public void afisare(Pacient pacient) {
        System.out.println(this.toString() + pacient.toString());
    }
}
