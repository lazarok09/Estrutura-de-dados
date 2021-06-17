package ListaAdjacencia;

public class Vertice {
    private final String nome;
    private boolean visitado = false;
    private final int indice;

    public Vertice(String nome, int id) {
        this.indice = id;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public int getIndice() {
        return indice;
    }

    public String get(int i) {
        return getNome();
    }

}
