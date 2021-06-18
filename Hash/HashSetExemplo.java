package Hash;

import java.util.*;
import java.util.HashSet;

public class HashSetExemplo {
    public static void main(String[] args) {
        Set<Integer> tabela = new HashSet<Integer>();

        tabela.add(10);
        tabela.add(20);
        tabela.add(30);
        tabela.add(40);
        tabela.add(50);

        System.out.println("Remover : " + tabela.remove(10));
        System.out.println("Contém : " + tabela.contains(10));
        // for each
        for (Integer aux : tabela) {
            System.out.println(aux + "-" + aux.hashCode());
        }

    }
}
