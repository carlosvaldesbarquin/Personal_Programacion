# Cafetería

## Clase Cafeteria
Esta clase va a controlar la lógica del sistema. Va a gestionar los productos pedidos por los clientes, creará los pedidos y los registrará para que al final de la jornada aparezcan todos a modo de resumen. Controlará la disponibilidad de los productos.
-Atributos:

ArrayList<Producto> menu

ArrayList<Pedido> pedidos

-Métodos:

agregarProducto(Producto producto)

crearPedido(List<String> nombresProductos) → Devuelve un nuevo Pedido

registrarPedido(Pedido pedido)

mostrarProductosDisponibles()

mostrarPedidos()

## Clase Producto
Esta clase se encargará de registrar los productos de la tienda además de los precios. También, los productos tendran una disponibilidad.
-Atributos:

String nombre

double precio

boolean disponible

-Métodos:

getNombre()

getPrecio()

isDisponible()

marcarNoDisponible()

mostrarInfo()

## Clase Pedido
Esta clase va a organizar los productos asi como el precio total.
-Atributos:

ArrayList<Producto> productos

double total

-Métodos:

agregarProducto(Producto producto)

calcularTotal()

mostrarResumen()