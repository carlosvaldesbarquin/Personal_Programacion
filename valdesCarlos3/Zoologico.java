package Personal_Programacion.valdesCarlos3;

public class Zoologico {
    private Animal[] animales;
    private int cantidadAnimales;  

    public Zoologico(int capacidad) {
        animales = new Animal[capacidad];
        cantidadAnimales = 0;
    }

    public void agregarAnimal(Animal animal) {
        if (cantidadAnimales < animales.length) {
            animales[cantidadAnimales] = animal;
            cantidadAnimales++;
        } else {
            System.out.println("El zoológico está lleno. No se puede agregar más animales.");
        }
    }

    public void mostrarTodosLosAnimales() {
        for (int i = 0; i < cantidadAnimales; i++) {
            animales[i].mostrarInformacion();
            System.out.println("-------------");
        }
    }

    public void ejecutarRutinaDiaria() {
        for (int i = 0; i < cantidadAnimales; i++) {
            animales[i].moverse();
            animales[i].hacerSonido();
            animales[i].comer();
            System.out.println();
        }
    }
}

