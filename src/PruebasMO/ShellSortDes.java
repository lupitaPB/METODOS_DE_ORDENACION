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
public class ShellSortDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
*/
        int n=10;
       double [] arreglo =  new double [n];
        for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( double ) ( Math. random() *  100 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( double x : arreglo) {
           System.out.println(" "+ x);
        }  
        ShellD(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( double x : arreglo) {
            System.out.println(" "+ x);
        }
         
        /*
        int n = 10;
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * 100) + 1;
        for (int j = 0; j < i; j++) {
                if (arreglo[i] == arreglo[j]) {
                    i--;
                }
            }
        }
        System.out.println("Arreglo original : ");
        for (int x : arreglo) {
            System.out.println(" " + x);
        }
        Shell(arreglo);
        System.out.println("Arreglo ordenado : ");
        for (int x : arreglo) {
            System.out.println(" " + x);
        }
*/
    }
    //ordenamiento de enteros


    public static void Shell(int A[]) {
        int salto, aux, i;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] < A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
}
public static void ShellD(double A[]) {
        int salto, i;
        double aux;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] < A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
}
   public static void ShellC(char A[]) {
        int salto, i;
        char aux;
        boolean cambios;
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < A.length; i++)   // se da una pasada
                {
                    if (A[i - salto] < A[i]) {       // y si están desordenados
                        aux = A[i];                  // se reordenan
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
}
}
