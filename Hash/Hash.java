package Hash;

import java.util.Vector;

public class Hash {
    public static void main(String[] args) {
        int vetor[] = { 1, 2, 3 };
        // for each
        mostrarVetor(vetor);
        System.out.println(getHash(3, 2));
    }

    public static int getHash(int valor, int tamanho) {
        int hashcode = valor % tamanho;
        return hashcode;
    }

    public static void mostrarVetor(int v[]) {
        for (int aux : v) {
            System.out.println(aux);
        }

    }
}
