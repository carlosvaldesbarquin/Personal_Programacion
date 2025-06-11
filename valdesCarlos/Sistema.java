package Personal_Programacion.valdesCarlos;

public class Sistema {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Carlos", 30, 3000);
        empleado.calcularSalario();

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Ana", 25, 2000, 10);
        empleadoPorHoras.calcularSalario();

        
    }
}