package C_EX8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements INod{
    private String numeSectiune;
    private List<INod> listaSubsectiuni;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.listaSubsectiuni = new ArrayList<>();
    }

    @Override
    public void adaugaNod(INod nod) {
        if(this.listaSubsectiuni != null && nod!= null) {
            this.listaSubsectiuni.add(nod);
        }
    }

    @Override
    public void stergeNod(INod nod) {
        if(this.listaSubsectiuni != null && nod!= null) {
            this.listaSubsectiuni.remove(nod);
        }
    }

    @Override
    public INod getNod(int index) {
        if(index >= 0 && this.listaSubsectiuni != null && index < this.listaSubsectiuni.size()){
            return this.listaSubsectiuni.get(index);
        }
        return null;

    }

    @Override
    public void afisareNod(String indent) {
        System.out.println(indent + "Sectiunea " + this.numeSectiune.toUpperCase() + " contine subsectiuni: ");
        this.listaSubsectiuni.forEach(med -> med.afisareNod("\t\t"));
    }
}
