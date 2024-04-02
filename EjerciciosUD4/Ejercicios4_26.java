package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_26 {
    
    static void rellenar (int [] v){
        for (int i = 0; i < v.length; i++) {
            v[i]=(int)(Math.random() * v.length  + 0);
        }
    }
    
    static boolean estaNumero(int [] v, int n){
        int cont=0;
        for (int i = 0; i < v.length; i++) {
            cont++;
            if(v[i]==n){
                System.out.println("Interaciones: " + cont);
                return true;
            }
        }
        System.out.println("Iteraciones: " + cont);
        return false;
    }
    
    static int binarySearch(int [] v , int n){
        int mid;
        int left=0;
        int right=v.length-1;
        
        while(left<=right){
            mid = (right + left)/2;
            
            if (v[mid] == n){
                return mid;
            }
        }
        
        return -1;
    }
    
    static int binarySearchRecursivo(int [] v, int n){
        return binarySearchRecursivo(v,n,0,v.length-1);
    }
    
    static int binarySearchRecursivo(int [] v, int target, int left,int right){
        
        if (left>right)
            return -1;
        
        int mid=(right+left)/2;
        if(v[mid] == target)
            return mid;
        
        if(v[mid] < target)
            return binarySearchRecursivo(v,target,mid+1,right);
        else
            return binarySearchRecursivo(v,target,mid-1,right);
    }
     
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE=1_000_000;
        int [] v=new int [SIZE];
        
        rellenar(v);
        Arrays.sort(v);
        
        System.out.println("Indica que número quieres buscar: ");
        int n=in.nextInt();
        
        if(estaNumero(v,n))
            System.out.println("SI");
        else
            System.out.println("NO");
        
        
        if (binarySearch(v,n)==-1)
            System.out.println("No se ha encontrado el nº");
        else
            System.out.println("El nº se ha encontrado en la posición " + binarySearch(v,n));
        
    }
}
