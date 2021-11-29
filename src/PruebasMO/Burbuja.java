/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasMO;

import ClasesMO.DatosDesordenados;
import ClasesMO.DatosOrdenados;
import java.util.ArrayList;
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
        //int n = 10 ;
         Random random = new Random();
        //char[] arreglo =  new char[n];
        
        long inicio=System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                new Random().nextDouble();
            }
        }
        long fin = System.nanoTime();
        double dif=(double)(fin-inicio)*1.0e-9;
       long t , t1, t2;
       ;
        DatosDesordenados m;
        int n=5, s=20;
        m =  new  DatosDesordenados (s, n);
       
        int[] arreglo =  new int[n];
         m . generarValores ();
         System.out.println( " "  + m);
         t1 =  System. nanoTime ();   // empezar
            DatosOrdenados mob = m.bubbleSort();
            arreglo=new int [mob.getSize()];
            m.getCopiaValores();
            t2 =  System . nanoTime ();   // detener
            t = t2 - t1;
            System .out . println ( " n = " + n +  " t = "  + t +  " ns. Burbuja = "  + mob);
            t1 =  System . nanoTime ();   // empezar
            DatosOrdenados moi = m . insertSort ();
            t2 =  System . nanoTime ();   // detener
            t = t2 - t1;
            System.out.println( " n = " + n +  " t = "  + t +  " ns. Inserción "  + moi);
        
         

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
