package Tads.Listas.DuplamenteLigada;

public class Node {
    private int valor;
    private Node proximo, anterior;

    Node(int auxiliar_valor, Node aux_proximo, Node aux_anterior) {
        valor = auxiliar_valor;
        proximo = aux_proximo;
        anterior = aux_anterior;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int aux) {
        valor = aux;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node auxiliar) {
        proximo = auxiliar;
    }

    public void setAnterior(Node aux) {
        anterior = aux;
    }

    public Node getAnterior() {
        return anterior;
    }

}
