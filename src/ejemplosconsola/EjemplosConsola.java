/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosconsola;

import java.util.Arrays;

/**
 *
 * @author xp
 */
public class EjemplosConsola {
    
    //declaro un array de ints de instancia
    int[] listaNumeros = {200, 31, 27, 2, 5, 19};
    int[] listaNumeros2 ={ 150 , 150, -11, 8,88,  -5, 15, };
    int[] listaNumeros3 = {36, -31, 56, 2, 5, 99, 5000, 0};
   
    /*
    el método máximos va a calcular el máximo y el segundo máximo de una lista de números
    */
    
    private int[] maximos (int[] lista){
        //declaramos un array de dos elementos para guardar el máximo y el segundo máximo
        int[] listaMaximos = {lista[0],lista[1] };

        
        for (int i=0; i< lista.length ; i++){
            if( lista[i] >= listaMaximos[0]){
                if(i!=0){//desplazo sólo a la derecha si no estoy nusto en la primera posición
                    listaMaximos[1] = listaMaximos[0];
                }
                //si llega aquí, es que el número que estoy comparando
                //es mayor o igual que el que tengo primero en la 
                //lista de máximos
                //desplazo a la derecha el que había como máximo
                listaMaximos[0] = lista[i]; //pongo en la primera posición al nuevo máximo
            }
            else if( lista[i] >= listaMaximos[1]){//compruebo si el número que esoty leyendo es mayor que el SEGUNDO  de la lista de máximos
                listaMaximos[1] = lista[i];
                
            }
                
            }
        
        return listaMaximos;
    }
    
    
    private boolean palindromo (String cadena){
        //primera fase: creo un nuevo string que sea una copia del anterior
        //que me pasan pero quitándole los espacios en blanco
        String auxiliar = "";
        for (int i=0; i< cadena.length(); i++){
            if(cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
        //ahora en auxiliar tengo el string pero sin espacios en blanco
        //declaro dos indices para que digan qué posiciones estoy comparando
        int indiceIzq = 0;
        int indiceDer = auxiliar.length()-1;
        //mientras sean iguales los caracterres en esas psiciones la palabra será un palindromo 
        //y en el momento en el que una de esas comparaciones falle, esque no es palíndromo
        
        //además, si el indice ezquierdo es mayor que el derecho, ya he chequeado toda la frase
        while(auxiliar.charAt(indiceIzq) == auxiliar.charAt(indiceDer) && indiceIzq <= indiceDer){
            indiceIzq++;
            indiceDer--;
        }
        boolean esPalindromo = true;
        if(indiceIzq < indiceDer){ //si esto se cumple la palabra no es un palindromo
            esPalindromo = false;
        }
        
        return esPalindromo;//TODO: hay que cambiar esto luego para que funcion bien
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemplosConsola ejercicios = new EjemplosConsola();
        
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)) );
        
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)) );
         
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)) );
        
        System.out.println(ejercicios.palindromo("ACASO HUBO BUHOS ACA") );
        System.out.println(ejercicios.palindromo("T A CO CAT") );
    }
    
}
