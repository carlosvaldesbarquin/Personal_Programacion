package Personal_Programacion.valdesCarlos;

public class Usuario {
    private String nombre;
    private String apellido;
    private boolean tieneLibro;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tieneLibro = false;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean tieneLibroPrestado() {
        return tieneLibro;
    }

    public void asignarLibro() {
        tieneLibro = true;
    }

    public void devolverLibro() {
        tieneLibro = false;
    }
}
