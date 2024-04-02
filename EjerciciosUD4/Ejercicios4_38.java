package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_38 {
    
    static int [][] rotar (int [][] m){
        int [][] maux= new int [m.length][m.length];
        int columna=m.length-1;
        
        for (int fila = 0; fila < m.length; fila++) {
            for (int col = 0; col < m.length; col++) {
                maux[col][columna] =m[fila][col]; 
            }
            columna--;
        }
        
        return maux;
    }
    
    static void imprimir (int [][] m){
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int [][] M1= {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int [][] M2= {
            {5,1,9,11},  
            {2,4,8,10},  
            {13,3,6,7},  
            {15,14,12,16},  
        };
        
        
        M1=rotar(M1);
        M2=rotar(M2);
        
        for (int fila = 0; fila < M1.length; fila++) {
            System.out.println(Arrays.toString(M1[fila]));
        }
         
        System.out.println();
         
        for (int fila = 0; fila < M2.length; fila++) {
            System.out.println(Arrays.toString(M2[fila]));
        }
        
    }
}
