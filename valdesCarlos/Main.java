package Personal_Programacion.valdesCarlos;

public class Main {
    public static void main(String[] args) {
        AnimalService servicio = new AnimalService();

        Animal miAnimal = servicio.crearAnimalDesdeInput();

        miAnimal.mostrarInfo();
    }
}
