package Tads.Listas.ListaLigada;

public class ListaLigadaMain {
    public static void main(String[] args) {
        ListaLigada listaligada = new ListaLigada();

        listaligada.adicionaInicio(1);
        listaligada.adicionaFim(2);
        listaligada.adicionaFim(3);

        listaligada.adicionaInicio(0);

        listaligada.imprimir();

        System.out.println("Buscar o valor 3 da lista " + listaligada.buscar(3));

        System.out.println("Excluido o valor 6 " + listaligada.excluir(6));

        listaligada.imprimir();
    }

}
