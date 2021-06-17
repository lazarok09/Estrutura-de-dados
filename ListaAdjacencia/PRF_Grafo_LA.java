package ListaAdjacencia;

import java.util.ArrayList;
import java.util.Arrays;

public class PRF_Grafo_LA {
    public static void main(String[] args) {
        Vertice nos[] = new Vertice[3];
        nos[0] = new Vertice("A", 0);
        nos[1] = new Vertice("B", 1);
        nos[2] = new Vertice("C", 2);

        Grafo_LA lis = new Grafo_LA(nos);
        // A é o índice zero, B o índice 1 e C o índice 2
        lis.setAresta(0, new ArrayList<>(Arrays.asList(new Vertice[] { nos[1], nos[2] })));
        lis.setAresta(1, new ArrayList<>(Arrays.asList(new Vertice[] { nos[0], nos[2] })));
        lis.setAresta(2, new ArrayList<>(Arrays.asList(new Vertice[] { nos[0], nos[1] })));
        /*
         * Para que se tenha uma entrada válida de nós, primeiramente, deve-se ter a
         * criação de um vetor de vértices nos comandos: new Vertice[]{ nos[1], nos[2]}.
         * Esse trecho é um "atalho" no Java para criar um vertor de vértices e pode ser
         * substituído por:
         * 
         * Vertice vaux[]= new Vertice[2]; vaux[0]= nos[1]; vaux[1]=nos[2]; Ou por
         * Vertice vaux[]=new Vertice[]{nos[1],nos[2]};
         * 
         * o Arrays.asList transforma o vetor de Vértice em um vetor de Array
         * 
         * Assim, por meio da setAresta, temos as ligações na lista de adjacência entre
         * os nós, ligando seu id à lista de vizinhos.
         */
        lis.buscarVizinhos(nos[2]);
        lis.imprimirVizinhos(nos[2]);
    }

}
