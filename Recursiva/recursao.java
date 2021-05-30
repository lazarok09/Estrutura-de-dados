package Recursiva;

public class recursao {
    // recursao é uma função que chama a si mesmo e trata o argumento
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int number) {
        if (number == 1) {
            return number;
        }
        return (fatorial(number - 1) * number);

    }
}
