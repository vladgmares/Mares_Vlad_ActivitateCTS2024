package A_EX2.clase;

public class PersonalSpitalFactory {
    public PersonalSpital crearePersonal(ETipPersonal tipPersonal) throws Exception{
        switch (tipPersonal){
            case MEDIC:
                return new Medic("Vasilica");
            case ASISTENT:
                return new Asistent("Vasile");
            case BRANCARDIER:
                return new Brancardier("Gica");
            default:
                throw new Exception("Nu exista acest tip de personal");
        }
    }
}
