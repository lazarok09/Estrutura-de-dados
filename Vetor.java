import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nomes[] = new String[2];

        /* adicionando nomes */
        System.out.println("Digite o index e em seguida o nome");
        int index = s.nextInt();
        String coletora = s.next();

        /* adiciona ao vetor */
        nomes[index] = coletora;
        /* imprime o valor */
        System.out.println(nomes[1]);
        s.close();
    }

}