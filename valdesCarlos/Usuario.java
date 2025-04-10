package valdesCarlos;

public class Usuario {
    private String nombre;
    private String apellido;
    private boolean tieneLibro;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tieneLibro = false; 
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean tieneLibroPrestado() {
        return tieneLibro;  
    }

    public void asignarLibro() {
        this.tieneLibro = true;  
    }

    public void devolverLibro() {
        this.tieneLibro = false;  
    }

    public void mostrarEstado() {
        if (tieneLibroPrestado()) {
            System.out.println("El usuario " + nombre + " " + apellido + " tiene un libro prestado.");
        } else {
            System.out.println("El usuario " + nombre + " " + apellido + " no tiene ningún libro prestado.");
        }
    }
}
