package A_EX6_Facade.program;

import A_EX6_Facade.clase.*;

public class Program {
    public static void main(String[] args) {
        Pacient[] listaPacienti = new Pacient[] {
                new Pacient("Andrei" , 35, StareSanatate.CRITIC),
                new Pacient("Vlad", 30, StareSanatate.NECESITA_CONSULT),
                new Pacient("Gica", 60, StareSanatate.RESUSCITARE),
                new Pacient("Vasile", 55, StareSanatate.NECESITA_CONSULT),
                new Pacient("Jean", 20, StareSanatate.CRITIC),
                new Pacient("Crina", 12, StareSanatate.URGENT)
        };
        Medic m1 = new Medic("Raluca", "ORL");
        Salon salon = Salon.getInstance(3);
        Facade managerSalon = new Facade(m1, salon);

        for(Pacient pacient: listaPacienti) {
            System.out.println(salon);
            managerSalon.sePoateInterna(pacient);
        }

    }
}
