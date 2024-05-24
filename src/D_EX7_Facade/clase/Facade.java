package D_EX7_Facade.clase;

public class Facade {
    public void verificaPersoana(Persoana p){
        Operator operator = new Operator("John");
        if(operator.verificaVarsta(p.getVarsta())){
            if(!operator.areCazier(p.isCazier())){
                if(!operator.areDatorii(p.isDatornic())){
                    System.out.println("Persoana are toate detaliile in regula!");
                } else {
                    System.out.println("Persoana este datornica!");
                }
            } else {
                System.out.println("Persoana are cazier!");
            }
        } else {
            System.out.println("Persoana nu are varsta de 18 ani!");
        }
    }
}
