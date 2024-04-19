package A_EX4.program;

import A_EX4.clase.IReteta;
import A_EX4.clase.Ingredient;
import A_EX4.clase.Reteta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Ingredient> ingredientList = new ArrayList<>();
        ingredientList.add(new Ingredient("Ca", 200.0));
        ingredientList.add(new Ingredient("Mg", 100.0));
        ingredientList.add(new Ingredient("Penicilina", 1000.0));

        Reteta reteta_1 = new Reteta(30, ingredientList);
        System.out.println(reteta_1);

        Reteta reteta_2 = ((Reteta) reteta_1.copiaza())
                .setZileValabilitate(20)
                .setListaIngrediente(Arrays.asList(new Ingredient("Ampicilina", 200.0)));
        reteta_1.setZileValabilitate(90);
        System.out.println("dupa schimbare");
        System.out.println(reteta_1);
        System.out.println(reteta_2);


    }
}
