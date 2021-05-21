
package VetorOrdenado;

public class VetorOrdenado {
    public static void main(String[] args) {
        /*
         * outra forma int numeros_reais[] = new int[10];
         */
        int numeros_reais[] = { 4, 5, 3, 2, 6, 7, 8, 9, 0, 1 };
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (numeros_reais[i] < numeros_reais[j]) {
                    int aux = numeros_reais[i];
                    numeros_reais[i] = numeros_reais[j];
                    numeros_reais[j] = aux;
                }
            }
        }
        /* imprimir os valores em ordem */
        for (int mostrar : numeros_reais) {
            System.out.println(numeros_reais[mostrar]);
        }
    }
}
