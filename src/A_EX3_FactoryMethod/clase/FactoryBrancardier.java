package A_EX3_FactoryMethod.clase;

public class FactoryBrancardier implements Factory {

    @Override
    public PersonalSpital crearePersonal(String nume) {
        return new Brancardier(nume);
    }
}
