package D_EX5_Adapter.clase;

public class CreditareLeasing implements ICredit{

    @Override
    public void verificare(boolean eligibil) {
        if(eligibil){
            System.out.println("Clientul primeste Leasing NOU!");
        } else {
            System.out.println("Clientul NU ESTE eligibil!!!");
        }
    }
}
