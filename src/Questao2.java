import java.util.*;
public class Questao2 {
    public static void main(String[] args) throws Exception {
        int num;
        int[] vetor = new int[3];
        System.out.println("Digite o número que desaja consultar");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        vetor[0] = 0;
        vetor[1] = 1;
        vetor[2] = 0;
        while(vetor[2] < num){
          vetor[2] = vetor[0] + vetor[1];
          vetor[0] = vetor[1];
          vetor[1] = vetor[2];
        }
        if(vetor[2] == num){
          System.out.println("Esse número pertence a sequência de Fibonacci");
        }else{
          System.out.println("Esse número não pertence a sequência de Fibonacci");
        }
    }
}
