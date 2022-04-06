package UD05;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ejercicio10 {

	public Ejercicio10() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Aplicación de caja
		 * Pedir al usuario la cantidad de productos
		 * Pedir el precio de cada producto en función de la cantidad introducida
		 * Sumar el total
		 * Mostrar el precio de la compra
		 */
		
		int contador = 0;
		final double IVA = 0.21;
		double totalSinIva = 0; 
		
		//Pido al usuario la cantidad de productos que va a adquirir
		String askProductQ = JOptionPane.showInputDialog("Bienvenido a la caja rápida. Introduce la cantidad total de productos que vas a adquirir hasta un máximo de 10 artículos (si llevas más, tendrás que pasar por otra caja): ");
		
		//Transformo el dato en un int
		int productQ = Integer.parseInt(askProductQ);
		
		//Bucle para comprobar que me introducen mínimo 1 artículo
		while(productQ < 1) {
			askProductQ = JOptionPane.showInputDialog("Se necesita un mínimo de 1 artículo. ¿Cuántos vas a adquirir?");
			productQ = Integer.parseInt(askProductQ);
			}
		
		//Bucle para comprobar que me introducen un máximo de 10 artículos
		while(productQ > 10) {
			askProductQ = JOptionPane.showInputDialog("Estás en la caja rápida. Máximo 10 artículos. ¿Cuántos vas a adquirir?");
			productQ = Integer.parseInt(askProductQ);
			} 
		
		//Array para almacenar el precio de los productos
		double arrayPrices[] = new double[10];
		  
		//Bucle para pedirle el precio de los productos que ha introducido
		for(int i=1;i <= productQ;i++){
			  String askPrice = JOptionPane.showInputDialog("Introduce el precio del artículo "+i+": ");
			  double price = Double.parseDouble(askPrice);
		      arrayPrices[contador] = price;
		      contador++;
		}
			
		//Bucle para mostrar el contenido del array de precios
		for (int i = 0; i < productQ; i++) {
			  System.out.println("Artículo "+(i+1)+": "+arrayPrices[i] + "€");
			  totalSinIva += arrayPrices[i];
			}
		
		System.out.println("Total sin IVA: "+totalSinIva+"€");
				
		double totalConIva = totalSinIva + (totalSinIva*IVA);
		
		System.out.println("Total con IVA: "+totalConIva+"€");
		
		//Alert para mostrar al usuario el precio
		JOptionPane.showMessageDialog(null, "Total a pagar: "+totalConIva+"€");
	}
}