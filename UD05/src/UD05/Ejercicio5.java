package UD05;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	public Ejercicio5() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicaci�n para calcular si un n�mero es divisible entre 2
		 * Si no lo es tambi�n debemos indicarlo
		 */
		
		//Pido el n�mero al usuario mediante prompt
		String askNum = JOptionPane.showInputDialog("Vamos a calcular si un n�mero es divisible entre 2. Introduce un n�mero: ");
		
		//Transformo el String que me ha pasado el usuario en un int, para poder trabajar con �l
		int num = Integer.parseInt(askNum);
		
		//Declaro una variable booleana para guardar la operaci�n
		boolean operacion = (num%2 == 0);
		
		//Verifico el resultado y muestro el resultado
		if (operacion) 
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" es divisible entre 2, por lo tanto es par.");
		else
			JOptionPane.showMessageDialog(null, "El n�mero "+num+" no es divisible entre 2, por lo tanto es impar.");
		}

	}