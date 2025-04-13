package valdesCarlos;

import java.util.Scanner;

public class Cafeteria {
    private Producto[] menu;
    private int cantidadProductosMenu;

    public Cafeteria(int maxProductosMenu) {
        menu = new Producto[maxProductosMenu];
        cantidadProductosMenu = 0;
    }

    
    public void agregarProductoAlMenu(Producto producto) {
        if (cantidadProductosMenu < menu.length) {
            menu[cantidadProductosMenu] = producto;
            cantidadProductosMenu++;
        } else {
            System.out.println("No se pueden agregar más productos al menú.");
        }
    }

    public void mostrarMenu() {
        System.out.println("====== MENÚ DE LA CAFETERÍA ======");
        for (int i = 0; i < cantidadProductosMenu; i++) {
            if (menu[i].isDisponible()) {
                System.out.println(i + ". " + menu[i].getNombre() + " - $" + menu[i].getPrecio());
            }
        }
        System.out.println("==================================");
    }

    public void iniciarPedido() {
        Scanner sc = new Scanner(System.in);
        Pedido pedido = new Pedido(10);  // máx 10 productos por pedido
        String opcion;

        do {
            mostrarMenu();
            System.out.print("Selecciona el número del producto (o 'x' para finalizar): ");
            opcion = sc.nextLine();

            if (!opcion.equalsIgnoreCase("x")) {
                try {
                    int indice = Integer.parseInt(opcion);
                    if (indice >= 0 && indice < cantidadProductosMenu) {
                        Producto seleccionado = menu[indice];
                        pedido.agregarProducto(seleccionado);
                    } else {
                        System.out.println("Opción inválida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada no válida.");
                }
            }

        } while (!opcion.equalsIgnoreCase("x"));

        pedido.mostrarPedido();
        sc.close();
    }
}
