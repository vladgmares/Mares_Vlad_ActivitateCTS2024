package D_EX16_ChainOfResp.clase;

public class ContCurent extends AHandler{

    @Override
    public void plateste(Card card) {
        if(card.getSold()<=99){
            System.out.println("Suma de: "+card.getSold()+ " RON platita din contul curent");
        } else {
            if(this.getNextHandler() != null) {
                System.out.println("Suma prea mare pentru plata din cont curent");
                this.getNextHandler().plateste(card);
            }
        }
    }
}
