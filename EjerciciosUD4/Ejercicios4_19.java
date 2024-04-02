package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_19 {
    
    static void rellenar (int [] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random() * v.length  + 0);
        }
    }
    
    static void bubbleSort(int [] v1){
        int temp;
        for (int i = 0; i <v1.length-1; i++) {
            for (int j = 0; j < v1.length - 1 - i; j++) {
                 if(v1[j] > v1[j+1]){
                    temp=v1[j];
                    v1[j]=v1[j+1];
                    v1[j+1]=temp;
                }
            }
        }
    }
    
    static void quickSort(int [] v2){
    }
    
    static void mergeSort(int [] v3){
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int MAX=10;
        int [] v = new int [MAX];
        int [] v1 = new int [MAX];
        int [] v2 = new int [MAX];
        int [] v3 = new int [MAX];
        
        rellenar(v);
        //Esto sirve para hacer copias de v en el resto de vectores. 
        System.arraycopy(v, 0, v1, 0, MAX);
        System.arraycopy(v, 0, v2, 0, MAX);
        System.arraycopy(v, 0, v3, 0, MAX);
        
        long inicio=System.currentTimeMillis();
        bubbleSort(v1);
        long fin=System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin-inicio) + " mseg.");
        
        inicio=System.currentTimeMillis();
        quickSort(v2);
        fin=System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin-inicio) + " mseg.");
        
        inicio=System.currentTimeMillis();
        mergeSort(v3);;
        fin=System.currentTimeMillis();
        System.out.println("Tiempo: " + (fin-inicio) + " mseg.");
        
        
        System.out.println(Arrays.toString(v));
        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
        System.out.println(Arrays.toString(v3));
    }
}
