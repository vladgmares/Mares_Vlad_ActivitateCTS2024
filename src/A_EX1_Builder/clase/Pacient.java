package A_EX1_Builder.clase;

public class Pacient {
    //obligatorii
    private String nume;
    private int varsta;
    //optionale
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halatInterior;
    private Pacient(PacientBuilder builder) {
        this.nume = builder.nume;
        this.varsta = builder.varsta;
        this.patRabatabil = builder.patRabatabil;
        this.micDejun = builder.micDejun;
        this.papuciCamera = builder.papuciCamera;
        this.halatInterior = builder.halatInterior;
    }
    public static PacientBuilder builder(String nume, int varsta) {
        return new PacientBuilder(nume, varsta);
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", patRabatabil=" + patRabatabil +
                ", micDejun=" + micDejun +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }

    public static class PacientBuilder implements Builder {
        //obligator
        private String nume;
        private int varsta;
        //opt
        private boolean patRabatabil;
        private boolean micDejun;
        private boolean papuciCamera;
        private boolean halatInterior;

        public PacientBuilder(String nume, int varsta) {
            this.nume = nume;
            this.varsta = varsta;
        }
        public PacientBuilder setPatRabatabil(boolean patRabatabil) {
            this.patRabatabil = patRabatabil;
            return this;
        }
        public PacientBuilder setMicDejun(boolean micDejun) {
            this.micDejun = micDejun;
            return this;
        }
        public PacientBuilder setPapuciCamera(boolean papuciCamera) {
            this.papuciCamera = papuciCamera;
            return this;
        }
        public PacientBuilder setHalatInterior(boolean halatInterior) {
            this.halatInterior = halatInterior;
            return this;
        }

        @Override
        public Pacient build() {
            return new Pacient(this);
        }
    }
}
