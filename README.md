Programa que lee un texto escrito por consola y nos muestra el número de repeticiones de cada
carater distinto que contiene dicho texto.
 
Implementadas tres soluciones distintas:
 
1. CuentaCaracteres\src\cuentaCaracteres\CuentaCaracteresOp1.java
 
    Solución utilizando dos ArrayList.
    
  	ArrayList<Character> caracteres  : para almacenar los distintos caracteres
	ArrayList<Integer> contadores  : para almacenar el contador de ocurrencias de cada caracter
	Si el caracter 'ñ' está guardado en la posición 5 de caracteres,  entonces en la posición
	5 de contadores estará guardado el núemro de ocurrencias de la 'ñ'.
    
 
2. CuentaCaracteres\src\cuentaCaracteres\CuentaCaracteresOp2.java
 
    Solución utilizando un HasMap<Character,Integer>
    
    Cada elemento del HashMap contiene el par clave,valor = c,n  donde:
        c: es el caracter contabilizado
        n: número de ocurrencias.
        
3. CuentaCaracteres\src\cuentaCaracteres\CuentaCaracteresOp3.java

    Solución utilizando un ArrayList.
    
    Se trata de un ArrayList de Strings. 
    Cada elemento de la lista sera un string con formato "c:n" donde:
		c: es el caracter contabilizado
		n: número de ocurrencias.

    Ejemplo. Texto:
 	Hola Lola,
 	Como estás.
 
    La lista contendrá:
    {"H:1", "o:4", "l:2", "a:2", " :2", "L:1", ",:1", "C:1", "m:1", "e:1", "s:2", "t:1", "á:1", ".:1" }
