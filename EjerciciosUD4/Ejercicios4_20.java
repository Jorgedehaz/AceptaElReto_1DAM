package EjerciciosUD4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios4_20 {
    
    static boolean cumple(String queries, String pattern){
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < queries.length(); i++) {
            if(Character.isUpperCase(queries.charAt(i)))
                sb.append(queries.charAt(i));
        }
        
        return sb.toString().equals(pattern);
    }
    
    static boolean [] analiza(String []queries,String pattern){
        boolean [] res = new boolean [queries.length];

        for (int i = 0; i < queries.length; i++) {
            res[i]=cumple(queries[i], pattern);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] queries={"FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack"};
        String pattern="FB";
        boolean [] answer;
        
        answer=analiza(queries,pattern);
        
        System.out.println(Arrays.toString(answer));
        
    }
}
