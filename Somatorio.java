import java.util.Scanner;

public class Somatorio {
    public static int somatorio(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Quantos números você quer somar? ");
        int tamanho = leitor.nextInt();
        
        int[] lista = new int[tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            lista[i] = leitor.nextInt();
        }
        
        System.out.println("O somatório de todos os números é: " + somatorio(lista));
        leitor.close();
    }
}
