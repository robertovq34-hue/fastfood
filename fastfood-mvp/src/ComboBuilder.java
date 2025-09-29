public class ComboBuilder {
    private String base;
    private String bebida;
    private String acompanamiento;
    private String extra;

    public ComboBuilder setBase(String base) {
        this.base = base;
        return this;
    }

    public ComboBuilder setBebida(String bebida) {
        this.bebida = bebida;
        return this;
    }

    public ComboBuilder setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
        return this;
    }

    public ComboBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Combo build() {
        return new Combo(base, bebida, acompanamiento, extra);
    }
}
