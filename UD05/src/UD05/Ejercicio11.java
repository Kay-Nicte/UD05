package UD05;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	public Ejercicio11() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicaci�n para saber si un d�a es laboral o no
		 * Pedir al usuario el d�a
		 * Utilizar un switch
		 */
		
		String askDay = JOptionPane.showInputDialog("�Qu� d�a es hoy?");
		String day = askDay.toUpperCase();
		
		switch(day) {
		case "LUNES":
			JOptionPane.showMessageDialog(null, "El lunes es d�a laboral.");
			break;
		case "MARTES":
			JOptionPane.showMessageDialog(null, "El martes es d�a laboral.");
			break;
		case "MI�RCOLES":
			JOptionPane.showMessageDialog(null, "El mi�rcoles es d�a laboral.");
			break;
		case "MIERCOLES":
			JOptionPane.showMessageDialog(null, "El mi�rcoles es d�a laboral.");
			break;
		case "JUEVES":
			JOptionPane.showMessageDialog(null, "El jueves es d�a laboral.");
			break;
		case "VIERNES":
			JOptionPane.showMessageDialog(null, "El viernes es d�a laboral.");
			break;
		case "S�BADO":
			JOptionPane.showMessageDialog(null, "El s�bado es fin de semana.");
			break;
		case "SABADO":
			JOptionPane.showMessageDialog(null, "El s�bado es fin de semana.");
			break;
		case "DOMINGO":
			JOptionPane.showMessageDialog(null, "El domingo es fin de semana.");
			break;
		default:
			JOptionPane.showMessageDialog(null, day+" no es un d�a. Escoge un d�a.");
		}
	}
}
