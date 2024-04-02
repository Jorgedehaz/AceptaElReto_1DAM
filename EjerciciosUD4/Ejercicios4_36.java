package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_36 {

    static int[][] rellenar(int[][] matriz) {
        int num=0;
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col <=2; col++) {
                matriz[fila][col] =num++; 
            }
            for (int col = 2; col <=2; col++) {
                
            }
        }
        return matriz;
    }

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] m = new int[n][n];
        
        rellenar(m);
        
        
        for (int fila = 0; fila < m.length; fila++) {
            System.out.println(Arrays.toString(m[fila]));
        }

    }
}
