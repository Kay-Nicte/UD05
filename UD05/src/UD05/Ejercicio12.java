package UD05;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	public Ejercicio12() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Aplicación con una contraseña
 * Hay tres intentos para acertar la contraseña
 * Si aciertas antes de los tres intentos, sales
 */
		
		//Pedir una contraseña por prompt
		String newPass = JOptionPane.showInputDialog("Escribe tu nueva contraseña: ");
		JOptionPane.showMessageDialog(null, "Contraseña creada con éxito.");
		
		int intentos = 0;		
		String currPass = "";
		
		/*Bucle que nos pedirá la contraseña siempre y cuando las contraseñas no coincidan 
		y aún nos queden intentos (máximo 3)*/
	        while (newPass.equals(currPass)==false && intentos < 3) {
	            currPass=JOptionPane.showInputDialog("Introduce la contraseña");
	            intentos++;
	            if (newPass.equals(currPass)==false) {
	            	JOptionPane.showMessageDialog(null, "Contraseña incorrecta.");
	            } else {
	            	JOptionPane.showMessageDialog(null, "Acceso permitido.");
	            }
	 
	            /*Si hemos hecho tres intentos fallidos, nos saltará una alerta*/
	            if (intentos == 3) {
	            	JOptionPane.showMessageDialog(null, "Has superado el máximo de intentos permitido. La policía está de camino.");
	            }
	
	
		
	    }
	}
}
