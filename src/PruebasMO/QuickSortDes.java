/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasMO;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author lupit
 */
public class QuickSortDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int datos[]={8,5,3,9,1,4,7};
    int n = 10 ;
    Random random = new Random();
        char [] arreglo2 =  new char [n];
    char longitud = (char) arreglo2.length;
                for (int i = 0; i < n; i++) {
                    arreglo2[i] = (char) (random.nextInt(26) + 'a');
                    for (int j = 0; j < i; j++) {
                        if (arreglo2[i] == arreglo2[j]) {
                            i--;
                        }
                    }
                }
                System.out.println("Arreglo original : ");
                for (char x : arreglo2) {
                     System.out.println(" "+ x);
                }
                ordenarCa(arreglo2, 0, longitud - 1);
                System.out.println("Arreglo ordenado : ");
                for (char x : arreglo2) {
                    System.out.println(" "+ x);
                }
    /*
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
    */
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
        ordenarr(arreglo,0,longitud-1);
        System.out.println("Arreglo ordenado : ");
        for ( int x : arreglo) {
            System.out.println(" "+ x);
        }
*/
    }
//ordenacion por enteros
   
    static int ordenarQuickk(int arr[], int indiceI, int indiceD) {
        int pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] > pivote) {
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

    static void ordenarr(int arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            int inicio = ordenarQuickk(arr, indiceI, indiceD);
            ordenarr(arr, indiceI, inicio - 1);
            ordenarr(arr, inicio + 1, indiceD);

        }
    }

    //ordenacion por decimales
    static double ordenarQuickDe(double arr[], int indiceI, int indiceD) {
        double pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] > pivote) {
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

    static void ordenarDe(double arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            double inicio = ordenarQuickDe(arr, indiceI, indiceD);
            ordenarDe(arr, indiceI, (int) (inicio - 1));
            ordenarDe(arr, (int) (inicio + 1), indiceD);

        }
    }
    //ordenacion por letras
    static char ordenarQuickCa(char arr[], int indiceI, int indiceD) {
        int pivote = arr[indiceD];
        int elemento = (indiceI - 1);
        for (int indice = indiceI; indice < indiceD; indice++) {
            if (arr[indice] > pivote) {
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

    static void ordenarCa(char arr[], int indiceI, int indiceD) {
        if (indiceI < indiceD) {
            char inicio = ordenarQuickCa(arr, indiceI, indiceD);
            ordenarCa(arr, indiceI, inicio - 1);
            ordenarCa(arr, inicio + 1, indiceD);

        }
    }

    
}