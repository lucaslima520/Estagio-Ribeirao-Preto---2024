import java.util.*;
public class Questao5 {
    public static void main(String[] args) throws Exception {
        String palavra = "programação";
        char[] vetor = new char[10];
        int j = 9;
        for(int i = 0; i < 10; i++){
          vetor[i] = palavra.charAt(j);
          j--;
        }
        System.out.println(vetor);
    }
}