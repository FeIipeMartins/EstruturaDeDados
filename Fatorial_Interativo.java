package EstruturaDeDados;

import java.util.Scanner;

public class Fatorial_Interativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int resultado = calcularFatorial(N);
        System.out.println(resultado);
    }

    public static int calcularFatorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            int fatorial = 1;
            for (int i = 2; i <= N; i++) {
                fatorial *= i;
            }
            return fatorial;
        }
    }
}