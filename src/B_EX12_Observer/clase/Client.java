package B_EX12_Observer.clase;

public class Client implements IObserver{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Clientul " + this.nume + " a primit mesajul: " + mesaj);
    }
}
