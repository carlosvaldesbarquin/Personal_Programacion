public class ListaEnlazada {

    Nodo cabeza;
    private int tamaño;

    public ListaEnlazada(){
        cabeza = null;
        tamaño = 0;

    }
 
    public void agregar(int dato){
        if(cabeza == null){
            cabeza = new Nodo(dato);
        } else {
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(dato);

            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;

        }

        tamaño++;
    }

    public int tamaño(){
        return tamaño;
    }

    public int obtenerDato(int indice){
        int contador = 1;
        Nodo temporal = cabeza;
        while(contador < indice){
            temporal = temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.obtenerDato();
    }


}
