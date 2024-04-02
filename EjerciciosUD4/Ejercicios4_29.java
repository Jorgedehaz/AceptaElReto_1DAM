package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_29 {

    static void buscarMaximo (int [][] m, int [] maxF, int [] maxC){
         for (int fila = 0; fila < m.length; fila++) 
            for (int col = 0; col < m[0].length; col++){ 
                
                if(m[fila][col]>maxF[fila])
                    maxF[fila]=m[fila][col];
                
                if(m[fila][col]>maxC[col])
                    maxC[col]=m[fila][col];
             }        
    }
    
    static void imprimir (int [][] m, int [] maxF, int [] maxC){
         for (int fila = 0; fila < m.length; fila++){ 
            for (int col = 0; col < m[0].length; col++){
                 System.out.print((m[fila][col]) + " ");
            }
         System.out.println(maxF[fila]);
         }
         
         for (int i = 0; i < maxC.length; i++) {
             System.out.print(maxC[i] + " ");
        }
    }
         
    static int [][] rellenar (int [][] matriz){
        for (int fila = 0; fila < matriz.length; fila++) 
            for (int col = 0; col < matriz[0].length; col++) 
                matriz[fila][col]= (int)(Math.random() * 10);
        
        return matriz;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numfila, numcol;
        numfila=in.nextInt();
        numcol=in.nextInt();
        
        int [] maxfila = new int [numfila];
        int [] maxcol = new int [numcol];
        int [] [] matriz = new int [numfila][numcol];
        
        rellenar(matriz);
        buscarMaximo (matriz, maxfila,maxcol); 
        imprimir (matriz, maxfila,maxcol); 
         
    }
}
