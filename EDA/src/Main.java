public class Main {
    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();


        System.out.println("Tamaño de la lista: " + lista.tamaño());



        lista.agregar(100);
        lista.agregar(400);
        lista.agregar(800);


        System.out.println("Tamaño de la lista: " + lista.tamaño());

        System.out.println("Primer indice: " + lista.obtenerDato(1));
        System.out.println("Segundo indice: " + lista.obtenerDato(2));
        System.out.println("Tercer indice: " + lista.obtenerDato(3));
        
    }
  
}
