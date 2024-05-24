package B_EX7_Decorator.clase;

public abstract class ADecoratorNotaPlata implements INotaPlata{
    INotaPlata notaPlata;

    public ADecoratorNotaPlata(INotaPlata notaPlata) {
        this.notaPlata = notaPlata;
    }
}
