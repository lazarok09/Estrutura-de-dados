package Tads.Listas.DuplamenteLigada;

public class LDL_main {
    public static void main(String[] args) {
        ListaDuplamenteLigada LDL = new ListaDuplamenteLigada();

        LDL.adicionaInicio(-2);
        LDL.adicionaInicio(-1);
        LDL.adicionaInicio(0);
        LDL.adicionaInicio(1);
        LDL.adicionaInicio(2);

        LDL.imprimir();
        LDL.buscar(2);
    }
}
