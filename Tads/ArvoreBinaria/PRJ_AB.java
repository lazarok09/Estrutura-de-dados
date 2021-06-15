package Tads.ArvoreBinaria;

public class PRJ_AB {
    public static void main(String[] args) {
        ArvoreBinaria arvoreB = new ArvoreBinaria();
        arvoreB.inserirChave(1);
        arvoreB.inserirChave(2);
        arvoreB.inserirChave(3);
        arvoreB.inserirChave(4);
        arvoreB.inserirChave(5);
        arvoreB.inserirChave(6);
        arvoreB.inserirChave(7);
        arvoreB.inserirChave(8);
        arvoreB.inserirChave(9);

        System.out.println("existe o valor ? " + arvoreB.buscar(9));
    }
}
