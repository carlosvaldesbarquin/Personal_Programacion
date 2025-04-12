# Juego Conecta 4

## Clase Conecta4
#### Esta clase va a ser la encargada de tener las reglas del juego (si se conectan 4 fichas del mismo color el usuario gana, verificar que la ficha debe caer al ultimo hueco libre, detectar empate...). Además, lleva el control de turnos entre jugadores
- Atributos:
  - Tablero tablero
  - char jugadorActual ('R' o 'A')
- Métodos:
  - jugarTurno(int columna)
  - verificarGanador()
  - cambiarTurno()
  - esEmpate()

## Clase Tablero
#### Esta clase va a guardar la longitud del tablero (6x7), va a detectar el hueco libre que esté más abajo para colocar la ficha
- Atributos:
  - char[][] grid
- Métodos:
  - mostrarTablero()
  - colocarFicha(int columna, char ficha): int
  - columnaLlena(int columna): boolean

## Clase Juego
#### Va a contener la clase Main donde se ejecutará el codigo y va a ser muy limpio