package D_EX7_Facade.clase;

public class Operator {
    private String numeOperator;

    public Operator(String numeOperator) {
        this.numeOperator = numeOperator;
    }
    public boolean verificaVarsta(int varsta) {
        return varsta > 18;
    }
    public boolean areCazier(boolean cazier) {
        return cazier;
    }
    public boolean areDatorii(boolean datorii) {
        return datorii;
    }

}
