package Beecrowd;

import java.util.ArrayList;
import java.util.Scanner;

public class Bee1033 {
    static ArrayList<Long> calls;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calls = new ArrayList<>();
        int caseNumber = 1;
        while (true) {
            long n = scanner.nextLong();
            long b = scanner.nextLong();
            if (n == 0 && b == 0) 
                break;
            calls.clear();
            long result = fibonacci(n);
            System.out.println("Case " + caseNumber + ": " + n + " " + b + " " + (result % b));
            caseNumber++;
        }
        scanner.close();
    }
    public static long fibonacci(long n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n < calls.size())
            return calls.get((int)n);
        long result = (fibonacci(n - 1) + fibonacci(n - 2)) % 10000;
        calls.add(result);
        return result;
    }
}
