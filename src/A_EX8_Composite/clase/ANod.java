package A_EX8_Composite.clase;

public abstract class ANod {
    // pentru noduri frunza

    // pentru noduri (zona comuna noduri)
    public abstract int getNrAngajati();
    public abstract String getNume();

    // specific doar nodurilor structura
    public abstract void add(ANod fiu);
    public abstract void remove(ANod fiu);
    public abstract ANod getFiu(int index);
    public abstract void afisare();
}
