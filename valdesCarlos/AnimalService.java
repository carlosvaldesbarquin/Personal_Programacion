package Personal_Programacion.valdesCarlos;

import java.util.Scanner;

public class AnimalService {

    public Animal crearAnimalDesdeInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo se llama tu animal? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tiene? ");
        int edad = sc.nextInt();

        return new Animal(nombre, edad);
    }
}
