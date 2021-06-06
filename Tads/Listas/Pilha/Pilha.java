package Tads.Listas.Pilha;

public class Pilha {
    private int vetorPilha[];
    private int topo;

    // cnstrutor com tamanho maximo definido
    public Pilha(int maximo) {
        vetorPilha = new int[maximo];
        topo = -1;
    }

    // se o topo é igual a -1 retorna true, o que significa que a pilha está vazia
    public boolean isEmpty() {
        return (topo == -1);
    }

    // se o topo é igual ao tamanho, está cheio.
    public boolean isFull() {
        return (topo == (vetorPilha.length - 1));
    }

    // retorna o valor do topo da pilha
    public int peek() {
        return vetorPilha[topo];
    }

    // adiciona valor na pilha
    public void push(int valor) {
        if (!isFull()) {
            topo++;
            vetorPilha[topo] = valor;
        }
    }

    // excluir valor da pilha
    public int pop() {
        return (vetorPilha[topo--]);
    }
}
