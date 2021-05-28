package Collection;

import java.util.Collections;

import java.util.*;

public class Collection {
    public static void main(String[] args) {

        Collection<Integer> col;
        col = new LinkedList<Integer>();
        for (int i = 0; i < 100; i++) {
            col.add(i);

        }
        imprimir(col);
        // remover //
        col.remove(3);
        imprimir(col);
        if (col.contains(5)) {
            col.remove(5);
            col.add(6);
        }
        System.out.println("------");
        imprimir(col);

    }

    public static void imprimir(Collection<Integer> coll) {
        for (int x : coll) {
            System.out.println(x);
        }
    }
}
