package Tads.Listas.Pilha;

public class Pilha2 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        // adiciona valores
        pilha.push(5);
        pilha.push(1);
        pilha.push(2);
        pilha.push(9);
        pilha.push(7);
        // peek() imprime o valor do topo da pilha
        System.out.println(pilha.peek());
        // deleta valores
        pilha.pop();
        System.out.println("\n" + pilha.peek());
    }

}
