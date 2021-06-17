package Pesquisa_de_dados;

public class Sequencial {
    public static boolean buscaSequencial(int[] vetor, int pesquisar) {

        for (int pos = 0; pos < vetor.length; pos++) {
            if (pesquisar == vetor[pos]) {
                System.out.println("Localizado");
                return true;
            }
        }
        return false;
    }
}
