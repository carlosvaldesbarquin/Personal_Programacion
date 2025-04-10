package valdesCarlos;

public class Sistema {
    public static void main(String[] args) {
        // Crear libros
        Libro libro1 = new Libro("Don Quijote");
        Libro libro2 = new Libro("1984");

        // Crear usuarios
        Usuario usuario1 = new Usuario("Carlos", "Valdés");
        Usuario usuario2 = new Usuario("Lucía", "Gómez");

        // Intentar préstamo: Carlos pide Don Quijote
        Prestamo prestamo1 = new Prestamo(usuario1, libro1);
        prestamo1.realizarPrestamo();

        // Lucía intenta pedir el mismo libro (ya prestado)
        Prestamo prestamo2 = new Prestamo(usuario2, libro1);
        prestamo2.realizarPrestamo();

        // Carlos intenta pedir otro libro (ya tiene uno)
        Prestamo prestamo3 = new Prestamo(usuario1, libro2);
        prestamo3.realizarPrestamo();

        // Carlos devuelve su libro
        Devolucion devolucion1 = new Devolucion(usuario1, libro1);
        devolucion1.realizarDevolucion();

        // Ahora Lucía puede pedir Don Quijote
        Prestamo prestamo4 = new Prestamo(usuario2, libro1);
        prestamo4.realizarPrestamo();
    }
}
