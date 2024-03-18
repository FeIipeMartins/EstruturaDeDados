package EstruturaDeDados;

import java.util.Scanner;

public class Fibonacci_Interativo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        long[] fib = new long[x];
        if (x > 0) fib[0] = 0;
        if (x > 1) fib[1] = 1;
        for (int i = 2; i < x; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < x; i++) {
            System.out.print(fib[i] + (i < x - 1 ? " " : "\n"));
        }
    }
}
