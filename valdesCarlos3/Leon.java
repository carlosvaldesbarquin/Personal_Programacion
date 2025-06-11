package Personal_Programacion.valdesCarlos3;

public class Leon extends Animal {
    private String habitat;

    public Leon(String nombre, int edad, String habitat) {
        super(nombre, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El león ruge.");
    }

    @Override
    public void comer() {
        System.out.println("El león está comiendo carne.");
    }

    @Override
    public void moverse() {
        System.out.println("El león camina sigilosamente por la sabana.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Hábitat: " + habitat);
    }
    


}
