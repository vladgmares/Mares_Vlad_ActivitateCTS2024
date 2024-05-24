package D_EX8_Proxy.clase;

import D_EX5_Adapter.clase.ICredit;

public class ProxyCredit implements IAcordareCredit{
    protected Credit credit;

    public ProxyCredit(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaCredit() {
        if(credit.getMoneda().equals("RON")){
            credit.acordaCredit();
        } else {
            System.out.println("Nu este permisa creditarea in afara de RON!");
        }
    }
}
