package A_EX6.clase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Salon {
    private static Salon instanta = null;
    private List<Boolean> listaPaturi = new ArrayList<>();

    private Salon(int nrPaturi) {
        for(int i=0; i < nrPaturi; i++) {
            listaPaturi.add(false);
        }
    }

    public static synchronized Salon getInstance(int nrPaturi){
        if(instanta == null) {
            instanta = new Salon(nrPaturi);
        }
        return instanta;
    }

    public void ocupaPat(Pacient pacient) {
        if(existaPaturiLibere()){
            for(int i=0; i < listaPaturi.size(); i++) {
                if(listaPaturi.get(i) == false){
                    listaPaturi.set(i, true);
                    System.out.println("Pacientul " + pacient.getNume().toUpperCase() + " internat in patul nr." + (i+1));
                    return;
                }
            }
        }
    }
    public  void elibereazaPat(int nrPat) {
        if(nrPat > 0 && nrPat <= listaPaturi.size()) {
            if(listaPaturi.get(nrPat - 1) == true) {
                listaPaturi.set(nrPat - 1, false);
                System.out.println("Patul Nr." + nrPat + " a fost eliberat");
            } else {
                System.out.println("Patul Nr." + nrPat + " este deja liber!");
            }
        } else {
            System.out.println("Nu exista pat cu numarul " + nrPat);
        }
    }

    public boolean existaPaturiLibere() {
        for(boolean value: listaPaturi) {
            if(!value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "listaPaturi=" + listaPaturi +
                '}';
    }
}
