package valdesCarlos;

public class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo) {
        this.titulo = titulo;
        this.disponible = true;
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void mostrarEstado() {
        if (disponible) {
            System.out.println("El libro \"" + titulo + "\" está disponible.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no está disponible.");
        }
    }

    public void marcarComoPrestado() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro \"" + titulo + "\" ha sido marcado como prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");
        }
    }

    public void marcarComoDisponible() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro \"" + titulo + "\" ha sido marcado como disponible.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está disponible.");
        }
    }

    public String getTitulo() {
        return titulo;
    }
}
