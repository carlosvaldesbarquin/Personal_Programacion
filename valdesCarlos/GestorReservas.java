package valdesCarlos;

import java.util.Scanner;

public class GestorReservas {

    private Sala[] salas;

    public GestorReservas() {
        salas = new Sala[3];
        salas[0] = new Sala("Sala A", 10);
        salas[1] = new Sala("Sala B", 20);
        salas[2] = new Sala("Sala C", 15);
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Salas disponibles:");
        for (int i = 0; i < salas.length; i++) {
            System.out.println((i + 1) + ". " + salas[i].getNombre() + " (Capacidad: " + salas[i].getCapacidad() + ")");
        }

        System.out.print("Elige una sala (1-" + salas.length + "): ");
        int opcion = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        Sala salaSeleccionada = salas[opcion - 1];

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la fecha de la reserva (YYYY-MM-DD): ");
        String fecha = sc.nextLine();

        System.out.print("Introduce la hora de inicio (HH:mm): ");
        String horaInicio = sc.nextLine();

        System.out.print("Introduce la hora de fin (HH:mm): ");
        String horaFin = sc.nextLine();

        Reserva reserva = new Reserva(nombre, salaSeleccionada, fecha, horaInicio, horaFin);

        System.out.println("\nReserva creada con éxito:");
        reserva.mostrarDetallesReserva();

        salaSeleccionada.marcarNoDisponible();

        System.out.println("\n¿La sala está disponible? " + (salaSeleccionada.isDisponible() ? "Sí" : "No"));

        sc.close();
    }
}
