package Tads.Listas.PilhaClasseStack;

import java.util.Stack;

public class PilhaCS {
    private Stack<Integer> Pilha;

    PilhaCS() {
        Pilha = new Stack<Integer>();
    }

    public void insere(int aux) {
        Pilha.push(aux);
    }

    public int atual() {
        return Pilha.peek();
    }

    public int ultimo() {
        return Pilha.firstElement();
    }

    public void print() {
        for (int valores : Pilha) {
            System.out.println(valores);
        }
    }

    public void remove() {
        Pilha.pop();
    }

    public boolean estaLimpo() {
        return Pilha.empty();
    }

    // retorna o tamanho e capacidade
    public String toString() {
        String msg = " ";
        msg += "\n capacidade " + Pilha.capacity();
        msg += "\n tamanho " + Pilha.size();
        return msg;
    }

    // busca o elemento dentro da pilha e retorna seu index de baixo pra cima
    public int pesquisar(int aux) {
        return Pilha.search(aux);
    }
}