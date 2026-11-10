import java.util.Scanner;

public class Contagem {

    public static int contagem(int[] dados, int n) {
        int contador = 0;
        int primeiroDado = dados[0];
        
        for (int i = 0; i < dados.length; i++) {
            int valorAtual = dados[i];
            
            if (valorAtual >= primeiroDado && valorAtual <= n) {
                contador = contador + 1;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos números você quer inserir na lista? ");
        int tamanho = leitor.nextInt();

        if (tamanho <= 0) {
            System.out.println("A lista precisa ter pelo menos 1 número para a contagem funcionar.");
            leitor.close();
            return;
        }

        int[] conjuntoDoUsuario = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            conjuntoDoUsuario[i] = leitor.nextInt();
        }

        System.out.print("Digite o valor de N (limite máximo para a contagem): ");
        int valorN = leitor.nextInt();
        
        System.out.println("\nResultado:");
        System.out.println("O primeiro numero da sua lista foi: " + conjuntoDoUsuario[0]);

        int resultado = contagem(conjuntoDoUsuario, valorN);
        System.out.println("Existem " + resultado + " números na sua lista que estão entre " + conjuntoDoUsuario[0] + " e " + valorN + ".");
        
        leitor.close();
    }
}
