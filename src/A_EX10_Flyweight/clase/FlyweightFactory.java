package A_EX10_Flyweight.clase;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<Integer, Spitalizare> spitalizari;

    public FlyweightFactory() {
        spitalizari = new HashMap<Integer, Spitalizare>();
    }
    public Flyweight getSpitalizare(int codSalon) {
        if(spitalizari.containsKey(codSalon)){
            return spitalizari.get(codSalon);
        } else {
            Flyweight spitalizare = new Spitalizare(1, 1);
            spitalizari.put(codSalon, (Spitalizare) spitalizare);
            return spitalizare;
        }
    }

}
