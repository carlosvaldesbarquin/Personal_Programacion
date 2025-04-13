package valdesCarlos;

public class Sistema {
    public static void main(String[] args) {
        Cafeteria cafeteria = new Cafeteria(5);  // máximo 5 productos en el menú

        cafeteria.agregarProductoAlMenu(new Producto("Café", 2.5, true));
        cafeteria.agregarProductoAlMenu(new Producto("Té", 2.0, true));
        cafeteria.agregarProductoAlMenu(new Producto("Muffin", 3.0, true));
        cafeteria.agregarProductoAlMenu(new Producto("Sandwich", 4.0, true));

        cafeteria.iniciarPedido();
    }
}
