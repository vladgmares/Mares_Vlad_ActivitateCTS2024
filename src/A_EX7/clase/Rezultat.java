package A_EX7.clase;

public class Rezultat {
    private String numePacient;
    private ETipRezultat modalitateTrimitere;

    public Rezultat(String numePacient, ETipRezultat modalitateTrimitere) {
        this.numePacient = numePacient;
        this.modalitateTrimitere = modalitateTrimitere;
    }

    public Rezultat setModalitateTrimitere(ETipRezultat modalitateTrimitere) {
        this.modalitateTrimitere = modalitateTrimitere;
        return this;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "numePacient='" + numePacient + '\'' +
                ", modalitateTrimitere=" + modalitateTrimitere +
                '}';
    }

    public MementoRezultat salvareStare() {
        System.out.println("Salvare stare!");
        return new MementoRezultat(modalitateTrimitere);
    }

    public void refacereStare(MementoRezultat mementoRezultat) {
        this.modalitateTrimitere = mementoRezultat.getModalitateTrimitere();
    }
}
