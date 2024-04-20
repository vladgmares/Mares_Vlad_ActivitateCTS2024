package A_EX7.clase;

import java.util.ArrayList;

public class ManagerRezultate {
    private ArrayList<MementoRezultat> listaVersiuni = new ArrayList<>();

    public void adaugaVersiuni(MementoRezultat versiuneRezultat) {
        this.listaVersiuni.add(versiuneRezultat);
    }

    public MementoRezultat recuperareUltimaVersiune() throws Exception {
        if(listaVersiuni.size() != 0) {
            MementoRezultat mementoRezultat = listaVersiuni.get(listaVersiuni.size() - 1);
            listaVersiuni.remove(listaVersiuni.size() - 1);
            return mementoRezultat;
        } else {
            throw new Exception("Nu exista versiuni salvate!");
        }
    }
}
