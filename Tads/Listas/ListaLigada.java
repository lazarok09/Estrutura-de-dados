package Tads.Listas;

public class ListaLigada {
    private No primeiroNo;
    private No ultimoNo;

    // Início da lista com os valores da lista nulos.
    ListaLigada() {
        primeiroNo = null;
        ultimoNo = null;
    }

    // Função que verifica se a lista está sem valores
    public boolean isEmpty() {
        return (primeiroNo == null) ? true : false;
    }

    // Adiciona nós pelo início
    public void adicionaInicio(int valor) {
        if (isEmpty()) {
            primeiroNo = ultimoNo = new No(valor, null);
        } else {
            primeiroNo = new No(valor, primeiroNo);
        }
    }

    // Adiciona nó no final da Estrutura
    public void adicionaFim(int valor) {
        if (isEmpty()) {
            primeiroNo = ultimoNo = new No(valor, null);
        } else {
            ultimoNo.setProximo(new No(valor, null));
            ultimoNo = ultimoNo.getProximo();
        }
    }

    // impressao dos valores do No
    public void imprimir() {
        No aux = primeiroNo;
        while (aux != null) {
            System.out.println(aux.getValor() + " ");
            aux = aux.getProximo();
        }
    }

    // buscar valores no No
    public boolean buscar(int valor_buscado) {
        No atual = primeiroNo;
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

    // excluir No na lista
    public boolean excluir(int valor) {
        No atual = primeiroNo;
        while (atual != null) {

            if (atual.getValor() == valor) {
                // achou o valor que será excluido
                No anterior = primeiroNo;
                while (anterior != null) {
                    if (anterior.getProximo() == atual) {
                        anterior.setProximo(atual.getProximo());
                        return true;
                    } else if (anterior == atual) {
                        primeiroNo = atual.getProximo();
                        return false;
                    }
                    anterior = anterior.getProximo();
                }
            }
            // não achou o valor pra ser excluido e passa pro proximo No
            atual = atual.getProximo();
            // a linha 81 busca sempre o proximo indice do No
        }
        return false;
    }
}
