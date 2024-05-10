package B_EX7.clase;

public class NotaPlataDecorata extends ADecoratorNotaPlata{

    public NotaPlataDecorata(INotaPlata notaPlata) {
        super(notaPlata);
    }

    @Override
    public void printeazaNota() {
        super.notaPlata.printeazaNota();
        System.out.println("La multi ani!");
    }
}
