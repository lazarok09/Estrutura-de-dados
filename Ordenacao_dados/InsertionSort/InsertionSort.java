package Ordenacao_dados.InsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            // auxiliar fica com 1, e J fica com 0
            int aux = vetor[i];
            int j = i - 1;

            // pergunta se j -> [0] é maior que i -> [1] e assim por diante, pra efetuar as
            // trocas, procura o menor e traz à esquerda;

            while (j >= 0 && vetor[j] > aux) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;

        }
    }

    public static void imprimir(int vetor[]) {
        for (int aux : vetor) {
            System.out.println(aux);
        }
    }

    public static void main(String[] args) {
        int numeros_reais[] = new int[] { 48, 42, 15, 68, 50, 72 };
        imprimir(numeros_reais);
        System.out.println("-------------");
        insertionSort(numeros_reais);
        System.out.println("-------------");
        imprimir(numeros_reais);
    }
}
