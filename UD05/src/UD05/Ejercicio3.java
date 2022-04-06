package UD05;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//Declaro una variable name para pedir por prompt el nombre del usuario
	String name = JOptionPane.showInputDialog("Introduce tu nombre.");
	
	//Muestro por pantalla un saludo personalizado con el nombre que me han pasado por teclado
	System.out.println("¡Bienvenid@, "+name+"!");
		
	}

}
