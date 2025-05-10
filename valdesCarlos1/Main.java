package Personal_Programacion.valdesCarlos1;

public class Main {
    public static void main(String[] args) {
        CentroEstudiantil centro = new CentroEstudiantil(); 

        Estudiante estudiante = centro.crearEstudianteDesdeInput();

        estudiante.darInfo();
    }
}

