package Tads.ArvoreBinaria.CollectionClassTree;

import java.util.TreeSet;

public class PRJ_ArvoreRN {
    public static void main(String[] args) {
        TreeSet<Integer> arvore = new TreeSet<Integer>();
        arvore.add(1);
        arvore.add(2);
        arvore.add(3);

        // não aceita valores duplicados
        arvore.add(3);

        System.out.println(arvore);
    }

}
