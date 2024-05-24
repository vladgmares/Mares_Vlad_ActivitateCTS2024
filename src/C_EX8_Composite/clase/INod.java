package C_EX8_Composite.clase;

public interface INod {
    void adaugaNod(INod nod);
    void stergeNod(INod nod);
    INod getNod(int index);
    void afisareNod(String indent);
}
