package Teste;

import java.util.Scanner;
import Lista.MinhaLista;

// Teste 1
//Entrada ->  10  ->   1 1 1 1 0 1 1 1 1 0 
//Saida -> 8

//Teste 2
//Entrada ->  8 -> 1 0 0 1 1 0 1 1
//Saida -> 5

public class Bee3126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCandidatos = scanner.nextInt();
        scanner.nextLine(); 
        String participacaoString = scanner.nextLine();
        String[] participacaoArray = participacaoString.split(" ");
        int compareceram = 0;
        for (String valor : participacaoArray) {
            if (valor.equals("1")) {
                compareceram++;
            }
        }
        System.out.println(compareceram);
        scanner.close();
    }
}
