/*
 * Programa que lee un texto escrito por consola y nos muestra el número de repeticiones de cada
 * carater distinto que contiene dicho texto.
 * Solución utilizando un HasMap<Character,Integer>
 *  
 * Cada elemento del HashMap contiene el par clave,valor = c,n  donde:
 * 		c: es el caracter contabilizado
 * 		n: número de ocurrencias.
 */

package cuentaCaracteres;

import java.util.HashMap;
import java.util.Scanner;

public class CuentaCaracteresOp2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final String FIN = "@FIN@";
		HashMap<Character, Integer> listaCaracteres = new HashMap<>();

		System.out.println("Escribe el texto. Pulsa RETURN para escribir un salto de línea");
		System.out.println("Para terminar escribe @FIN@ como última línea");

		String linea = teclado.nextLine();
		int cont;
		while (!linea.equals(FIN)) {
			for (int i = 0; i < linea.length(); i++) {
				char c = linea.charAt(i);
				cont = listaCaracteres.containsKey(c) ? listaCaracteres.get(c) + 1 : 1;
				listaCaracteres.put(c, cont);
			}
			linea = teclado.nextLine();
		}
		teclado.close();
		System.out.println("Contadores:");
		for(Character c:listaCaracteres.keySet()) {
			System.out.println(c + ":" + listaCaracteres.get(c));
		}

	}

}
