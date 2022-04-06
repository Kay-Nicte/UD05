package UD05;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public Ejercicio11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicación para saber si un día es laboral o no
		 * Pedir al usuario el día
		 * Utilizar un switch
		 */
		
		String askDay = JOptionPane.showInputDialog("¿Qué día es hoy?");
		String day = askDay.toUpperCase();
		
		switch(day) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "El lunes es día laboral.");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "El martes es día laboral.");
			break;
		case "MIÉRCOLES":
			JOptionPane.showMessageDialog(null, "El miércoles es día laboral.");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "El miércoles es día laboral.");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "El jueves es día laboral.");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "El viernes es día laboral.");
			break;
		case "SÁBADO":
			JOptionPane.showMessageDialog(null, "El sábado es fin de semana.");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "El sábado es fin de semana.");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "El domingo es fin de semana.");
			break;
		default:
			JOptionPane.showMessageDialog(null, day+" no es un día. Escoge un día.");
		}
	}
}
