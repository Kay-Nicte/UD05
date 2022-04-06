package UD05;

public class Ejercicio9 {

	public Ejercicio9() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicación que muestra todos los número entre 1 y 100 
		 * que sean divisibles entre 2 y 3
		 * Utilizar el bucle que quiera
		 */
		
		for(int i=1; i<=100; i++) {
			if((i%2==0) && (i%3==0)) {
				System.out.println(i);
			}
		}
	}
}
