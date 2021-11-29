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
        radixSort(arreglo);
        System.out.println("Arreglo ordenado : ");
        for ( int x : arreglo) {
            System.out.println(" "+ x);
        }
       
       
    }

   public static void radixSort(int[] arr) {
		int[][] bucket = new int[10][arr.length];
		int[] bucketOfElement = new int[10];
		int max=0;
		// Encuentra el elemento más grande en la matriz
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		// Calcula el número de bits del elemento más grande
		int maxLength = (max+"").length();
		for(int m = 0,n=1;m<maxLength;m++,n*=10) {
			// Coloca los números en arr en los cubos correspondientes según sus unidades, decenas, centenas, etc.
			for(int i = 0 ; i < arr.length;i++) {//4
				int digit = arr[i]/n%10;
				// Asignar el valor de arr [i] a la matriz bidimensional en el depósito
				bucket[digit][bucketOfElement[digit]] = arr[i];
				bucketOfElement[digit]++; //1
			}
			int index = 0;
			// Leer los elementos en el depósito y reasignarlos a arr
			for(int j = 0;j<10;j++) {
				for(int k = 0 ; k<bucketOfElement[j];k++) {//3
					arr[index] = bucket[j][k];
					index++;//2
				}
				bucketOfElement[j]=0;// Borrar el número de elementos en cada uno
			}
			}
		}
   /*
   public static void radixSortD(double[] arr) {
		double[][] bucket = new double[10][arr.length];
		duble[] bucketOfElement = new double[10];
		double max=0;
		// Encuentra el elemento más grande en la matriz
		for(int i = 0 ; i < arr.length;i++) {
			if(arr[i]>max){
				max = arr[i];
			}
		}
		// Calcula el número de bits del elemento más grande
		int maxLength = (max+"").length();
		for(int m = 0,n=1;m<maxLength;m++,n*=10) {
			// Coloca los números en arr en los cubos correspondientes según sus unidades, decenas, centenas, etc.
			for(int i = 0 ; i < arr.length;i++) {//4
				double digit = arr[i]/n%10;
				// Asignar el valor de arr [i] a la matriz bidimensional en el depósito
				bucket[digit][bucketOfElement[digit]] = arr[i];
				bucketOfElement[digit]++; //1
			}
			int index = 0;
			// Leer los elementos en el depósito y reasignarlos a arr
			for(int j = 0;j<10;j++) {
				for(int k = 0 ; k<bucketOfElement[j];k++) {//3
					arr[index] = bucket[j][k];
					index++;//2
				}
				bucketOfElement[j]=0;// Borrar el número de elementos en cada uno
			}
			}
		}
*/
}
