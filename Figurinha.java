package EstruturaDeDados;

import java.util.Scanner;

public class Figurinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int mdc = calcularMDC(a, b);
            System.out.println(mdc);
        }
    }
    private static int calcularMDC(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calcularMDC(b, a % b);
    }
}
