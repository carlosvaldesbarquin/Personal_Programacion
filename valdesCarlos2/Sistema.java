package Personal_Programacion.valdesCarlos2;

public class Sistema {
    
    public static void main(String[] args) {
        Persona[] personas = new Persona[4];

        personas[0] = new Estudiante("Laura Pérez", 20, "12345678A", "Ingeniería", 6.8);
        personas[1] = new Estudiante("Marco Díaz", 17, "87654321B", "Biología", 4.3);
        personas[2] = new Profesor("Ana Gómez", 45, "11112222C", "Matemáticas", 2800.0);
        personas[3] = new Profesor("Juan Ruiz", 39, "33334444D", "Informática", 3100.0);
        
        for (Persona persona : personas) {
            persona.mostrarDatos();
            System.out.println("-----------------------------");
        }
    }
}
