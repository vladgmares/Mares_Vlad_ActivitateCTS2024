package A_EX6_Facade.clase;

public enum StareSanatate {
    NECESITA_CONSULT(0), URGENT(1), CRITIC(2), RESUSCITARE(3);
    private Integer severitate;
    StareSanatate(Integer severitate) {
        this.severitate = severitate;
    }

    public Integer getSeveritate() {
        return severitate;
    }
}
