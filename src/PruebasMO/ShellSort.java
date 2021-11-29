/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasMO;

import java.util.Random;



/**
 *
 * @author lupit
 */
public class ShellSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 10 ;
        Random random = new Random();
        char[] arreglo =  new char[n];
       for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( char ) ( random.nextInt(26) + 'a');
        }
         System.out.println("Arreglo original : ");
        for ( char x : arreglo) {
           System.out.println(" "+ x);
        }  
        ordenarShellC(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( char x : arreglo) {
            System.out.println(" "+ x);
        }
        /*
       double [] arreglo =  new double [n];
        for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( double ) ( Math. random() *  100 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( double x : arreglo) {
           System.out.println(" "+ x);
        }  
        ordenarShellD(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( double x : arreglo) {
            System.out.println(" "+ x);
        }
        /*
        int [] arreglo =  new int [n];
        for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( int ) ( Math. random() *  100 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( int x : arreglo) {
           System.out.println(" "+ x);
        }  
        ordenarShell(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( int x : arreglo) {
            System.out.println(" "+ x);
        }
        */
    }
   //ordenamiento de enteros
    static void ordenarShell(int arreglo[]){
        int arreglo_size= arreglo.length;
        int brecha = (arreglo_size/2);
        
        while (brecha>0){
            for (int recorrido = brecha; recorrido < arreglo_size; recorrido++) {
                int buffer= arreglo[recorrido];
                int indice =recorrido;
                while(indice>= brecha && arreglo[indice-brecha]> buffer){
                    arreglo[indice]=arreglo[indice-brecha];
                    indice-=brecha;
                     }
                arreglo[indice]=buffer;
            }
            brecha=brecha/2;
        }
        
    }
    //ordenacion por decimal
    static void ordenarShellD(double arreglo[]){
        int arreglo_size= arreglo.length;
        int brecha = (arreglo_size/2);
        
        while (brecha>0){
            for (int recorrido = brecha; recorrido < arreglo_size; recorrido++) {
               double buffer= arreglo[recorrido];
                int indice =recorrido;
                while(indice>= brecha && arreglo[indice-brecha]> buffer){
                    arreglo[indice]=arreglo[indice-brecha];
                    indice-=brecha;
                     }
                arreglo[indice]=buffer;
            }
            brecha=brecha/2;
        }
        
    }
    //ordemaniento de letras
    static void ordenarShellC(char arreglo[]){
        int arreglo_size= arreglo.length;
       char brecha = (char) (arreglo_size/2);
        
        while (brecha>0){
            for (int recorrido = brecha; recorrido < arreglo_size; recorrido++) {
                char buffer= arreglo[recorrido];
                int indice =recorrido;
                while(indice>= brecha && arreglo[indice-brecha]> buffer){
                    arreglo[indice]=arreglo[indice-brecha];
                    indice-=brecha;
                     }
                arreglo[indice]=buffer;
            }
            brecha=(char) (brecha/2);
        }
        
    }
}
