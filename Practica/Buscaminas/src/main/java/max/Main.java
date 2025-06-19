package max;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void leer (int [][] campo){
        for (int f = 0; f < campo.length; f++){
            for (int c = 0; c <campo.length; c++){
                campo [f][c]= sc.nextInt();
            }
        }
    }

    public static int buscar (int [][] campo){
        int contador=0;

        for (int f = 0; f < campo.length; f++){
            for (int c = 0; c <campo.length; c++){
                if (campo [f][c] == 1){
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int f = sc.nextInt();
        int c = sc.nextInt();
        int campo [][] = new int[f][c];

        leer(campo);

        System.out.println(buscar(campo));

    }
}