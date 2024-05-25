package A_EX15_Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<IComanda> listaTriaj;

    public Operator() {
        this.listaTriaj = new ArrayList<>();
    }
    public void adaugaPacient(IComanda comanda) {
        this.listaTriaj.add(comanda);
    }
    public void executaTriaj(){
        for(IComanda pacient : listaTriaj) {
            pacient.actiune();
        }
    }
}
