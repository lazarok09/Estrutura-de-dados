package Ordenacao_dados.BubbleSort;

public class BubbleSort {

    public static void bubbleSort(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 1; j < (vetor.length - i); j++) {
                if (vetor[j - 1] > vetor[j]) {
                    int auxiliar = vetor[j - 1];
                    vetor[j - 1] = vetor[j];
                    vetor[j] = auxiliar;
                }
            }
        }
    }

    // imprimir
    public static void imprimir(int[] vetor) {
        for (int aux : vetor) {
            System.out.println(aux);
        }
    }
    // run!

    public static void main(String[] args) {
        int vetor[] = new int[] { 7, 2, 5, 6, 8 };
        imprimir(vetor);
        System.out.println("-----");
        bubbleSort(vetor);
        imprimir(vetor);
    }
}
