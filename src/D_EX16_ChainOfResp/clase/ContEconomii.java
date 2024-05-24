package D_EX16_ChainOfResp.clase;

public class ContEconomii extends AHandler {
    @Override
    public void plateste(Card card) {
        if (card.getSold() >= 100 && card.getSold() <= 1000) {
            System.out.println("Suma de: " + card.getSold() + " RON platita din contul de econ");
        } else if (card.getSold() < 100) {
            System.out.println("Suma prea mica pentru plata din contul de economiii. Se verifica alt cont...");
            this.setNext(new ContCurent());
            this.getNextHandler().plateste(card);
        } else if (this.getNextHandler() != null) {
            System.out.println("Suma prea mare pentru plata din economii");
            this.getNextHandler().plateste(card);
        } else {
            System.out.println("Nu exista alt cont din care sa se faca plata!");
        }
    }
}
