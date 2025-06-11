package Personal_Programacion.valdesCarlos3;

public class Elefante extends Animal {
    private String habitat;

    public Elefante(String nombre, int edad, String habitat) {
        super(nombre, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El elefante barrita.");
    }

    @Override
    public void comer() {
        System.out.println("El elefante está comiendo hierba.");
    }

    @Override
    public void moverse() {
        System.out.println("El elefante camina lentamente por la sabana.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Hábitat: " + habitat);
    }
    
}
