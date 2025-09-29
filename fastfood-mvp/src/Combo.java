public class Combo {
    private String base;
    private String bebida;
    private String acompanamiento;
    private String extra;

    public Combo(String base, String bebida, String acompanamiento, String extra) {
        this.base = base;
        this.bebida = bebida;
        this.acompanamiento = acompanamiento;
        this.extra = extra;
    }

    @Override
    public String toString() {
        return "Combo: " + base +
               ", Bebida: " + bebida +
               ", Acompañamiento: " + acompanamiento +
               ", Extra: " + extra;
    }
}
