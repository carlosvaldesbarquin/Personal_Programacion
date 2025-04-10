package valdesCarlos;

public class Usuario {
    private String nombre;
    private String apellido;
    private Libro libroPrestado;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.libroPrestado = null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean tieneLibroPrestado() {
        return libroPrestado != null;
    }

    public Libro getLibroPrestado() {
        return libroPrestado;
    }

    public void asignarLibro(Libro libro) {
        this.libroPrestado = libro;
    }

    public void devolverLibro() {
        this.libroPrestado = null;
    }

    public void mostrarEstado() {
        if (tieneLibroPrestado()) {
            System.out.println("El usuario " + nombre + " " + apellido + " tiene prestado el libro: \"" + libroPrestado.getTitulo() + "\".");
        } else {
            System.out.println("El usuario " + nombre + " " + apellido + " no tiene ningún libro prestado.");
        }
    }
}
