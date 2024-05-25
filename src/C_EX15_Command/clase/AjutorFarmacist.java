package C_EX15_Command.clase;

public class AjutorFarmacist {
    private String nume;

    public AjutorFarmacist(String nume) {
        this.nume = nume;
    }
    public void aduceMedicamente(String medi) {
        System.out.println("Ajutorul de farmacist " + this.nume +  "aduce medicamentele: " + medi);
    }
}
