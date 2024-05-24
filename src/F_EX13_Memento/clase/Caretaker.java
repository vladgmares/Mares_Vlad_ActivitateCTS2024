package F_EX13_Memento.clase;

import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> listaVersiuni;

    public Caretaker() {
        this.listaVersiuni = new ArrayList<>();
    }

    public void adaugaVersiuni(Memento memento){
        this.listaVersiuni.add(memento);
    }
    public Memento recuperareVersiuni(int index) {
        if(index >= 0 && index < listaVersiuni.size()){
            return this.listaVersiuni.get(index);
        }
        return null;
    }
    public int getNrStari() {
        return this.listaVersiuni.size();
    }

}
