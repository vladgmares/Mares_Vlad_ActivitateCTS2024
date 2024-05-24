package D_EX8_Proxy.clase;

public class Credit implements IAcordareCredit{
    private String moneda;

    public Credit(String moneda) {
        this.moneda = moneda.toUpperCase();
    }

    public String getMoneda() {
        return moneda;
    }

    @Override
    public void acordaCredit() {
        System.out.println("Acordare credit in " + this.moneda);
    }
}
