public class Nodo {

    private int dato;
    private Nodo siguiente;


    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;

    }

    public int obtenerDato(){
        return dato;
    }


    public void enlazarSiguiente(Nodo n) {
        siguiente = n;
    }



    public Nodo obtenerSiguiente() {
        return siguiente;
    }


    
}
