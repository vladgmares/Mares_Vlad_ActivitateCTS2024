package A_EX3_FactoryMethod.clase;

public class FactoryAsistent implements Factory {
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Asistent(nume);
    }
}
