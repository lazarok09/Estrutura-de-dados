package Tads.Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FilaDinamica {

    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<Integer>();
        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println("remover" + fila.remove(2));
        System.out.println("size : " + fila.size());
        System.out.println("Buscar : " + fila.contains(1));

        // fazendo a varredura usando o método de Objeto - Array
        Object var_aux[] = fila.toArray();
        for (int i = 0; i < var_aux.length; i++) {
            System.out.println("valor é " + var_aux[i]);
        }
        // utilizando o design patter iterator
        Iterator<Integer> filaIterator = fila.iterator();

        while (filaIterator.hasNext()) {
            System.out.println("VALOR :" + filaIterator.next());
        }
    }

}
