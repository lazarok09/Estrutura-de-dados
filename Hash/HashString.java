package Hash;

public class HashString {
    public static void main(String[] args) {

        String nome = "Ana";
        // hashing para poder aplicar o valor da chave Ana, que é 50452 em um tamanho de
        // vetor pequeno.
        long hash = (long) (nome.charAt(0) * (Math.pow(27, nome.length() - 1)));
        hash += (long) (nome.charAt(1) * (Math.pow(27, nome.length() - 2)));
        hash += (long) (nome.charAt(2) * (Math.pow(27, nome.length() - 3)));

        System.out.println("O hash de " + nome + " é " + hash);

        System.out.println(getHashCode(50452, 7));
    }

    // Considerando a função getHashCode com o valor 50452 e com o tamanho 7 de
    // vetor, ele seria armazenado na posição 3.
    public static int getHashCode(int valor, int tamanho) {
        int hashcode = valor % tamanho;
        return hashcode;
    }

}
