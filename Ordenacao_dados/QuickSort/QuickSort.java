package Ordenacao_dados.QuickSort;

public class QuickSort {
    // O método Quick Sort consiste na aplicação do método dividir e conquistar
    // aplicando recursão. Divide-se o vetor em partes, buscando um valor arbitrário
    // chamado de pivô. Os valores ordenados à direita são maiores que o pivô,
    // enquanto os valores à esquerda são menores. Se chamado de forma recursiva,
    // faz a mesma ordenação entre as subarrays. Consiste em um algorítmo eficiente
    // e rápido, geralmente usado quando precisa-se de performance.

    public static void quickSort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(array, inicio, fim);
            quickSort(array, inicio, posicaoPivo - 1);
            quickSort(array, posicaoPivo + 1, fim);

        }
    }

    public static int separar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = (inicio - 1);

        for (int j = inicio; j < fim; j++) {
            if (array[j] <= pivo) {
                i++;
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }

        int aux = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = aux;

        return i + 1;

    }

    // imprimir
    public static void imprimir(int[] array) {
        for (int aux : array) {
            System.out.println(aux);
        }
    }

    public static void main(String[] args) {
        int numeros_aleatorios[] = new int[] { 12, 3, 5, 9, 8 };
        quickSort(numeros_aleatorios, 0, numeros_aleatorios.length - 1);
        imprimir(numeros_aleatorios);
    }
}
