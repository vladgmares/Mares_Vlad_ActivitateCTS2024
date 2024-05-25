package B_EX12_Observer.clase;

public interface ISubiect {
    void adaugaObserver(IObserver observer);
    void stergeObserver(IObserver observer);
    void trimiteNotificare(String mesaj);
}
