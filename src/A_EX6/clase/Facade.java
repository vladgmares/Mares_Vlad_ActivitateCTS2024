package A_EX6.clase;

public class Facade {
    private Medic medic;
    private Salon salon;

    public Facade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }

    public void sePoateInterna(Pacient pacient) {
        if(salon.existaPaturiLibere()){
            if(medic.deInternat(pacient)) {
                salon.ocupaPat(pacient);
            } else {
                System.out.println("Pacientul " + pacient.getNume().toUpperCase() + " nu poate fi internat");
            }
        } else {
            System.out.println("In salon nu mai exista paturi libere!");
        }
    }
}
