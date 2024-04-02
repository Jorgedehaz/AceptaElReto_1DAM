package EjerciciosUD4;

import java.util.Scanner;

public class Ejercicios4_27 {

    static void rellenar (int [] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random() * 10  + 0);
        }
    }
    
    static int sumaVentana (int [] v, int sizeVent){
        int suma=0;
        int sumaMax=0;
        
        if (sizeVent> v.length)
            return -1;
        
        for (int i = 0; i < sizeVent; i++) 
            suma+=v[i];
            
        sumaMax=suma;
        
        for (int i = 1; i < v.length-sizeVent; i++) {
            suma-=v[i-1];
            suma+=v[i+sizeVent-1];
            if (suma>sumaMax)
                sumaMax=suma;
        }
        return sumaMax;
    } 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int v [] = new int [1000];
        int sizeVent;
        
        rellenar(v);
        
        System.out.println("¿De cuanto en cuanto quieres sumar?");
        sizeVent=in.nextInt();
        
        System.out.println("La suma de los elementos es: " + sumaVentana(v, sizeVent));
    }
}
