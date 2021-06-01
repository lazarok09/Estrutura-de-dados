package Ordenacao_dados.SelectionSort;

public class SelectionSort {
    // O método Selection Sort busca no vetor o menor valor entre todos os elementos
    // e o insere na primeira posição após a verificação. Diferente do Bubble Sort
    // que faz a troca pelo maior ou menor através do insert de forma ordenada para
    // todos os elementos.
    public static void selectionSort(int[] array) {
        for (int fixo = 0; fixo < array.length - 1; fixo++) {
            int menor = fixo;
            for (int i = menor + 1; i < array.length; i++) {
                // procura o menor valor e salva a posição do index na variável menor
                if (array[i] < array[menor]) {
                    menor = i;
                } // se o menor valor continua no index correto não realiza trocas.

            }
            // faz a troca do valor indexado.
            if (menor != fixo) {
                // o 4 vai pra variavel temporaria
                int t = array[fixo];
                // o menor valor vai pra posicao 0
                array[fixo] = array[menor];
                // e o 4 lá vai pra posição do menor valor, que é a posicao 1 agora.
                array[menor] = t;
                // assim fica o array[0] com o numero 3, e na posição 1 com o numero 4
            }
        }
    }

    public static void imprimir(int[] array) {
        for (int aux : array) {
            System.out.println(aux);
        }
    }

    public static void main(String[] args) {
        int numeros_aleatorios[] = new int[] { 4, 3, 9, 12, 7 };
        selectionSort(numeros_aleatorios);
        imprimir(numeros_aleatorios);
    }
}
