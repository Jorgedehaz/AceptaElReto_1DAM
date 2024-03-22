package CampodeMinas;

import java.util.Scanner;

public class CampoDeMinas {
    static Scanner in = new Scanner(System.in);
    
    static boolean rodeado (int m[][], int fila, int col){
        int cont=0;
        for (int f = fila-1; f <=fila+1; f++) {
            for (int c = col-1; c <=col+1; c++) {
                if(m[f][c] == '*')
                    cont++;
            }
        }
        return cont>=6;
    } 
    
    static int resuelve(int m[][]){
        int cont=0;
        
        for (int fila = 1; fila  < m.length-1; fila++) {
            for (int col = 1; col < m[0].length-1; col++) {
                 if(m[fila][col]=='-'){
                     if(rodeado(m,fila,col))
                         cont++;
                 }
            }
        }
        return cont;
    }
    
    static void leer(int [][]m){
        String linea;
          for (int fila = 0; fila < m.length; fila++){
            linea=in.next();
                for (int col = 0; col < m[0].length; col++)
                    m[fila][col]=linea.charAt(col);
          }
    }
    
    public static void main(String[] args) {
        int numCols, numFilas;
        int [][] m;
        
        while((numCols=in.nextInt()) !=0){
            if((numFilas=in.nextInt()) == 0)
                break;
            
            m=new int [numFilas][numCols];
            
            leer(m);
            
            System.out.println(resuelve(m));
        }
        
    }
}
