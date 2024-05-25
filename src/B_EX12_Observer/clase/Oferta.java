package B_EX12_Observer.clase;

import java.util.ArrayList;
import java.util.List;

public class Oferta implements ISubiect{
    private List<IObserver> observerList;
    private String numeOferta;

    public Oferta(String numeOferta) {
        this.numeOferta = numeOferta;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void stergeObserver(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for(IObserver observer: observerList){
            observer.primesteNotificare(mesaj);
        }
    }

}
