package ListaAdjacencia;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Buscas {
    public void buscaDFS(Grafo_MA adj) {
        this.resetar(adj);
        Stack<Vertice> pilha = new Stack<>();

        adj.getNo(0).setVisitado(true);
        pilha.add(adj.getNo(0));
        System.out.println(adj.getNo(0).getNome());

        while (!pilha.isEmpty()) {
            int idVizinho = this.getIDVizinhos(adj, pilha.peek().getIndice());
            if (idVizinho == -1) {
                pilha.pop();
            } else {
                adj.getNo(idVizinho).setVisitado(true);
                pilha.push(adj.getNo(idVizinho));
                System.out.println(" , " + adj.getNo(idVizinho).getNome());
            }
        }
    }

    public int getIDVizinhos(Grafo_MA adj, int id_atual) {
        for (int j = 0; j < adj.size(); j++) {
            if (adj.getNo(j).isVisitado() == false && adj.getCelula(id_atual, j) == 1) {
                return j;
            }

        }
        return -1;
    }

    public void resetar(Grafo_MA adj) {
        for (int i = 0; i < adj.size(); i++) {
            adj.getNo(i).setVisitado(false);
        }
    }

    public void buscarBFS(Grafo_MA adj) {
        this.resetar(adj);

        Queue<Vertice> fila = new LinkedList<>();
        adj.getNo(0).setVisitado(true);
        fila.add(adj.getNo(0));
        System.out.println(adj.getNo(0).getNome());

        while (!fila.isEmpty()) {
            int indiceAtual = fila.remove().getIndice();
            int idVizinhos = getIDVizinhos(adj, indiceAtual);

            while (idVizinhos != -1) {
                adj.getNo(idVizinhos).setVisitado(true);
                fila.add(adj.getNo(idVizinhos));

                System.out.println(" , " + adj.getNo(idVizinhos).getNome());
                idVizinhos = getIDVizinhos(adj, indiceAtual);
            }
        }
    }
}
