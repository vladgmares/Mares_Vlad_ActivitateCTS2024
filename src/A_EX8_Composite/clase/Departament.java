package A_EX8_Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends ANod{
    private String numeDepartament;
    private List<ANod> listaSubdepartamente;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.listaSubdepartamente = new ArrayList<>();
    }

    @Override
    public int getNrAngajati() {
        int suma = 0;
        if(listaSubdepartamente!=null){
            for(ANod fiu : listaSubdepartamente){
                suma += fiu.getNrAngajati();
            }
        }
        return suma;
    }

    @Override
    public String getNume() {
        return this.numeDepartament;
    }

    @Override
    public void add(ANod fiu) {
        if(listaSubdepartamente!=null && fiu!=null){
            listaSubdepartamente.add(fiu);
        }
    }

    @Override
    public void remove(ANod fiu) {
        if(listaSubdepartamente!=null && fiu!=null){
            listaSubdepartamente.remove(fiu);
        }
    }

    @Override
    public ANod getFiu(int index) {
        if(listaSubdepartamente!=null && index < listaSubdepartamente.size()){
            return this.listaSubdepartamente.get(index);
        }
        return null;
    }

    @Override
    public void afisare() {
        if(listaSubdepartamente!=null){
            System.out.println("Departamentul " + this.numeDepartament.toUpperCase() + " are sectiile:");
            listaSubdepartamente.forEach(aNod -> aNod.afisare());
            System.out.println("Nr. Total anjati=" + this.getNrAngajati());
            System.out.println("-----------------");
        }
    }
}
