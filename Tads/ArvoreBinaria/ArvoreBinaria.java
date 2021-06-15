package Tads.ArvoreBinaria;

public class ArvoreBinaria {
    Node raiz;

    // INICIA A RAIZ COMO NULL
    ArvoreBinaria() {
        raiz = null;
    }

    // INSERIR CHAVE
    public void inserirChave(int chave) {
        raiz = inserirNode(raiz, chave);
    }

    // INSERIR NODE
    private Node inserirNode(Node aux_raiz, int chave) {

        if (aux_raiz == null) {
            aux_raiz = new Node(chave);
            return aux_raiz;
        }
        // se a chave for menor que a chave raiz
        // gravar na esquerda, se não, na direita.
        if (chave < aux_raiz.chave) {
            aux_raiz.esquerda = inserirNode(aux_raiz.esquerda, chave);
        } else if (chave > aux_raiz.getChave()) {
            aux_raiz.direita = inserirNode(aux_raiz.direita, chave);
        }
        return aux_raiz;
    }

    // BUSCAR CHAVE DENTRO DA ÁRVORE
    public boolean buscar(int valor) {
        Node aux = this.raiz;
        while (aux != null) {
            if (aux.chave == valor) {
                return true;
                // SE chave > valor => navegar à esquerda
            } else if (aux.chave > valor) {
                aux = aux.esquerda;
                // SE chave < valor navegar à direita
            } else {
                aux = aux.direita;
            }
        }
        return false;
    }

    // PERCURSO IN ORDEM NA ARVORE
    public void inOrdem() {
        // chama o inOrdem private
        inOrdem(raiz);
    }

    private void inOrdem(Node aux) {
        if (aux != null) {
            inOrdem(aux.esquerda);
            System.out.println(aux.chave + " ");
            inOrdem(aux.direita);
        }
    }

    // DELETAR CHAVE
    public void deletarChave(int chave) {
        raiz = deletarNode(raiz, chave);
    }

    private Node deletarNode(Node aux_raiz, int chave) {
        if (aux_raiz == null) {
            return aux_raiz;
        }
        // Se chave a ser buscada for menor que "raiz" chamar novamente a função nó
        // esquerda, caso contrário nó direita
        if (chave < aux_raiz.chave) {
            aux_raiz.esquerda = deletarNode(aux_raiz.esquerda, chave);

        } else if (chave > aux_raiz.chave) {
            aux_raiz.direita = deletarNode(aux_raiz.direita, chave);
        }
        // CHAVE == chave da RAIZ
        else {
            // Nó com 1 filho ou sem filho
            if (aux_raiz.esquerda == null) {
                return aux_raiz.direita;
            } else if (aux_raiz.direita == null) {
                return aux_raiz.esquerda;
            }

            int minimo = raiz.chave;
            while (raiz.esquerda != null) {
                minimo = (raiz.esquerda).chave;
                raiz = raiz.esquerda;
            }
            aux_raiz.chave = minimo;

            aux_raiz.direita = deletarNode(aux_raiz.direita, aux_raiz.chave);
        }
        return aux_raiz;
    }
}
