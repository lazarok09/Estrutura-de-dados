package Tads.Listas;

public class No {
    // No, Node ou lista ligada.
    /* ------------------------------- */
    // * toda lista ou estrutura de dados deve ter obrigatoriamente o código do No *

    private No proximo;
    private int valor;

    No(int v, No n) {
        valor = v;
        proximo = n;
    }

    public void setValor(int valor) {
        valor = valor;
    }

    public int getValor() {
        return this.valor;
    }

    public void setProximo(No referencia_no) {
        proximo = referencia_no;
    }

    public No getProximo() {
        return proximo;
    }

}
