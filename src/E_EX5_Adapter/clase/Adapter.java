package E_EX5_Adapter.clase;

public class Adapter extends Firma implements IBilet{
    @Override
    public void rezervaOnline(String detaliiBilet) {
        super.rezervareOffline(detaliiBilet);
    }

    @Override
    public void vindeOnline(String detaliiBilet) {
        super.vindeOffline(detaliiBilet);
    }
}
