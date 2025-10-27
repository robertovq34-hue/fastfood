import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// -----------------------------
// Clase base Usuario
// -----------------------------
abstract class Usuario {
    protected int id;
    protected String nombre;
    protected String rol;
    protected String contrasena;

    public Usuario(int id, String nombre, String rol, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
        this.contrasena = contrasena;
    }

    public boolean autenticar(String usuario, String contrasena) {
        return this.nombre.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public String getRol() {
        return rol;
    }

    public String getNombre() {
        return nombre;
    }
}

// -----------------------------
// Subclases de Usuario
// -----------------------------
class Mesero extends Usuario {
    public Mesero(int id, String nombre, String contrasena) {
        super(id, nombre, "Mesero", contrasena);
    }

    public Pedido registrarPedido(List<Producto> productos) {
        Pedido pedido = new Pedido(LocalDateTime.now(), "Pendiente");
        for (Producto p : productos) {
            pedido.agregarProducto(p);
        }
        return pedido;
    }
}

class Cocinero extends Usuario {
    public Cocinero(int id, String nombre, String contrasena) {
        super(id, nombre, "Cocinero", contrasena);
    }

    public void actualizarEstado(Pedido pedido, String nuevoEstado) {
        pedido.setEstado(nuevoEstado);
        System.out.println("Pedido #" + pedido.getId() + " actualizado a: " + nuevoEstado);
    }
}

class Administrador extends Usuario {
    public Administrador(int id, String nombre, String contrasena) {
        super(id, nombre, "Administrador", contrasena);
    }

    public void generarReporte(List<Pedido> pedidos) {
        System.out.println("=== Reporte de Pedidos ===");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}

// -----------------------------
// Clase Producto
// -----------------------------
class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + " (S/ " + precio + ")";
    }
}

// -----------------------------
// Clase Pedido
// -----------------------------
class Pedido {
    private static int contador = 1;
    private int id;
    private LocalDateTime fechaHora;
    private String estado;
    private List<Producto> productos = new ArrayList<>();

    public Pedido(LocalDateTime fechaHora, String estado) {
        this.id = contador++;
        this.fechaHora = fechaHora;
        this.estado = estado;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }

    public int getId() {
        return id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " [" + estado + "] - Total: S/ " + calcularTotal();
    }
}

// -----------------------------
// Clase Factura
// -----------------------------
class Factura {
    private int numero;
    private Pedido pedido;
    private double total;

    public Factura(int numero, Pedido pedido) {
        this.numero = numero;
        this.pedido = pedido;
        this.total = pedido.calcularTotal();
    }

    public void generarFactura() {
        System.out.println("Factura N°: " + numero);
        System.out.println("Detalle: " + pedido);
        System.out.println("Total a pagar: S/ " + total);
    }
}

// -----------------------------
// Clase principal para prueba
// -----------------------------
public class SistemaPedidos {
    public static void main(String[] args) {
        // Productos
        Producto pollo = new Producto("Pollo a la brasa", 35.0);
        Producto papas = new Producto("Papas fritas", 8.0);

        // Mesero registra un pedido
        Mesero mesero = new Mesero(1, "Carlos", "1234");
        List<Producto> productos = List.of(pollo, papas);
        Pedido pedido = mesero.registrarPedido(productos);

        // Cocinero actualiza estado
        Cocinero cocinero = new Cocinero(2, "Luis", "abcd");
        cocinero.actualizarEstado(pedido, "Listo");

        // Generar factura
        Factura factura = new Factura(1001, pedido);
        factura.generarFactura();

        // Administrador revisa pedidos
        Administrador admin = new Administrador(3, "Pedro", "admin");
        admin.generarReporte(List.of(pedido));
    }
}
