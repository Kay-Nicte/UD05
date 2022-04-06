package UD05;
import javax.swing.JOptionPane;

public class Ejercicio4 {

	public Ejercicio4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicaci�n para calcular el �rea de un c�rculo (piR2)
		 * El radio se pide por teclado
		 * PI es una constante
		 * Usar m�todo pow de Math
		 */
		
		//Declaro las constantes PI y Cuadrado
		final double PI = 3.14159;
		final int Cuadrado = 2;

		//Pido el radio al usuario mediante prompt
		String pedirRadio = JOptionPane.showInputDialog("Vamos a calcular el �rea de un c�rculo. Introduce el radio en metros: ");
		
		//Transformo el String que me ha pasado el usuario en un double, para poder trabajar con �l
		double radio = Double.parseDouble(pedirRadio);
		
		//Declaro una variable para guardar la operaci�n de PI + radio
		double areaSinElevar = PI*radio;
		
		//Declado la variable area y la inicializo con la f�rmula para calcular el �rea del c�rculo
		double area = Math.pow(areaSinElevar, Cuadrado);
		
		//Muestro por pantalla el resultado
		System.out.println("El �rea de un c�rculo de radio "+radio+" es: "+area+" metros cuadrados.");
	}

}
