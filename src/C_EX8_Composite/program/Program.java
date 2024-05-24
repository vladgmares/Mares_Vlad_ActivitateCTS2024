package C_EX8_Composite.program;

import C_EX8_Composite.clase.Medicament;
import C_EX8_Composite.clase.Sectiune;
import C_EX8_Composite.clase.Subsectiune;

public class Program {
    public static void main(String[] args) {
        Sectiune farmacie = new Sectiune("Farmacie");
        Subsectiune sub1 = new Subsectiune("Adulti");
        Subsectiune sub2 = new Subsectiune("Copii");

        Sectiune sec1 = new Sectiune("Raceala");
        Sectiune sec2 = new Sectiune("Antibiotice");

        Medicament med1 = new Medicament("Paracetamol", 10);
        Medicament med2 = new Medicament("Aspirina", 5);
        Medicament med3 = new Medicament("Nurofen", 30);
        Medicament med4 = new Medicament("Ampicilina", 100);

        sub1.adaugaNod(med4);
        sec1.adaugaNod(sub1);
        farmacie.adaugaNod(sec1);
        farmacie.adaugaNod(sec2);

        farmacie.afisareNod("");

    }
}
