package Personal_Programacion.valdesCarlos; 

public class Devolucion {
    private Usuario usuario;
    private Libro libro;

    public Devolucion(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public boolean realizarDevolucion() {
        if (usuario.tieneLibroPrestado()) {
            usuario.devolverLibro();
            libro.marcarComoDisponible();
            System.out.println("Libro devuelto correctamente.");
            return true;
        } else {
            System.out.println("El usuario no tiene libros prestados, no se puede devolver nada.");
            return false;
        }
    }
}
