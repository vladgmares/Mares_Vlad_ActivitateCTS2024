package B_EX9.program;

import B_EX9.clase.ProxyRezervare;
import B_EX9.clase.Rezervare;

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
