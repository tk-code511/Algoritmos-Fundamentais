import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static List<Integer> fibonacci(int n) {
        List<Integer> sequencia = new ArrayList<>();
        sequencia.add(0);
        sequencia.add(1);
        for (int i = 2; i < n; i++) {
            sequencia.add(sequencia.get(i - 1) + sequencia.get(i - 2));
        }
        return sequencia;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantos termos da sequência de Fibonacci você quer ver? ");
        int n = leitor.nextInt();
        System.out.println("A sequência é: " + fibonacci(n));
        leitor.close();
    }
}
