package model;

public class Combo {
    private String base;
    private String bebida;
    private String acompanamiento;
    private String extra;

    public Combo(String base) {
        this.base = base;
    }

    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompanamiento(String acompanamiento) { this.acompanamiento = acompanamiento; }
    public void setExtra(String extra) { this.extra = extra; }

    @Override
    public String toString() {
        return "Combo: " + base +
                "\nBebida: " + (bebida != null ? bebida : "No seleccionada") +
                "\nAcompañamiento: " + (acompanamiento != null ? acompanamiento : "No seleccionado") +
                "\nExtra: " + (extra != null ? extra : "No seleccionado");
    }
}
