
package tockens;

import java.util.Scanner;
import static tockens.Token.*;



public class Manejador {
    VentanaPrincipal ventana = new VentanaPrincipal();
    private Token token = ID; 
    String palabra;
    String  id ="";
    String letras="";
    String numeros = "";
    String caracter = "";
    String error = "";
    int inicio, fin;
    Scanner teclado = new Scanner(System.in);
    
        public Manejador(String palabra) {
        this.palabra = palabra;
        iniciar(ventana.getPalabra());
        
        ventana.setPalabraJLabel(ventana.getPalabraJLabel());
        

        //iniciar(this.palabra);
        
    }
        
        public void iniciar(String palabra){
            separarPalabras(palabra);
        }
    
    
        public void ingresarPalabra(){
        //System.out.print("Ingrese la cadena de texto");
        //palabra = teclado.nextLine();
        
        //separarPalabras(palabra);
        //char [] arreglo = palabra.toCharArray();
        //System.out.println(arreglo);
        //System.out.println("numero de caracteres: " +arreglo.length);
        
    }
    
        public void separarPalabras(String palabra){
        for (int i = 0; i < palabra.length(); i++) {
            if(Character.isLetter(palabra.charAt(i))){
                letras+= palabra.charAt(i);      
            }
            if(Character.isDigit(palabra.charAt(i))){
                numeros += palabra.charAt(i);
                
            }
            if(Character.isSpaceChar(palabra.charAt(i))){
                inicio =0;
                fin=i;
                //int temporal = fin;
                //inicio = 0;
                generarPalabra(0, fin, palabra);
                
            }
            
        }
        
    }
    
    public void generarPalabra(int inicio, int fin, String cadena){
        String nuevaPalabra = cadena.substring(inicio, fin);
        char [] palabra = nuevaPalabra.toCharArray();
        //ordenarPalabra(palabra);
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(i);
            
        }
        //System.out.println(nuevaPalabra);
        
        
    }
    
   /* public void ordenarPalabra(char[] palabra){
        for (int i = 0; i < palabra.length; i++) {
            if(Character.isLetter(palabra.)){
                token = CARACTER;
            }
            if(Character.isDigit(palabra.charAt(i))){
                token = NUMERO;
            }
            
       }
        
        
    }*/
    
}
