package A_EX4_Prototype.clase;

public class Ingredient {
    private String substantaActiva;
    private Double Cantitate;

    public Ingredient(Ingredient other) {
        this.substantaActiva = other.substantaActiva;
        this.Cantitate = other.getCantitate();
    }

    public Ingredient(String substantaActiva, Double cantitate) {
        this.substantaActiva = substantaActiva;
        Cantitate = cantitate;
    }

    public String getSubstantaActiva() {
        return substantaActiva;
    }

    public Ingredient setSubstantaActiva(String substantaActiva) {
        this.substantaActiva = substantaActiva;
        return this;
    }

    public Double getCantitate() {
        return Cantitate;
    }

    public Ingredient setCantitate(Double cantitate) {
        Cantitate = cantitate;
        return this;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "substantaActiva='" + substantaActiva + '\'' +
                ", Cantitate=" + Cantitate +
                '}';
    }
}
