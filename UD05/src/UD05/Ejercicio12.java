package UD05;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public Ejercicio12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Aplicaci�n con una contrase�a
 * Hay tres intentos para acertar la contrase�a
 * Si aciertas antes de los tres intentos, sales
 */
		
		//Pedir una contrase�a por prompt
		String newPass = JOptionPane.showInputDialog("Escribe tu nueva contrase�a: ");
		JOptionPane.showMessageDialog(null, "Contrase�a creada con �xito.");
		
		int intentos = 0;		
		String currPass = "";
		
		/*Bucle que nos pedir� la contrase�a siempre y cuando las contrase�as no coincidan 
		y a�n nos queden intentos (m�ximo 3)*/
	        while (newPass.equals(currPass)==false && intentos < 3) {
	            currPass=JOptionPane.showInputDialog("Introduce la contrase�a");
	            intentos++;
	            if (newPass.equals(currPass)==false) {
	            	JOptionPane.showMessageDialog(null, "Contrase�a incorrecta.");
	            } else {
	            	JOptionPane.showMessageDialog(null, "Acceso permitido.");
	            }
	 
	            /*Si hemos hecho tres intentos fallidos, nos saltar� una alerta*/
	            if (intentos == 3) {
	            	JOptionPane.showMessageDialog(null, "Has superado el m�ximo de intentos permitido. La polic�a est� de camino.");
	            }
	
	
		
	    }
	}
}
