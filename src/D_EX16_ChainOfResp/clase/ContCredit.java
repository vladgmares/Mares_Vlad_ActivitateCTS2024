package D_EX16_ChainOfResp.clase;

public class ContCredit extends AHandler{
    @Override
    public void plateste(Card card) {
        if(card.getSold() > 1000) {
            System.out.println("Suma de: "+card.getSold()+ " RON platita din contul de credit");
        } else if(card.getSold() <= 1000) {
            System.out.println("Suma prea mica pentru plata din credit. Se verifica alt cont...");
            this.setNext(new ContEconomii());
            this.getNextHandler().plateste(card);
        } else {
            System.out.println("Nu exista alt cont pentru a efectua plata");
        }
    }
}
