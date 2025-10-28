## 🧩 Diagrama de Clases – Sistema "El Chino Brasa"

```mermaid
classDiagram
    %% === CLASES ===
    class Usuario {
        - id : int
        - nombre : String
        - rol : String
        - username : String
        - password : String
        + autenticar() boolean
        + cerrarSesion() void
    }

    class Administrador {
        + generarReporteVentas() void
        + gestionarUsuarios() void
    }

    class Producto {
        - id : int
        - nombre : String
        - precio : double
        - descripcion : String
        + actualizarPrecio(nuevoPrecio : double) void
        + mostrarInfo() void
    }

    class Pedido {
        - id : int
        - fechaHora : DateTime
        - estado : String
        - listaProductos : List<DetallePedido>
        + agregarProducto(producto : Producto, cantidad : int) void
        + eliminarProducto(producto : Producto) void
        + calcularTotal() double
        + actualizarEstado(nuevoEstado : String) void
    }

    class DetallePedido {
        - producto : Producto
        - cantidad : int
        + calcularSubtotal() double
    }

    class Factura {
        - id : int
        - pedido : Pedido
        - total : double
        - fecha : DateTime
        + generarFactura() void
        + mostrarFactura() void
    }

    class Cocina {
        - id : int
        - nombre : String
        + recibirPedido(pedido : Pedido) void
        + actualizarPedido(pedido : Pedido, nuevoEstado : String) void
    }

    %% === RELACIONES ===
    Administrador --|> Usuario : hereda
    Usuario "1" --> "*" Pedido : realiza
    Pedido "1" --> "*" DetallePedido : contiene
    DetallePedido "*" --> "1" Producto : pertenece a
    Pedido "1" --> "1" Factura : genera
    Cocina "1" --> "*" Pedido : gestiona
