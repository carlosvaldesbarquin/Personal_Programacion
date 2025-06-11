package Personal_Programacion.valdesCarlos;

public class EmpleadoPorHoras extends Empleado {
    private int horasExtras;

    public EmpleadoPorHoras(String nombre, int edad, double salario, int horasExtras) {
        super(nombre, edad, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public int calcularSalario() {
        double salarioTotal = getSalario() + (horasExtras * 20); 
        System.out.println("El salario del empleado por horas es: " + salarioTotal);
        return (int) salarioTotal;
    }
}
