package max;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static HashMap<String, Integer> contarPalabras(String frase){
        HashMap<String, Integer> contador = new HashMap<String, Integer>();

        //Comprobamos si la frase viene vacía
        if (frase == null || frase.isBlank())
            return contador;

        //Eliminamos acentos, ñ y mayúsculas
        String limpia = frase.toLowerCase().replaceAll("[^a-z0-9áéíóúñ ]", "");

        //Pasamos a un string las palabras separadas por espacios
        String [] palabras = limpia.split(" ");

        for (String palabra: palabras){
            if (!palabra.isBlank()) {
                contador.put(palabra, contador.getOrDefault(palabra, 0) + 1);
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        String frase = sc.nextLine();

        HashMap <String, Integer> resultado= contarPalabras (frase);

        resultado.forEach((palabra, cantidad) ->
                System.out.println(palabra + " -> " + cantidad)
        );


    }
}