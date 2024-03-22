package A_EX1.program;

import A_EX1.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient p1 = Pacient.builder("Vlad", 29)
                .setHalatInterior(true)
                .setPapuciCamera(true)
                .setMicDejun(true)
                .build();

        System.out.println(p1);
    }
}
