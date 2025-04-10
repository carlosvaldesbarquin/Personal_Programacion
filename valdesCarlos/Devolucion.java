package valdesCarlos;

public class Devolucion {
    private Usuario usuario;
    private Libro libro;

    public Devolucion(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    public boolean realizarDevolucion() {
        if (usuario.tieneLibroPrestado()) {
            if (libro.getTitulo().equals(usuario.getLibroPrestado().getTitulo())) {
                usuario.devolverLibro();
                libro.marcarComoDisponible();
                System.out.println("El libro \"" + libro.getTitulo() + "\" ha sido devuelto correctamente.");
                return true;
            } else {
                System.out.println("El usuario no tiene este libro prestado.");
                return false;
            }
        } else {
            System.out.println("El usuario no tiene ningún libro prestado.");
            return false;
        }
    }
}
