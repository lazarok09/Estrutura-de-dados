package Matriz;

public class Matriz {
    public static void main(String[] args) {
        String nomes[][] = new String[2][2];
        nomes[0][0] = "lazaro";
        nomes[0][1] = "Boi";
        nomes[1][0] = "Carlos";
        nomes[1][1] = "Pedroca";
        /* com contador */
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < nomes.length; j++) {
                System.out.println(nomes[i][j]);
            }
        }
        System.out.println("for each \n ----------");
        for (String nomes_linha[] : nomes) {
            for (String nomes_coluna : nomes_linha) {
                System.out.println(nomes_coluna);
            }
        }
    }

}
