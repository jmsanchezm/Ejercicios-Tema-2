package ejerciciostema2;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
				//Declaramos variables.
				int a; //Se guardará el primer valor introducido por el usuario.
				int b;//Se guardará el segundo valor introducido por el usuario.
				int c;//Se guardará el tercer valor introducido por el usuario.
				double x1; //Se guardará uno de los resultados dados en la ecuación.
				double x2; //Se guardará en otro resultado dado de la ecuación.
				int raiz;/*Se guardará el resultado dado en la raíz para poder
				hacer posteriormente la ecuación*/
				//Creamos el Scanner.
				Scanner read=new Scanner (System.in);
				//Solicitamos al usuario tres valores
				System.out.println("Introduzca un número: ");
				//Ordenamos al Scanner leer el teclado.
				a = read.nextInt();
				System.out.println("Introduzca un número: ");
				b = read.nextInt();
				System.out.println("Introduzca un número: ");
				c = read.nextInt();
				//Calculamos lo que habrá posteriormente dentro de la raíz.
				raiz = (b*b)-(4*a*c);
				/*Utilizando un if, pondremos la condición de que si el resultado
				anterior es negativo, se muestre al usuario que la ecuacuión no tiene solución.*/
				if (raiz<0) {
					System.out.println("ERROR, no tiene solución");
				}else { //En el caso de que sea positiva el resultado raiz, hará la ecuación.
				x1=(-b+ Math.sqrt(raiz))/(2*a);
				System.out.println("Una de las soluciones es x = " + x1);
				x2 = (-b- Math.sqrt(raiz))/(2*a);
				System.out.println("Una de las soluciones es x = " + x2);
				//Finalmente, cerramos el Scanner.
				read.close();
				}
	}

}
