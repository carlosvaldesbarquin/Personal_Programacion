##🧱 1. ¿Qué es una clase?
Definición:
Una clase es un molde o plantilla para crear objetos.
Define qué atributos (datos) y qué métodos (acciones) tienen los objetos.

🔧 Ejemplo en Java:
java
Copiar
Editar
public class Perro {
    String nombre;
    int edad;

    void ladrar() {
        System.out.println("Guau guau");
    }
}
Esto es una clase llamada Perro. Define que un perro tiene nombre, edad y puede ladrar.
Pero no es un perro real aún, solo la receta para hacer uno.

##🏗️ 2. ¿Qué es un constructor?
Definición:
Un constructor es un método especial que se llama automáticamente al crear un objeto.
Sirve para inicializar los valores del objeto.

🔧 Ejemplo:
java
Copiar
Editar
public class Perro {
    String nombre;
    int edad;

    // Constructor
    public Perro(String nombrePerro, int edadPerro) {
        nombre = nombrePerro;
        edad = edadPerro;
    }

    void ladrar() {
        System.out.println(nombre + " dice: Guau!");
    }
}
Este constructor permite crear un perro con nombre y edad personalizados.

##🐶 3. ¿Qué es un objeto?
Definición:
Un objeto es una instancia de una clase.
Es algo real en la memoria, creado a partir de la clase.

🔧 Ejemplo:
java
Copiar
Editar
public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro("Firulais", 3);  // ← Objeto creado
        miPerro.ladrar();  // Muestra: Firulais dice: Guau!
    }
}
Aquí, miPerro es un objeto de tipo Perro.
Se creó usando el constructor y usa la clase como modelo.