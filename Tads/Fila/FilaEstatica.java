package Tads.Fila;

public class FilaEstatica {
    private int[] vFila;
    private int qtdElementos;

    // construtor
    public FilaEstatica(int tamanho) {
        vFila = new int[tamanho];
        qtdElementos = -1;
    }

    // verificação se está vazia
    public boolean isEmpty() {
        return (vFila.length == -1) ? true : false;
    }

    // cheia
    public boolean isFull() {
        return (qtdElementos == vFila.length - 1) ? true : false;
    }

    // acessa o topo da fila
    public int peek() {
        return (!isEmpty()) ? vFila[0] : -1;
    }

    // Adicionar elementos First in First Out
    public void enQueue(int valor) {
        if (!isFull()) {
            qtdElementos++;
            vFila[qtdElementos] = valor;
        }

    }

    // remover elementos da fila
    public int deQueue() {

        if (!isEmpty()) {
            int removido = vFila[0];
            qtdElementos--;
            for (int i = 0; i < qtdElementos; i++) {
                vFila[i] = vFila[i + 1];
            }
            return removido;
        } else {
            return -1;
        }
    }

    // imprimir valores da fila
    public void imprimir() {
        for (int aux : vFila) {
            System.out.println(aux);
        }
    }

    public static void main(String[] args) {
        FilaEstatica f = new FilaEstatica(3);
        f.enQueue(5);
        f.enQueue(10);
        f.enQueue(30);
        // imprime o valor do index zero ou começo da fila
        System.out.println(f.peek() + "\n ----------");
        // impressão de todos os valores da fila
        f.imprimir();

        f.deQueue();
        System.out.println("-----------");
        f.imprimir();

    }
}
