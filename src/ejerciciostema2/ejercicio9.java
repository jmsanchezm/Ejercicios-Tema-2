package ejerciciostema2;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		//Declaramos constantes y variables.
		final int PIEDRA = 1 ; 
		final int PAPEL = 2; 
		final int TIJERAS = 3; 
		int jugador1, jugador2; 
		// Creamos el Scanner.
		Scanner sc = new Scanner (System.in);
		/*Solicitamos al jugador 1 una de las tres opciones, de las
		cuales tendrá que introducir mediante un número.*/
		System.out.println("Jugador 1: elija PIEDRA(1), PAPEL(2) o TIJERAS(3)");
		//Ordenamos al Scanner leer el teclado.
		jugador1= sc.nextInt();
		//Solicitamos al jugador 2 una de las tres opciones
		System.out.println("Jugador 2: elija PIEDRA(1), PAPEL(2) o TIJERAS(3)");
		jugador2= sc.nextInt();
		if(jugador1==jugador2) { 
			/*Ponemos la posibilidad de que los 
				jugadores introduzcan el mismo número, que será el empate*/
				System.out.println("EMPATE"); 
		}
		//Utilizamos un if para condicionar todas las posibilidades de ganar.
		if(jugador1 == PIEDRA && jugador2 == TIJERAS ||
		jugador1 == TIJERAS  && jugador2 == PAPEL || 
		jugador1 == PAPEL && jugador2 == PIEDRA ) {
			System.out.println("¡¡Gana JUGADOR 1!!");
			
		}else {
		//En el caso de que no se cumplan ninguna de las condiciones anteriores, ganará el jugador 2.
			System.out.println("¡¡Gana JUGADOR 2!!");
		}
		//Finalmente, cerramos el Scanner.
		sc.close();

	}

}
