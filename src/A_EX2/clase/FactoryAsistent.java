package A_EX2.clase;

public class FactoryAsistent implements Factory {
    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Asistent(nume);
    }
}
