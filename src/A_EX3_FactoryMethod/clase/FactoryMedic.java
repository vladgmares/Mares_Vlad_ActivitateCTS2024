package A_EX3_FactoryMethod.clase;

public class FactoryMedic implements Factory {

    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Medic(nume);
    }
}
