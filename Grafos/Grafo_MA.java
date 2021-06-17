package Grafos;

import java.util.ArrayList;

public class Grafo_MA {
    // declaração de matriz com duas posições
    private final int matriz[][];
    // vetor denominado nos
    private final Vertice nos[];

    // quantidade de nós do grafo
    public int size() {
        return matriz.length;
    }

    // capiturar o Nó no vertice, cada nó possui um id
    public Vertice getNo(int id) {
        return nos[id];
    }

    public int getCelula(int l, int c) {
        return matriz[l][c];
    }

    // construtor que recebe os nós que entra na matriz
    public Grafo_MA(Vertice nos_aux[]) {
        nos = nos_aux;
        matriz = new int[nos_aux.length][nos_aux.length];
    }

    // função mais importante da classe
    // cada linha e coluna representam um vértice
    public void setAresta(int linha, int coluna) {
        matriz[linha][coluna] = 1;
        // seta um caso haja ligação, mas zero é default da matriz
    }

    public ArrayList<Vertice> buscarVizinhos(Vertice no_aux) {
        ArrayList<Vertice> array = new ArrayList<>();
        for (int i = 0; i < nos.length; i++) {
            if (matriz[no_aux.getIndice()][i] != 0) {
                array.add(nos[i]);
            }
        }
        return array;
    }

    public void imprimirVizinhos(Vertice no_aux) {
        System.out.println("Os vizinhos de " + no_aux.getNome() + " São : ");

        for (int i = 0; i < nos.length; i++) {
            if (matriz[no_aux.getIndice()][i] != 0) {
                System.out.println(matriz[no_aux.getIndice()][i] + " - " + nos[i].get(i));
                ;
            }
        }
    }
}
