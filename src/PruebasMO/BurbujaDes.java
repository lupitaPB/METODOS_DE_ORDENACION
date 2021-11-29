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
public class BurbujaDes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        for (int x : arreglo) {
            System.out.println("  " + x);
        }
        System.out.println(" ");
        bubbleSortt(arreglo);
        for (int x : arreglo) {
            System.out.println("  " + x);
        }
        System.out.println(" ");
    }

    public static void bubbleSortt(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] < arreglo[j + 1]) {
                    int temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

    }

    public static void bubbleSortCa(char[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] < arreglo[j + 1]) {
                    // intercambiar: swap
                    char temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

    }

    public static void bubbleSortDe(double[] arreglo) {
        int n = arreglo.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (arreglo[j] < arreglo[j + 1]) {
                    // intercambiar: swap
                    double temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }
            }
        }

    }
}
