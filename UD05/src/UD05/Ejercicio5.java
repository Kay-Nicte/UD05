package UD05;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public Ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicación para calcular si un número es divisible entre 2
		 * Si no lo es también debemos indicarlo
		 */
		
		//Pido el número al usuario mediante prompt
		String askNum = JOptionPane.showInputDialog("Vamos a calcular si un número es divisible entre 2. Introduce un número: ");
		
		//Transformo el String que me ha pasado el usuario en un int, para poder trabajar con él
		int num = Integer.parseInt(askNum);
		
		//Declaro una variable booleana para guardar la operación
		boolean operacion = (num%2 == 0);
		
		//Verifico el resultado y muestro el resultado
		if (operacion) 
			JOptionPane.showMessageDialog(null, "El número "+num+" es divisible entre 2, por lo tanto es par.");
		else
			JOptionPane.showMessageDialog(null, "El número "+num+" no es divisible entre 2, por lo tanto es impar.");
		}

	}