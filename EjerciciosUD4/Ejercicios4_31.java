package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_31 {
    
    static int [][] rellenar (int [][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) 
            for (int col = 0; col < matriz[0].length; col++) 
                matriz[fila][col]= (int)(Math.random() * 10);
        
        return matriz;
    }
    
    static boolean simetria (int m [][]){
        for (int fila = 0; fila < m.length-1; fila++)
            for (int col = fila+1; col < m[fila].length; col++){ 
                if(m[fila][col] != m[col][fila])
                    return false;
            }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m [][] = { {3,3,3},
                           {3,3,3},
                           {3,3,3}};
        
//        rellenar(m);
        
        for (int fila = 0; fila < m.length; fila++) {
            System.out.println(Arrays.toString(m[fila]));
        }
        
        if (simetria(m))
            System.out.println("SIMETRICA");
        else
            System.out.println("NO SIMETRICA");
        
        
    }
}
