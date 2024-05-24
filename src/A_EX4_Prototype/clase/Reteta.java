package A_EX4_Prototype.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements IReteta {
    private int zileValabilitate;
    private List<Ingredient> listaIngrediente;

    public Reteta() {
    }

    public Reteta(int zileValabilitate, List<Ingredient> listaIngrediente) {
        this.zileValabilitate = zileValabilitate;
        this.listaIngrediente = listaIngrediente;
    }

    public int getZileValabilitate() {
        return zileValabilitate;
    }

    public Reteta setZileValabilitate(int zileValabilitate) {
        this.zileValabilitate = zileValabilitate;
        return this;
    }

    public List<Ingredient> getListaIngrediente() {
        return listaIngrediente;
    }

    public Reteta setListaIngrediente(List<Ingredient> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
        return this;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "zileValabilitate=" + zileValabilitate +
                ", listaIngrediente=" + listaIngrediente +
                '}';
    }

    @Override
    public IReteta copiaza() {
        // copie deep
        Reteta copie = new Reteta();
        copie.zileValabilitate = this.zileValabilitate;
        copie.listaIngrediente = new ArrayList<>();
        for(Ingredient ingredient: this.listaIngrediente) {
            copie.listaIngrediente.add(new Ingredient(ingredient));
        }
        return copie;
    }
}
