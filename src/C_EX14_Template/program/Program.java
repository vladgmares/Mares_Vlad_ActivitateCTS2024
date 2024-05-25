package C_EX14_Template.program;

import C_EX14_Template.clase.AProceduraAchizitie;
import C_EX14_Template.clase.Farmacie;
import C_EX14_Template.clase.Medicament;

public class Program {
    public static void main(String[] args) {
        AProceduraAchizitie proceduraAchizitie = new Farmacie();
        System.out.println("---Rezultat procedura----");
        proceduraAchizitie.executaProcedura(new Medicament("Paracetamol", 12));
    }
}
