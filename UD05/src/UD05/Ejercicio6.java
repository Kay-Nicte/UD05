package UD05;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	public Ejercicio6() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicación para pedir al usuario el precio de un producto
		 * Calcular el precio final con IVA
		 * IVA es una constante
		 */
		
		//Declaro la constante IVA
		final Double IVA = 0.21;
		
		//Pido el precio al usuario mediante prompt
		String askPrice = JOptionPane.showInputDialog("Introduce el precio del producto sin IVA: ");
		
		//Transformo el String que me han pasado con el precio a double
		double price = Double.parseDouble(askPrice);
		
		//Calculo el precio final con IVA y lo muestro
		double finalPrice = price+(price*IVA);
		JOptionPane.showMessageDialog(null, "El precio final con IVA es: "+finalPrice);
			
	}

}
