package Tads.Listas.DuplamenteLigada;

public class ListaDuplamenteLigada {

    private Node primeiroNode;
    private Node ultimoNode;

    public ListaDuplamenteLigada() {
        primeiroNode = ultimoNode = null;
    }

    // Verifica se há nós na lista
    public boolean isEmpty() {
        return (primeiroNode != null) ? true : false;
    }

    // Adiciona nós pelo inicio
    public void adicionaInicio(int valor) {
        if (isEmpty()) {
            primeiroNode = ultimoNode = new Node(valor, null, null);
        } else {
            // cria-se um novo Node, endereçando o Node atual no seu objeto primeiroNode na
            // linha 20, fazendo sua alocação para a esquerda.
            primeiroNode = new Node(valor, primeiroNode, null);
        }
    }

    // Pelo fim
    public void adicionaFim(int valor) {
        if (isEmpty()) {
            primeiroNode = ultimoNode = new Node(valor, null, null);
        } else {
            // remete como parâmetro o ultimoNode na linha 35, fazendo sua alocação para a
            // direita.
            ultimoNode.setProximo(new Node(valor, null, ultimoNode));
            ultimoNode = ultimoNode.getProximo();
        }
    }

    // imprimir valores
    public void imprimir() {
        Node auxiliar = primeiroNode;
        while (auxiliar != null) {
            System.out.println(auxiliar.getValor() + " ");
            auxiliar = auxiliar.getProximo();
        }
    }

    // buscar valores
    // buscar valores no No
    public boolean buscar(int valor_buscado) {
        Node atual = primeiroNode;
        while (atual != null) {

            if (valor_buscado == atual.getValor()) {
                System.out.println("Encontrado:" + valor_buscado);
                return true;
            }
            atual = atual.getProximo();
        }
        System.out.println("Não encontrado:" + valor_buscado);
        return false;
    }

}