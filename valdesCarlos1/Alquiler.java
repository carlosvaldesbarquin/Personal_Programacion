package valdesCarlos1;

import java.util.Scanner;

public class Alquiler {

    private Vehiculo[] vehiculosDisponibles;

    public Alquiler() {
       
        vehiculosDisponibles = new Vehiculo[3];
        vehiculosDisponibles[0] = new Vehiculo("Toyota", "Corolla", 40.0);
        vehiculosDisponibles[1] = new Vehiculo("Yamaha", "MT-07", 30.0);
        vehiculosDisponibles[2] = new Vehiculo("Volkswagen", "California", 90.0);
    }

    public void iniciarAlquiler() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de alquiler de vehículos.");
        System.out.println("Vehículos disponibles:");
        for (int i = 0; i < vehiculosDisponibles.length; i++) {
            Vehiculo v = vehiculosDisponibles[i];
            System.out.println((i + 1) + ". " + v.getMarca() + " " + v.getModelo() + " - " + v.getPrecio() + "€/día");
        }

        
        System.out.print("Elige el número del vehículo que deseas alquilar: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        Vehiculo vehiculoSeleccionado = vehiculosDisponibles[opcion - 1];

       
        System.out.print("Introduce tu nombre: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("¿Cuántos días quieres alquilar el vehículo?: ");
        int dias = scanner.nextInt();

        
        Factura factura = new Factura(
            nombreCliente,
            vehiculoSeleccionado.getMarca() + " " + vehiculoSeleccionado.getModelo(),
            vehiculoSeleccionado.getPrecio(),
            dias
        );

        
        factura.mostrarFactura();
    }
}
