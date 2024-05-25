package C_EX14_Template.clase;

public abstract class AProceduraAchizitie {
    public abstract boolean verificaStocMedicamente(Medicament medicament);
    public abstract void aducereMedicamente(Medicament medicament);
    public abstract void incaseazaBani();
    public abstract void scadereStoc(Medicament medicament);
    public abstract void emiteBon();

    public  final void executaProcedura(Medicament medicament){
        if(verificaStocMedicamente(medicament)){
            aducereMedicamente(medicament);
            incaseazaBani();
            scadereStoc(medicament);
            emiteBon();
        } else {
            System.out.println("Stocul pentru medicamentul: " +medicament + " nu e suficient!");
        }
    }
}
