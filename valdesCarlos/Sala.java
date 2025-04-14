package valdesCarlos;

public class Sala {
    private String nombre;
    private int capacidad;
    private boolean disponible;

    public Sala(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponible = true; 
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void marcarNoDisponible() {
        this.disponible = false;
    }

}