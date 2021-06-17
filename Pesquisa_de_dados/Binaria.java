package Pesquisa_de_dados;

public class Binaria {
    public static boolean buscaBinaria(int[] vetor, int pesquisar) {
        if (pesquisar >= vetor[(int) (vetor.length / 2)]) {
            for (int pos = 0; pos < vetor.length; pos++) {
                if (pesquisar == vetor[pos]) {
                    System.out.println("Localizado");
                    return true;
                }
            }
        } else {
            for (int pos = vetor.length; pos > 0; pos--) {
                if (pesquisar == vetor[pos]) {
                    System.out.println("Localizado");
                    return true;
                }
            }
        }
        return false;
    }
}
