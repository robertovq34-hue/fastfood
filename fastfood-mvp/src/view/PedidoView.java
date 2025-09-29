package view;

import java.util.Scanner;

public class PedidoView {
    private Scanner scanner = new Scanner(System.in);

    public String pedirBase() {
        System.out.println("Seleccione el tipo de combo (Hamburguesa, Pollo, Vegetariano): ");
        return scanner.nextLine();
    }

    public String pedirBebida() {
        System.out.println("Seleccione la bebida: ");
        return scanner.nextLine();
    }

    public String pedirAcompanamiento() {
        System.out.println("Seleccione el acompañamiento: ");
        return scanner.nextLine();
    }

    public String pedirExtra() {
        System.out.println("Seleccione un extra: ");
        return scanner.nextLine();
    }

    public void mostrarResumen(String resumen) {
        System.out.println(resumen);
    }
}
