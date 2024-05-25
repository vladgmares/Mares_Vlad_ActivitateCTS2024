package B_EX12_Observer.program;


import B_EX12_Observer.clase.Client;
import B_EX12_Observer.clase.Oferta;

public class Program {
    public static void main(String[] args) {
        Client client1 = new Client("Vlad");
        Client client2 = new Client("Ana");
        Client client3 = new Client("Gica");

        Oferta oferta = new Oferta("promotieFructe");

        oferta.adaugaObserver(client1);
        oferta.adaugaObserver(client2);
        oferta.trimiteNotificare("S-a ieftinit ceva!");
        oferta.stergeObserver(client1);
        oferta.trimiteNotificare("Banane");

    }
}
