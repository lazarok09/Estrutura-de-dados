package Grafos;

public class PRF_Grafo {
    public static void main(String[] args) {
        Vertice nos[] = new Vertice[3];
        nos[0] = new Vertice("A", 0);
        nos[1] = new Vertice("B", 1);
        nos[2] = new Vertice("C", 2);

        Grafo_MA grafo_mat = new Grafo_MA(nos);

        grafo_mat.setAresta(0, 1);
        grafo_mat.setAresta(0, 2);
        grafo_mat.setAresta(1, 0);
        grafo_mat.setAresta(1, 2);
        grafo_mat.setAresta(2, 0);
        grafo_mat.setAresta(2, 1);

        grafo_mat.imprimirVizinhos(nos[0]);

    }

}
