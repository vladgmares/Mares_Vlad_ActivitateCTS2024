package B_EX7.program;

import B_EX7.clase.ADecoratorNotaPlata;
import B_EX7.clase.NotaPlata;
import B_EX7.clase.NotaPlataDecorata;

public class Program {
    public static void main(String[] args) {
        NotaPlata notaPlata1 = new NotaPlata(23, 550);
        notaPlata1.printeazaNota();

        System.out.println("-----------------");

        ADecoratorNotaPlata notaPlataDecorata = new NotaPlataDecorata(notaPlata1);
        notaPlataDecorata.printeazaNota();
    }
}
