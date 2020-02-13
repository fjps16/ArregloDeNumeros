/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ray Master Race
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   int numeros[] = {1,2,3,4,2,4,3}; 
    boolean repetidos = false;
   for(int x = 0; x < numeros.length;x++){
       int a = numeros[x];
       int c = x+1;
       for(int y = c;y < numeros.length;y++){
         int b = numeros[y];
         if(a == b){
           repetidos = true;
           System.out.println("El número " + a +" esta repetido en la lista.");
         }
       }
   }
   if(repetidos == false)
   {
      System.out.println("No hay número repetidos en la lista.");
   }
   
   
}
}

    
    

