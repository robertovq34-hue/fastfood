```mermaid
classDiagram
    class Combo {
        - String base
        - String bebida
        - String acompanamiento
        - String extra
        + setBebida(String)
        + setAcompanamiento(String)
        + setExtra(String)
    }

    class ComboBuilder {
        - Combo combo
        + agregarBebida(String)
        + agregarAcompanamiento(String)
        + agregarExtra(String)
        + build() Combo
    }

    class ComboFactory {
        + crearCombo(String) Combo
    }

    class Pedido {
        - Combo combo
        + mostrarDetalle()
    }

    class PedidoView {
        + pedirBase() String
        + pedirBebida() String
        + pedirAcompanamiento() String
        + pedirExtra() String
    }

    class PedidoController {
        - PedidoView view
        + iniciarPedido()
    }

    Main --> PedidoController
    PedidoController --> PedidoView
    PedidoController --> ComboBuilder
    ComboBuilder --> Combo
    Pedido --> Combo
    ComboFactory --> Combo

