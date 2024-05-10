package B_EX9.clase;

public class ProxyRezervare implements IRezervare{
    private Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void rezerva() {
        if(rezervare.getNrPersoane() < 4){
            System.out.println("Nu se poate face o rezervare pentru mai putin de 4 persoane!");
        } else {
            rezervare.rezerva();
        }
    }
}
