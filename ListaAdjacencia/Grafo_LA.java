package ListaAdjacencia;

import java.util.ArrayList;

public class Grafo_LA {
    // declaração "nos" é um vetor do tipo vertice
    Vertice nos[];
    // vetor de arrays
    ArrayList<Vertice> arestas[];

    public Grafo_LA(Vertice nos_aux[]) {
        // , passam como parâmetros os nós. Além disso, o vetor de arrays é criado com o
        // tamanho total de nós que foram recebidos.
        nos = nos_aux;
        arestas = new ArrayList[nos.length];
    }

    // função setAresta recebe um id que vai ser o índice do grafo, e um vetor de
    // vertices chamado "vizinhos"
    // Logo a aresta na posiçao informada irá alocar um vetor de vértices.
    public void setAresta(int id, ArrayList<Vertice> vizinhos) {
        arestas[id] = vizinhos;
    }

    // A função imprimirVizinhos, na linha 17, recebe o vértice a ser procurado,
    // busca no array as arestas da posição do índice do vértice e imprime em tela.
    public void imprimirVizinhos(Vertice no_aux) {
        System.out.println("Vizinhos de " + no_aux.getNome());
        for (Vertice aux1 : arestas[no_aux.getIndice()]) {
            System.out.println(aux1);
        }
    }
    // A função na linha 38 possui a função buscarVizinhos, que retorna os vizinhos
    // do vértice enviado por meio do comando arestas[noaux.getIndice()]. Observe
    // que está se criando um arraylist na linha 28 com o resultado da busca, pois
    // na linha 26 tem como resultado da função o envio de uma arraylist.

    public ArrayList buscarVizinhos(Vertice no_aux) {
        return new ArrayList<>(arestas[no_aux.getIndice()]);
    }

}
