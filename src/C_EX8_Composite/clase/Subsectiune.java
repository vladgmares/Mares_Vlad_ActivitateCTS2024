package C_EX8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements INod{
    private String nume;
    private List<INod> listaMedicamente;

    public Subsectiune(String nume) {
        this.nume = nume;
        this.listaMedicamente = new ArrayList<>();
    }

    @Override
    public void adaugaNod(INod nod) {
        if(this.listaMedicamente != null && nod!= null) {
            this.listaMedicamente.add(nod);
        }
    }

    @Override
    public void stergeNod(INod nod) {
        if(this.listaMedicamente != null && nod!= null) {
            this.listaMedicamente.remove(nod);
        }
    }

    @Override
    public INod getNod(int index) {
        if(index >= 0 && this.listaMedicamente != null && index < this.listaMedicamente.size()){
            return this.listaMedicamente.get(index);
        }
        return null;
    }

    @Override
    public void afisareNod(String indent) {
        System.out.println(indent + "Subsectiunea " + this.nume.toUpperCase() + " contine medicamente: ");
        this.listaMedicamente.forEach(med -> med.afisareNod("\t\t\t"));
    }
}
