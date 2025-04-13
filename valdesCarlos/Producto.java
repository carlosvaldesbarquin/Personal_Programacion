package valdesCarlos;

public class Producto {
    private String nombre;
    private double precio;
    private boolean disponible;

    public Producto(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public boolean marcarNoDisponible() {
        if (disponible) {
            disponible = false;
            return true; 
        }
        return false; 
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }


}