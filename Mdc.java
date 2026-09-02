import java.util.Scanner;

public class Mdc {
    public static int mdc(int a, int b) {
        int resto;
        while (b != 0) {
            resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = leitor.nextInt();
      
        System.out.println("O MDC entre " + numero1 + " e " + numero2 + " é: " + mdc(numero1, numero2));
        leitor.close();
    }
}
