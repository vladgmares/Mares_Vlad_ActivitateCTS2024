package D_EX5_Adapter.clase;

public class Client {
    private String numeClient;
    private boolean eligibilCredit;

    public Client(String numeClient, boolean eligibilCredit) {
        this.numeClient = numeClient;
        this.eligibilCredit = eligibilCredit;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public Client setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public boolean isEligibilCredit() {
        return eligibilCredit;
    }

    public Client setEligibilCredit(boolean eligibilCredit) {
        this.eligibilCredit = eligibilCredit;
        return this;
    }
}
