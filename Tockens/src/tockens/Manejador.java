
package tockens;

import java.util.Scanner;


public class Manejador {
    private Token token; 
    String palabra ="";
    String letras ="";
    String numeros = "";
    
    Scanner teclado = new Scanner(System.in);
    
    public void ingresarPalabra(){
        System.out.print("Ingrese la cadena de texto");
        palabra = teclado.nextLine();
        //separarPalabras(palabra);
        char[] arreglo = palabra.toCharArray();
        System.out.println(arreglo);
        System.out.println("numero de caracteres: " +arreglo.length);
        /*System.out.println(palabra);
        System.out.println(letras);
        System.out.println(numeros);*/
    }
    
    public void separarPalabras(String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            if(Character.isLetter(palabra.charAt(i))){
                letras+= palabra.charAt(i);      
            }
            if(Character.isDigit(palabra.charAt(i))){
                numeros += palabra.charAt(i);
                
            }
            
        }
        
    }
    
}
