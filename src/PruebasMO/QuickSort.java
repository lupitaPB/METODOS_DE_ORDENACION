/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasMO;

import java.util.Arrays;

/**
 *
 * @author lupit
 */
public class QuickSort {

    public static void main(String[] args) {
    int datos[]={8,5,3,9,1,4,7};
      int n = 10 ;
        double [] arreglo =  new double [n];
             double longitud=arreglo.length;
      for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( double ) ( Math. random() *  10 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( double x : arreglo) {
           System.out.println(" "+ x);
        }  
        ordenarD(arreglo,0, (int) (longitud-1));
        System.out.println("Arreglo ordenado : ");
        for ( double x : arreglo) {
            System.out.println(" "+ x);
        }
    /*
        int n = 10 ;
        int [] arreglo =  new int [n];
        int longitud=arreglo.length;
        for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( int ) ( Math. random() *  100 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( int x : arreglo) {
           System.out.println(" "+ x);
        }  
        ordenar(arreglo,0,longitud-1);
        System.out.println("Arreglo ordenado : ");
        for ( int x : arreglo) {
            System.out.println(" "+ x);
        }
*/
    }
//ordenacion por enteros
   
    static int ordenarQuick(int arr[], int indiceI, int indiceD) {
        int pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] < pivote) {
                elemento++;
                int buffer = arr[elemento];
                arr[elemento] = arr[indice];
                arr[indice] = buffer;
            }

        }
        elemento++;
        int buffer = arr[elemento];
        arr[elemento] = arr[indiceD];
        arr[indiceD] = buffer;
        return elemento;
    }

    static void ordenar(int arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            int inicio = ordenarQuick(arr, indiceI, indiceD);
            ordenar(arr, indiceI, inicio - 1);
            ordenar(arr, inicio + 1, indiceD);

        }
    }

    //ordenacion por decimales
    static double ordenarQuickD(double arr[], int indiceI, int indiceD) {
        double pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] < pivote) {
                elemento++;
                double buffer = arr[elemento];
                arr[elemento] = arr[indice];
                arr[indice] = buffer;
            }

        }
        elemento++;
       double buffer = arr[elemento];
        arr[elemento] = arr[indiceD];
        arr[indiceD] = buffer;
        return elemento;
    }

    static void ordenarD(double arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            double inicio = ordenarQuickD(arr, indiceI, indiceD);
            ordenarD(arr, indiceI, (int) (inicio - 1));
            ordenarD(arr, (int) (inicio + 1), indiceD);

        }
    }
    //ordenacion por letras
    static char ordenarQuickC(char arr[], int indiceI, int indiceD) {
        int pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] < pivote) {
                elemento++;
                char buffer = arr[elemento];
                arr[elemento] = arr[indice];
                arr[indice] = buffer;
            }

        }
        elemento++;
        char buffer = arr[elemento];
        arr[elemento] = arr[indiceD];
        arr[indiceD] = buffer;
        return (char) elemento;
    }

    static void ordenarC(char arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            char inicio = ordenarQuickC(arr, indiceI, indiceD);
            ordenarC(arr, indiceI, inicio - 1);
            ordenarC(arr, inicio + 1, indiceD);

        }
    }

    
}
