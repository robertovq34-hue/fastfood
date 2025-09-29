import controller.PedidoController;
import view.PedidoView;

public class Main {
    public static void main(String[] args) {
        PedidoView view = new PedidoView();
        PedidoController controller = new PedidoController(view);
        controller.iniciarPedido();
    }
}
