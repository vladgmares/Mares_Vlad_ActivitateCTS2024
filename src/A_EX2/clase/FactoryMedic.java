package A_EX2.clase;

public class FactoryMedic implements Factory {

    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Medic(nume);
    }
}
