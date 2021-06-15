package Tads.PilhaClasseStack;

public class PilhaCS_Main {
    public static void main(String[] args) {
        PilhaCS pi = new PilhaCS();
        // A pilha implementa valores de forma dinâmica.
        pi.insere(10);
        pi.insere(2);
        pi.insere(40);
        pi.insere(11);
        pi.insere(5);
        pi.insere(7);
        System.out.println(pi.toString());

        System.out.println("Está limpo ? : " + pi.estaLimpo());

        System.out.println("\n ---- \n Remover do topo");
        pi.remove();
        System.out.println(pi.toString());
        pi.print();

        System.out.println("tentando uma pesquisa : " + pi.pesquisar(11));
        // abaixo retorna o valor do topo da pilha
        System.out.println(pi.atual());
        // o ultimo é o primeiro valor adicionado FILO
        System.out.println(pi.ultimo());
    }
}