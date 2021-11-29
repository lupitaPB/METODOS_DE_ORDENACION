/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasMO;



/**
 *
 * @author lupit
 */
public class Radix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4 ;
        int [] arreglo =  new int [n];
        for ( int i = 0 ; i < n; i ++ ) {
            arreglo [i] = ( int ) ( Math. random() *  100 ) +  1 ;
        }
         System.out.println("Arreglo original : ");
        for ( int x : arreglo) {
           System.out.println(" "+ x);
        }  
        Radix(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( int x : arreglo) {
            System.out.println(" "+ x);
        }
       
       
    }

    static void Radix(int[] arreglo) {
        int x,l,j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (l = 0; l < arreglo.length; l++) {
                boolean mover = (arreglo[l] >> x) <= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[l];
                    j++;
                } else {
                    arreglo[l - j] = arreglo[l];
                }
            }
            for (l = j; l < auxiliar.length; l++) {
                auxiliar[l] = arreglo[l - j];
            }
            arreglo = auxiliar;
        }
        //System.out.println("Arreglo ordenado");
        //for (int i = 0; i < arreglo.length; i++) {
          //  System.out.println(" "+arreglo[i]);
            
        //}
    }
    static void RadixD(double[] arreglo) {
        int x,l,j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            double auxiliar[] = new double [arreglo.length];
            j = 0;
            for (l = 0; l < arreglo.length; l++) {
                boolean mover = (arreglo[l] << x) >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[l];
                    j++;
                } else {
                    arreglo[l - j] = arreglo[l];
                }
            }
            for (l = j; l < auxiliar.length; l++) {
                auxiliar[l] = arreglo[l - j];
            }
            arreglo = auxiliar;
        }
    }
     static void RadixC(int arreglo[]) {
        int x;
        int l, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int auxiliar[] = new int[arreglo.length];
            j = 0;
            for (l = 0; l < arreglo.length; l++) {
                boolean mover = (arreglo[l] << x) >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = arreglo[l];
                    j++;
                } else {
                    arreglo[l - j] = arreglo[l];
                }
            }
            for (l = j; l < auxiliar.length; l++) {
                auxiliar[l] = arreglo[l - j];
            }
            arreglo = auxiliar;
        }
        //System.out.println("Arreglo ordenado");
        //for (int i = 0; i < arreglo.length; i++) {
          //  System.out.println(" "+arreglo[i]);
            
        //}
    }
}
