# Biblioteca

## Clase Libro
#### Debe registrar los nombres de los libros y si estan ocupados o disponibles con la posibilidad de que se pueda modificar su estado si un usuario los coge.

## Clase Usuario
#### Debe registrar el nombre y apellidos del usuario, tambien si el usuario tiene algun libro cogido o si no, y mostrar un historial de todos los libros que ha cogido el usuario.

## Clase Préstamo
#### Pide el nombre y apellido del usuario y el nombre del libro y verifica si el usuario tiene algun libro en pertenencia o no, y si el libro esta disponible o ocupado. Si el usuario tiene algun libro no podrá coger ningun libro y si el usuario no tiene ningun libro en pertenencia y el libro esta disponible podrá llevarselo y que en el registro el usuario aparezca como que tiene un libro y no puede coger mas y que el libro no este disponible. Si el usuario no tiene ningun libro en pertenencia y el libro esta ocupado, no podrá llevarselo.

## Clase Devolución
#### Pide el nombre y apellido del usuario y el nombre del libro que el usuario quiere devolver. El estado del libro cambiará a disponible y el estado del usuario cambiará a que no tiene ningun libro.

## Clase Sistema
#### Esta clase es la que llevará el Main. Aqui pedirá que es lo que se quiere hacer (Prestamo/Devolución) y si se completa de manera satisfactoria o no.


