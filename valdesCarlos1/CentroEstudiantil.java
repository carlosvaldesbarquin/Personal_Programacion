package Personal_Programacion.valdesCarlos1;

import java.util.Scanner;

public class CentroEstudiantil {
    public Estudiante crearEstudianteDesdeInput() {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("¿Como se llama?");
        String nombre = scanner.nextLine();

        System.out.println("¿Cuantos años tiene?");
        int edad = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("¿Cual es su promedio?");
        double promedio = scanner.nextDouble();

        
        return new Estudiante(nombre, edad, promedio);
    }
}
