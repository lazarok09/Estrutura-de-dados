package AtividadeContextualizada.attcontext;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ATTCONTEXT {

    public static void main(String[] args) {
        // pegando o tempo no começo do algoritmo
        long mili = System.currentTimeMillis();

        Set<Integer> hashSet = new HashSet<Integer>();
        // adiciona mil números aleatórios no hashSet
        int i;
        // variável i declarada fora do escopo para ser verificada na linha 27
        for (i = 1; i <= 10000; i++) {
            int numero = i;
            hashSet.add(numero);
        }
        // para fins de debug e ter a certeza de que dez mil valores foram inseridos
        System.out.println("Foram adicionados " + i + " numeros aleatórios para o hashSet");

        // inicia o design patter iterator para percorrer a estrutura
        Iterator<Integer> hashIterator = hashSet.iterator();
        System.out.println("-- imprimindo valores em posição hash--");
        while (hashIterator.hasNext()) {
            System.out.println(hashIterator.next());
        }
        System.out.println("Tamanho atual do hashSet " + hashSet.size());
        // traz a diferença entre os dois valores de tempo, o inicial e o último.
        long miliSecondary = System.currentTimeMillis();
        long seconds = (mili - miliSecondary);
        long segundos = TimeUnit.MILLISECONDS.toSeconds(seconds);

        // traz o valor positivo
        segundos = Math.abs(segundos);
        System.out.println(
                "Demorou cerca de  " + segundos + " segundos para" + " imprimir todos os valores contidos no hashSet");

        System.out.println("---Área de remoção---");
        long antesDaRemocao = System.currentTimeMillis();
        // criando um for pra remover 5 mil elementos
        for (int j = 0; j <= 5000; j++) {
            System.out.println("Removendo o valor " + j);
            hashSet.remove(j);
        }

        System.out.println("Tamanho atual do hash : " + hashSet.size());

        long depoisDaRemocao = System.currentTimeMillis();
        long tempoAtual = depoisDaRemocao - antesDaRemocao;
        long tempoDeRemocao = TimeUnit.MILLISECONDS.toSeconds(tempoAtual);
        // traz o valor positivo
        tempoDeRemocao = Math.abs(tempoDeRemocao);
        System.out.println("A remoção durou cerca de : " + tempoDeRemocao + " segundos");

    }
}
