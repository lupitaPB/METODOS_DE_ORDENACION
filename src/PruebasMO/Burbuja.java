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
public class Burbuja {

    /**
     * @param args the command line arguments
     */
    public  static  void  main ( String []   args ) {
        int n = 10 ;
         Random random = new Random();
        char[] arreglo =  new char[n];
       for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( char ) ( random.nextInt(26) + 'a');
        }
       for ( char x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println(" ");
        bubbleSortC (arreglo);
       for ( char x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println( " " );
        /*
        double[] arreglo =  new double [n];
       for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( double ) ( Math. random() *  10 ) +  1 ;
        }
       for ( double x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println(" ");
        bubbleSortD (arreglo);
       for ( double x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println( " " );
        */
       /*
        int n = 10 ;
        int [] arreglo =  new int [n];
       for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( int ) ( Math. random() *  100 ) +  1 ;
        }
       for ( int x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println(" ");
        bubbleSortDes (arreglo);
       for ( int x : arreglo) {
            System.out.println( "  "  + x);
        }
        System.out.println( " " );
*/
    }
     public  static  void  bubbleSortC ( char [] arreglo ) {
       int n = arreglo.length;
        
        for ( int i = 0 ; i < n - 1 ; i ++ ) {
            for ( int j = 0 ; j < n - i - 1 ; j ++ ) {
                
                if (arreglo [j] > arreglo [j + 1 ]) {
                    // intercambiar: swap
                    char temporal = arreglo [j];
                    arreglo [j] = arreglo [j + 1 ];
                    arreglo [j + 1 ] = temporal;
                }
            }
        }
        
    }
   
    public  static  void  bubbleSortD ( double [] arreglo ) {
        int n = arreglo.length;
        
        for ( int i = 0 ; i < n - 1 ; i ++ ) {
            for ( int j = 0 ; j < n - i - 1 ; j ++ ) {
                
                if (arreglo [j] > arreglo [j + 1 ]) {
                    // intercambiar: swap
                    double temporal = arreglo [j];
                    arreglo [j] = arreglo [j + 1 ];
                    arreglo [j + 1 ] = temporal;
                }
            }
        }
        
    }
   
    public  static  void  bubbleSort ( int [] arreglo ) {
        int n = arreglo.length;
        
        for ( int i = 0 ; i < n - 1 ; i ++ ) {
            for ( int j = 0 ; j < n - i - 1 ; j ++ ) {
                
                if (arreglo [j] > arreglo [j + 1 ]) {
                    // intercambiar: swap
                    int temporal = arreglo [j];
                    arreglo [j] = arreglo [j + 1 ];
                    arreglo [j + 1 ] = temporal;
                }
            }
        }
        
    }
   
}
