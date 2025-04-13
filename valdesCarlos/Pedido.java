package valdesCarlos;

public class Pedido {
    private Producto[] productos;
    private int cantidadProductos;  

    public Pedido(int maxProductos) {
        productos = new Producto[maxProductos];
        cantidadProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (producto.isDisponible()) {
            if (cantidadProductos < productos.length) {
                productos[cantidadProductos] = producto;
                cantidadProductos++;
                producto.marcarNoDisponible(); 
            } else {
                System.out.println("No se pueden agregar más productos al pedido (límite alcanzado).");
            }
        } else {
            System.out.println("El producto '" + producto.getNombre() + "' no está disponible.");
        }
    }

    public void mostrarPedido() {
        System.out.println("------ PEDIDO ------");
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i].mostrarInfo();
            System.out.println("---------------------");
        }
        System.out.println("Total: $" + calcularTotal());
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < cantidadProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
}

