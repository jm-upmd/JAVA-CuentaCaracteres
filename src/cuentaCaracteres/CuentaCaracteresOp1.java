/*
 * Programa que lee un texto escrito por consola y nos muestra el número de repeticiones de cada
 * carater distinto que contiene dicho texto.
 * Solución utilizando dos ArrayList:
 * 	ArrayList<Character> caracteres  : para almacenar los distintos caracteres
	ArrayList<Integer> contadores  : para almacenar el contador de ocurrencias de cada caracter
	
	Si el caracter 'ñ' está guardado en la posición 5 de caracteres,  entonces en la posición
	5 de contadores estará guardado el núemro de ocurrencias de la 'ñ'.
 
 */

package cuentaCaracteres;

import java.util.ArrayList;
import java.util.Scanner;

public class CuentaCaracteresOp1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		// Definición de una constante en Java. Se le pone final delante
		// del tipo de dato. El nombre suele ponerse entero en mayúsculas.
		final String FIN = "@FIN@";
		
		// En caracteres almaceno los distintos caracteres y
		// en contadores el número de ocurrencias de cada uno
		ArrayList<Character> caracteres = new ArrayList<>();
		ArrayList<Integer> contadores = new ArrayList<>();
		
		System.out.println("Escribe el texto. Pulsa RETURN para escribir un salto de línea");
		System.out.println("Para terminar escribe @FIN@ como última línea");
		
		int pos; // Para almacenar posición de un caracter en su ArrayList
		
		// Leemos del buffer de Scanner una línea
		String linea = teclado.nextLine();
		
		// Mientras que linea sea distinto de "@FIN@"
		while ( !linea.equals(FIN)) {
			for (int i =0; i < linea.length(); i++) {
				char c = linea.charAt(i);
				// Si el caracter ya está en caracteres incrementa una unidad
				// el valor asociado en contadores
				if( (pos = caracteres.indexOf(c)) >=0 ) {
					contadores.set(pos, contadores.get(pos)+1);
				// Si el caracter aun no está en caracteres lo añadimos y 
				// añadimos también el contador a contadores.
				} else {
					caracteres.add(c);
					contadores.add(1);
				}
			}
			// siguiente línea introducida por teclado
			linea = teclado.nextLine();
		}
		teclado.close();
		System.out.println("Contadores:");
		int i = 0;
		for(Character c:caracteres)
			System.out.println(c + ":" + contadores.get(i++));
	}
		
}
