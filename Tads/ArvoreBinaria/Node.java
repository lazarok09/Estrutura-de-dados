package Tads.ArvoreBinaria;

public class Node {
    int chave;
    Node esquerda, direita;

    public Node(int valor) {
        chave = valor;
        esquerda = direita = null;
    }

    public int getChave() {
        return chave;
    }

    public void setChave(int aux) {
        chave = aux;
    }

    public Node getDireita() {
        return direita;
    }

    public void setDireita(Node auxiliar) {
        direita = auxiliar;
    }

    public Node getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Node aux) {
        esquerda = aux;
    }

}
