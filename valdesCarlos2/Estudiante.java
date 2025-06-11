package Personal_Programacion.valdesCarlos2;

public class Estudiante extends Persona {
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String dni, String carrera, double promedio) {
        super(nombre, edad, dni);
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public boolean esAprobado() {
        if (promedio >= 5.0) {
            return true;
        } else {
            return false;
        }
        
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("DNI: " + getDni());
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
        System.out.println("Es mayor de edad: " + esMayorDeEdad());
        System.out.println("Aprobado: " + esAprobado());
    }
}
