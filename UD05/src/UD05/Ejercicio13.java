package UD05;

import javax.swing.JOptionPane;

public class Ejercicio13 {

	public Ejercicio13() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Calculadora inversa
		 * Pedir dos operandos (int)
		 * Pedir un signo aritm�tico
		 * Mostrar resultado
		 */
		
		String askFirstOp = JOptionPane.showInputDialog("Introduce un operando: ");
		int primerOperando = Integer.parseInt(askFirstOp);
		String askSecondOp = JOptionPane.showInputDialog("Introduce ahora otro operando: ");
		int segundoOperando = Integer.parseInt(askSecondOp);
		String aritmeticSign = JOptionPane.showInputDialog("Y por �ltimo un signo aritm�tico ('+' suma, '-' resta, '*' multiplicaci�n, '/' divisi�n, '%' residuo, '^' potencia): ");

		//JOptionPane.showMessageDialog(null, "Contrase�a creada con �xito.");
		
		
		switch(aritmeticSign) {
		case "+":
			JOptionPane.showMessageDialog(null, "La suma de "+primerOperando+" + "+segundoOperando+" es = "+(primerOperando+segundoOperando));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "La resta de "+primerOperando+" - "+segundoOperando+" es = "+(primerOperando-segundoOperando));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "El producto de "+primerOperando+" � "+segundoOperando+" es = "+(primerOperando*segundoOperando));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "El cociente de "+primerOperando+" / "+segundoOperando+" es = "+(primerOperando/segundoOperando));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "El residuo de "+primerOperando+" / "+segundoOperando+" es = "+(primerOperando%segundoOperando));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, "El resultado de "+primerOperando+" elevado a la "+segundoOperando+" potencia es = "+(Math.pow(primerOperando,segundoOperando)));
			break;
		default:
			JOptionPane.showMessageDialog(null, aritmeticSign +" no es un signo aritm�tico correcto. Escoge otro.");
		}
	}
}
