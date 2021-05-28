
package VetorOrdenadoPOO;

import java.util.Scanner;

public class VOPOO {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // inicia o vetor e seu tamanho
        System.out.println("Tamanho em numero inteiro para o vetor 'nomes' ");
        int tamanho = s.nextInt();
        Vetor nomes = new Vetor(tamanho);

        /* salva os nomes no vetor */
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite os nomes em sequencia");
            String nome = s.next();
            nomes.setNome(nome);
        }

        // iniciando questionario //
        int resposta = 10;
        while (resposta == 10) {
            System.out.println(
                    "-- Escolha uma das opções -- \n 1 - visualizar os nomes \n 2 - organizar os nomes \n 3 - remover algum dos nomes \n 4 - atualizar um dos nomes \n 5 - limpar o vetor \n outro numero para sair do programa");
            int opcao = s.nextInt();
            switch (opcao) {
                case 1:
                    nomes.getNomes();
                    break;
                case 2:
                    nomes.boobleSort();
                    break;
                case 3:
                    System.out.println("Digite o número do nome, onde 0 representa o primeiro nome.");
                    int index_remover = s.nextInt();
                    nomes.remover(index_remover);
                    break;
                // 4 - atualizar um dos nomes \n 5 - limpar o vetor \n 6 - aumentar o tamanho
                // ");
                case 4:
                    System.out.println("Digite o número do nome, onde 0 representa o primeiro nome");
                    int index_atualizar = s.nextInt();
                    System.out.println("Agora digite o novo nome");
                    String novo_nome = s.next();
                    nomes.atualizar(index_atualizar, novo_nome);
                    break;
                case 5:
                    nomes.limparVetor();
                    System.out.println("Vetor limpo com Sucesso");
                    break;
                default:
                    System.out.println("você saiu do programa");
                    resposta = 0;
            }

        }

    }
}
