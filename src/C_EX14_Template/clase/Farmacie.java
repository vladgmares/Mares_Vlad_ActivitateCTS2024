package C_EX14_Template.clase;

public class Farmacie extends AProceduraAchizitie{
    @Override
    public boolean verificaStocMedicamente(Medicament medicament) {
        if(medicament.getCantitate() > 0){
            return true;
        }
        return false;
    }

    @Override
    public void aducereMedicamente(Medicament medicament) {
        System.out.println("Este adus medicamentul " + medicament.getNume());
    }

    @Override
    public void incaseazaBani() {
        System.out.println("Sunt incasati banii!");
    }

    @Override
    public void scadereStoc(Medicament medicament) {
        medicament.setCantitate(medicament.getCantitate() - 1);
        System.out.println("Noul stoc pentru medicamentul: " + medicament.getNume() + " este " + medicament.getCantitate());
    }

    @Override
    public void emiteBon() {
        System.out.println("Bon fiscal emis!");
    }
}
