package B_EX9_Proxy.program;

import B_EX9_Proxy.clase.ProxyRezervare;
import B_EX9_Proxy.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        //DP Proxy
        Rezervare r1 = new Rezervare(3);
        r1.rezerva();

        System.out.println("------------");

        ProxyRezervare proxyRezervare = new ProxyRezervare(r1);
        proxyRezervare.rezerva();
    }
}
