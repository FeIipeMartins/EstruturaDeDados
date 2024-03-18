package EstruturaDeDados;

import java.util.Scanner;

public class QuantasChamadas {
    static int calls = 0;
    static long fib(int n) {
        calls++;
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt(); 
            calls = 0; 
            long result = fib(X);
            System.out.printf("fib(%d) = %d calls = %d%n", X, calls - 1, result);
        }
        sc.close();
    }
}
