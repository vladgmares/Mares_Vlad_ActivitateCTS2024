package A_EX10_Flyweight.program;

import A_EX10_Flyweight.clase.Flyweight;
import A_EX10_Flyweight.clase.FlyweightFactory;
import A_EX10_Flyweight.clase.Pacient;
import A_EX10_Flyweight.clase.Spitalizare;

public class Program {
    public static void main(String[] args) {

        Pacient p1 = new Pacient("123", "Vlad");
        Pacient p2 = new Pacient("234", "Ana");
        Pacient p3 = new Pacient("789", "Gica");

        FlyweightFactory fabrica = new FlyweightFactory();

        Flyweight spitalizare1 = fabrica.getSpitalizare(1);
        spitalizare1.afisare(p1);
        fabrica.getSpitalizare(2).afisare(p2);
        fabrica.getSpitalizare(3).afisare(p3);
    }
}
