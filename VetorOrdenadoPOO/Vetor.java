package VetorOrdenadoPOO;

public class Vetor {
    private int posicao_derivada = 0;
    private int size;
    String nomes[];

    /* Construtor */
    public Vetor(int max) {
        setSize(max);
        nomes = new String[size];
    }
    /* Aplicando CRUD */

    /* create */

    public void setNome(String nome) {
        if (nomes[0] != null) {
            posicao_derivada++;
        }
        nomes[posicao_derivada] = nome;
    }

    /* read */
    public void getNomes() {
        for (String aux : nomes) {
            if (aux == "") {
                break;
            }
            System.out.println(aux);
        }
    }

    public String getNome(int posicao) {
        return nomes[posicao];
    }

    /* update */
    public void atualizar(int index, String nome) {
        if (nomes[index] != "") {
            nomes[index] = nome;
        } else {
            System.out.println("Não há valor nesse index para atualizar.");
        }
    }

    /* remove */
    public void remover(int index) {
        this.nomes[index] = "";
    }

    public void limparVetor() {
        for (int i = 0; i < nomes.length; i++) {
            this.nomes[i] = "";
        }
    }
    /* fim do acrônimo CRUD */

    /* getters and setters */
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    /* organizar vetor em ordem crescente por quantidade de letras */
    public void organizar() {
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes.length; j++) {
                if (nomes[i].length() < nomes[j].length()) {
                    String aux;
                    aux = nomes[j];
                    nomes[j] = nomes[i];
                    nomes[i] = aux;
                }
            }
        }
    }

}
