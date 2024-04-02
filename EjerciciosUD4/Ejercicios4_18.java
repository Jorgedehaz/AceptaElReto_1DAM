package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_18 {
    
    static void rellenar (int [] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=i;
        }
    }
    
    static void alternar (int [] v){
        int pos;
        for (int i = 0; i < v.length; i++) {
            pos=(int)(Math.random()*v.length);
            swap(v,i,pos);
        }
    } 
    
    static void swap(int[]v, int origen, int destino){
        int temporal;
        temporal=v[origen];
        v[origen]=v[destino];
        v[destino]=temporal;
    }
    
    static int getCambios(int[]v){
        int cont=0;
        for (int i = 0; i < v.length; i++) {
            if(v[i]!=i)
                cont++;
        }
        return cont;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v=new int [9];
        
        rellenar(v);
        System.out.println(Arrays.toString(v));
        
        alternar(v);
        System.out.println(Arrays.toString(v));
        
        System.out.println(getCambios(v));
    }
}
