package E_EX15_Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> listaVersiuni;

    public Caretaker() {
        this.listaVersiuni = new ArrayList<>();
    }
    public void adaugaVersiune(Memento memento) {
        this.listaVersiuni.add(memento);
    }

    public Memento recuperareVersiune(int index) {
        if(index >=0 && index < listaVersiuni.size()) {
            return this.listaVersiuni.get(index);
        }
        return null;
    }

    public int getNrVersiuni(){
        return this.listaVersiuni.size();
    }
}
