package Personal_Programacion.valdesCarlos3;

public class Pinguino extends Animal {
    private String habitat;

    public Pinguino(String nombre, int edad, String habitat) {
        super(nombre, edad);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El pingüino hace un sonido característico.");
    }

    @Override
    public void comer() {
        System.out.println("El pingüino está comiendo peces.");
    }

    @Override
    public void moverse() {
        System.out.println("El pingüino se desliza sobre el hielo.");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Hábitat: " + habitat);
    }
    
}
