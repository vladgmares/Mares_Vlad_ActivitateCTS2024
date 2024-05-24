package D_EX16_ChainOfResp.program;

import D_EX16_ChainOfResp.clase.*;

public class Program {
    public static void main(String[] args) {
//        Cont curent : sub 100
//        Cont econ: 100 - 1000
//        Credit : > 1000

        AHandler contCredit= new ContCredit();
        AHandler contEcon = new ContEconomii();
        AHandler contCurent = new ContCurent();

        //chain of resp
        contCurent.setNext(contEcon);
        contEcon.setNext(contCredit);

        System.out.println("Incercare plata1");
        Card card = new Card("Visa", 20000);
        contCredit.plateste(card);

    }
}
