package B_EX7.clase;

public abstract class ADecoratorNotaPlata implements INotaPlata{
    INotaPlata notaPlata;

    public ADecoratorNotaPlata(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }
}
