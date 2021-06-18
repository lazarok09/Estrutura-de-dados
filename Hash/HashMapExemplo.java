package Hash;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemplo {
    public static void main(String[] args) {
        Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();
        mapa.put(1, 100);
        mapa.put(2, 200);
        mapa.put(3, 300);
        mapa.put(4, 400);
        mapa.put(5, 500);

        System.out.println("Remover o valor : " + mapa.remove(2));
        System.out.println("mostrar valor da chave " + mapa.get(1));
        System.out.println("Contém a chave ? : " + mapa.containsKey(1));
        System.out.println("Contains por valor ::" + mapa.containsValue(100));

        for (Integer aux : mapa.keySet()) {
            System.out.println(aux + " - " + aux.hashCode() + " - " + mapa.get(aux));
        }
    }
}
