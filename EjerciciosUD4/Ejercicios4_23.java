package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicios4_23 {

    static int sumaTriangular(int [] v){
        if(v.length ==1)
            return v[0];
        else{
                int [] nuevo=new int[v.length-1];
                
                for (int i = 0; i < v.length-1; i++) 
                    nuevo[i]=(v[i] + v[i+1])&10;
                
                return sumaTriangular(nuevo);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] v0={1,2,3,4,5};
        int [] v1={5};
        
        System.out.println(sumaTriangular(v0));
    }
}
