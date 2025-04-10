package valdesCarlos;

public class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public boolean realizarPrestamo() {
        
        if (libro.estaDisponible() && !usuario.tieneLibroPrestado()) {
            usuario.asignarLibro();
            libro.marcarComoPrestado();
            System.out.println("El préstamo se ha realizado con éxito.");
            return true;
        } else {
            System.out.println("No se puede realizar el préstamo.");
            return false;
        }
    }
}
