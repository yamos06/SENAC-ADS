import java.util.Random;
import java.util.Scanner;

public class bubbleSort {
    public static void bubbleSort (int[] vetor) {
        int aux = 0;
        // Ordenação
        for (int i = 0;i < vetor.length - 1;i++) {
            for (int j = 0;j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public static String search (int user, int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {

            if (user == vetor[i]) {
                return ("Número encontrado no indice " + i);
            }
        }
        return ("Número Não Encontrado");
    }

    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner sc = new Scanner(System.in);
        // VETOR
        int vetor [] = new int[20];

        // PREENCHIMENTO DO VETOR
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = aleatorio.nextInt(101);
        }


        bubbleSort(vetor);

        // SEARCH
        System.out.print("Número a Buscar: ");
        int user = sc.nextInt();
        System.out.println(search (user, vetor));

        // IMPRESSÃO DO VETOR ORGANIZADO
        for (int i = 0; i < vetor.length; i++) {

            System.out.print(vetor[i] + " ");
        }

    }

}
