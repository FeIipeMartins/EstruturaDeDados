package Beecrowd;

import java.util.Scanner;

public class Bee1255 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); 
        scanner.nextLine();
        for (int i = 0; i < N; i++) {
            String input = scanner.nextLine();
            String result = mostFrequentLetters(input);
            System.out.println(result);
        }
        scanner.close();
    }
    public static String mostFrequentLetters(String input) {
        int[] frequency = new int[26];
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
                frequency[c - 'a']++;
            }
        }
        int maxFrequency = 0;
        for (int freq : frequency) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        StringBuilder result = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (frequency[c - 'a'] == maxFrequency) {
                result.append(c);
            }
        }
        return result.toString();
    }
}