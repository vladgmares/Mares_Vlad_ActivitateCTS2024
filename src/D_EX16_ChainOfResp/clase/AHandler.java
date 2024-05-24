package D_EX16_ChainOfResp.clase;

public abstract class AHandler {
    protected AHandler next;

    public void setNext(AHandler next) {
        this.next = next;
    }

    public AHandler getNextHandler() {
        return this.next;
    }

    public abstract void plateste(Card card);
}
