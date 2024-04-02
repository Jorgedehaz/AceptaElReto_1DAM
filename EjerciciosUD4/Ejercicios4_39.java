package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicios4_39 {
    
    static boolean estaFuera(int f, int c, int maxf, int maxc){
        return ((f < 0 || f>=maxf) || (c < 0 || c>=maxc));
    }
    
    static int getPerimetro(int [][]m,int fila, int col){
        final int [][] desplazamiento ={
                    {-1,0},
            {0,-1}, /*posactual*/{0,+1},
                    {+1,0}
        };
        int perimetro=0;
        int f,c;
        
        for (int i = 0; i < desplazamiento.length; i++) {
            f=fila + desplazamiento[i][0];
            c=col + desplazamiento[i][1];
            if (estaFuera(f,c,m.length,m[0].length) || m[f][c] == 0)
                perimetro++;
        }
       
        
        return perimetro;
    }
    
    static int getPerimetro (int [][] m){
        int perimetro=0;
        
        for (int fila = 0; fila < m.length; fila++) {
            for (int col = 0; col < m.length; col++) {
                if(m[fila][col] ==1)
                    perimetro+=getPerimetro(m,fila,col);
            }
        }
        return perimetro;   
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mapa [][] = {
                {0,1,0,0},
                {1,1,1,0},
                {0,1,0,0},
                {1,1,0,0},
        };
        
        System.out.println(getPerimetro(mapa));
    }
}
