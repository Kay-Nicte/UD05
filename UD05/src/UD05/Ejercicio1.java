package UD05;

public class Ejercicio1 {

	public Ejercicio1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaro dos variables numéricas y las inicializo
		
		int primeraVariable = 5;
		int segundaVariable = 36;
		
		//Declaro una variable max que me dirá qué variable tiene el valor mayor
		
		int max = Math.max(primeraVariable, segundaVariable);
		//Busco el valor mayor de los dos y lo imprimo por pantalla (en caso de que no sean iguales)
		
		System.out.print("El valor mayor de los dos es: "+max+"\n");
		
		//Cambio el valor de la primera variable para que ésta sea la mayor
		
		primeraVariable = 70;
		max = Math.max(primeraVariable, segundaVariable);
		
		System.out.print("El valor mayor de los dos es: "+max+"\n");

		//Cambio el valor de las variables para que sean iguales 
		
		primeraVariable = 5;
		segundaVariable = 5;
		max = Math.max(primeraVariable, segundaVariable);
		
		/*Voy a comprobar con un if si las dos variables son diferentes
		 * Como no lo son, pasará directamente al else.
		 */
		
		if (primeraVariable != segundaVariable) {
			System.out.print("El valor mayor de los dos es: "+max);
			}else {
				System.out.println("Las dos variables tienen el mismo valor: "+primeraVariable);
			}
	}

}
