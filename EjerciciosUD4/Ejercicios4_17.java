package EjerciciosUD4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_17 {
    
    static int getAciertos (int[]boleto, int []ganador){
        int res=0;
        
        for (int pos = 0; pos < boleto.length; pos++) {
            for (int i = 0; i < ganador.length-1; i++) {
                if (boleto[pos]==ganador[i])
                res++;
            }
            if(res==5){
                if(esta(boleto, boleto.length,ganador[ganador.length-1]));
                    res=7;
            }
        }
        return res;
    }
    
    static boolean repetidos (int [] boleto){
        for (int i = 1; i < boleto.length; i++) {
            if(esta(boleto,i,boleto[i]))
                return true;
        }
        return false;
    }
    
    static boolean esta(int[]boleto, int pos, int n){
        for (int i = 0; i < pos; i++) {
            if(boleto[i]==n)
                return true;
        }
        return false;
    }
    
    static void generaAleatorio(int [] boleto,int pos){
        int n;
                
        do{
            
            n=(int)(Math.random()*49)+1;
            
        }while(esta(boleto,pos,n));
        
        boleto[pos]=n;
    }
    
    static int [] getBoleto (int max){
        int [] boleto=new int [max];
        
        for (int pos = 0; pos <  max ; pos++) {
            generaAleatorio(boleto,pos);
        }
        
        return boleto;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        final int MAX= 1_000_000;
        int [] ganador=getBoleto(7);
        int [] boleto=getBoleto(6);
        int [] aciertos=new int [8];
        int n,contador;
        
        Arrays.sort(ganador);
        Arrays.sort(boleto);
        
        System.out.println("Combinación ganadora: ");
        System.out.println("\t" + Arrays.toString(ganador));
        
        for (int i = 0; i < MAX; i++) {
            aciertos[getAciertos(ganador,getBoleto(6))]++;
        }
        
        NumberFormat nf=NumberFormat.getInstance();
        NumberFormat porcentaje= NumberFormat.getPercentInstance();
        porcentaje.setMaximumFractionDigits(5);
        
        System.out.println("Generando " + nf.format(MAX) + "apuestas aleatorias");
        
        for (int i = 0; i < 6; i++) {
            System.out.println("\t"+ i + " aciertos: " + nf.format(aciertos[i]) + "(" + porcentaje.format(aciertos[i]*100.0/MAX)+")");
        }
        System.out.println("\t5+C aciertos: " + nf.format(aciertos[7])+ "(" + porcentaje.format(aciertos[7]*100.0/MAX)+ ")");
        System.out.println("\t6 aciertos :" + nf.format(aciertos[6]) + "(" + porcentaje.format(aciertos[6]*100.0/MAX)+ ")");
        
        System.out.println("¿Cuántos aciertos desea obtener?");
        n=in.nextInt();
        
        contador=0;
        do{
            contador++;
        }while(getAciertos(getBoleto(6), ganador) !=n);
        
       
        System.out.println("Generé " + contador + " boletos");
    }
}
