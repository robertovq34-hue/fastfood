package model;

public class Pedido {
    private Combo combo;

    public Pedido(Combo combo) {
        this.combo = combo;
    }

    public void mostrarDetalle() {
        System.out.println("=== Detalle del Pedido ===");
        System.out.println(combo.toString());
    }
}
