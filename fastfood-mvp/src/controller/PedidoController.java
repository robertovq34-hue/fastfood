package controller;

import model.*;
import view.PedidoView;

public class PedidoController {
    private PedidoView view;

    public PedidoController(PedidoView view) {
        this.view = view;
    }

    public void iniciarPedido() {
        String base = view.pedirBase();
        ComboBuilder builder = new ComboBuilder(base);

        String bebida = view.pedirBebida();
        builder.agregarBebida(bebida);

        String acompanamiento = view.pedirAcompanamiento();
        builder.agregarAcompanamiento(acompanamiento);

        String extra = view.pedirExtra();
        builder.agregarExtra(extra);

        Combo combo = builder.build();
        Pedido pedido = new Pedido(combo);
        pedido.mostrarDetalle();
    }
}
