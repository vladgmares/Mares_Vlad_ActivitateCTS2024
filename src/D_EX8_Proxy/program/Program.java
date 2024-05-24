package D_EX8_Proxy.program;

import D_EX8_Proxy.clase.Credit;
import D_EX8_Proxy.clase.ProxyCredit;

public class Program {
    public static void main(String[] args) {
        Credit credit = new Credit("ron");
        credit.acordaCredit();

        ProxyCredit proxy = new ProxyCredit(credit);
        proxy.acordaCredit();
    }
}
