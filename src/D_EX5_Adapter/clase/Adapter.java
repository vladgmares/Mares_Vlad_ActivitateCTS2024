package D_EX5_Adapter.clase;

public class Adapter extends CreditareLeasing implements ICreditareVeche{
    @Override
    public void creditare(boolean elibigil) {
        System.out.println("--- Folosind metoda veche de verificare credit ----\n\t -----   verifica defapt leasing ---");
        super.verificare(elibigil);
    }
}
