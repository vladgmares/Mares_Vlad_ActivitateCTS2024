package C_EX15_Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Farmacist {
    private List<IComanda> listaComenzi;

    public Farmacist() {
        this.listaComenzi = new ArrayList<>();
    }
    public void adaugaComanda(IComanda c) {
        this.listaComenzi.add(c);
    }
    public void trimiteComenzile() {
        for(IComanda c: listaComenzi) {
            c.prelucreaza();
        }
        listaComenzi.clear();
    }

}

