/*
 * Programa que lee un texto escrito por consola y nos muestra el número de repeticiones de cada
 * carater distinto que contiene dicho texto.
 * Solución utilizando un ArrayList
 * Se trata de un ArrayList de Strings. 
 * Cada elemento de la lista sera un string con formato "c:n" donde:
 * 		c: es el caracter contabilizado
 * 		n: número de ocurrencias.
 * 
 * Ejemplo: 
 *  Texto:
 *  	Hola Lola,
 *  	Como estás.
 *  
 *  La lista contendrá:
 *   {"H:1", "o:4", "l:2", "a:2", " :2", "L:1", ",:1", "C:1", "m:1", "e:1", "s:2", "t:1", "á:1", ".:1" }
 * 
 */

package cuentaCaracteres;

import java.util.ArrayList;
import java.util.Scanner;



public class CuentaCaracteresOp3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		final String FIN = "@FIN@";
		ArrayList<String> listaCaracteres = new ArrayList<>();
		
		System.out.println("Escribe el texto. Pulsa RETURN para escribir un salto de línea");
		System.out.println("Para terminar escribe @FIN@ como última línea");
		
	
		int pos=-1;
		String linea = teclado.nextLine();
		while ( !linea.equals(FIN)) {
			
			for (int i =0; i < linea.length(); i++) {
				char c = linea.charAt(i);
				if ( (pos = indice(c,listaCaracteres))  != -1) {
					incrementa(pos,listaCaracteres);
				} else {
					nuevo(c,listaCaracteres);
				}
			}
			linea = teclado.nextLine();
		}
		teclado.close();
		System.out.println("Contadores:");
		for(String s:listaCaracteres)
			System.out.println(s);
	}

	private static void nuevo(char c, ArrayList<String> listaCaracteres) {
		String s = String.valueOf(c) + ":1";
		listaCaracteres.add(s);
	}

	private static void incrementa(int i, ArrayList<String> listaCaracteres) {
		
		String[] a = listaCaracteres.get(i).split(":");
		int cont = Integer.parseInt(a[1]) + 1;
		a[1] = String.valueOf(cont);
		listaCaracteres.set(i, a[0] + ":" + a[1]);
		
	}

	private static int indice(char c, ArrayList<String> listaCaracteres) {
		String[] a;
		for(int i=0; i< listaCaracteres.size(); i++) {
			a = listaCaracteres.get(i).split(":");
			if(c == a[0].charAt(0) ) {
				return i;
			}
		}
		
		return -1;
	}
			

}
