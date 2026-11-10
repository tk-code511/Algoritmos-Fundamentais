import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {

    public static void quicksort(int[] lista, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = lista[fim];
            int pivoIndex = inicio;
            
            for (int i = inicio; i < fim; i++) {
                if (lista[i] <= pivo) {
                    int temporario = lista[i];
                    lista[i] = lista[pivoIndex];
                    lista[pivoIndex] = temporario;
                    pivoIndex++;
                }
            }
            int temporario = lista[pivoIndex];
            lista[pivoIndex] = lista[fim];
            lista[fim] = temporario;
            
            quicksort(lista, inicio, pivoIndex - 1);
            quicksort(lista, pivoIndex + 1, fim);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Quantos números você quer ordenar? ");
        int tamanho = leitor.nextInt();

        int[] listaDoUsuario = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            listaDoUsuario[i] = leitor.nextInt();
        }
        
        System.out.println("\nResultado:");

        System.out.println("Lista original: " + Arrays.toString(listaDoUsuario));

        quicksort(listaDoUsuario, 0, listaDoUsuario.length - 1);

        System.out.println("Lista ordenada: " + Arrays.toString(listaDoUsuario));
        
        leitor.close();
    }
}
