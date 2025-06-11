package Personal_Programacion.valdesCarlos2;

public class Profesor extends Persona {
    private String departamento;
    private double salario;

    public Profesor(String nombre, int edad, String dni, String departamento, double salario) {
        super(nombre, edad, dni);
        this.departamento = departamento;
        this.salario = salario;
    }

    public void aumentarSalario() {
        double aumento = salario * 0.10; 
        salario += aumento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("DNI: " + getDni());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);
        System.out.println("Es mayor de edad: " + esMayorDeEdad());
    }


}
