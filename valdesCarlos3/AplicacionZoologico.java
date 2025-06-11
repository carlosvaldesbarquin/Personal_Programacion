package Personal_Programacion.valdesCarlos3;

public class AplicacionZoologico {
    public void iniciar() {
        Zoologico zoo = new Zoologico(3);  

        zoo.agregarAnimal(new Leon("Simba", 4, "Sabana"));
        zoo.agregarAnimal(new Elefante("Nala", 3, "Sabana"));
        zoo.agregarAnimal(new Pinguino("Perry", 5, "Antártida"));

        zoo.mostrarTodosLosAnimales();

        System.out.println("\n--- Rutina diaria ---");
        zoo.ejecutarRutinaDiaria();
    }
}
