public class Main {
    public static void main(String[] args) {
        Nodo primero = new Nodo(10);
        Nodo segundo = new Nodo(20);
        Nodo tercero = new Nodo(30);

    

        primero.enlazarSiguiente(segundo);
        primero.obtenerSiguiente().enlazarSiguiente(tercero);




        System.out.println("El dato obtenido es:");
        System.out.println(primero.obtenerSiguiente().obtenerDato());



        
    }
  
}
