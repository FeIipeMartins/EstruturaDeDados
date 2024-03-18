package Teste;

import Lista.MinhaLista;
import java.util.Scanner;

// Teste 1	
//  Entrada ->   7 Charmander Caterpie Pidgeot Rattata Zubat Zubat Zubat  
// 	Saida ->   Falta(m) 146 pomekon(s).

// Teste 2
// Entrada ->   8 Zubat Zubat Zubat Zubat Zubat Zubat Zubat Zubat
//	Saida ->   Falta(m) 150 pomekon(s).

public class Bee2174 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        MinhaLista pomekonsCapturados = new MinhaLista(n);
        for (int i = 0; i < n; i++) {
            String pomekon = scanner.nextLine();
            pomekonsCapturados.adicionar(pomekon);
        }
        MinhaLista pomekonsUnicos = new MinhaLista(n);
        for (int i = 0; i < pomekonsCapturados.tamanho(); i++) {
            if (!pomekonsUnicos.contem(pomekonsCapturados.obter(i))) {
                pomekonsUnicos.adicionar(pomekonsCapturados.obter(i));
            }
        }
        int pomekonsFaltando = 151 - pomekonsUnicos.tamanho();
        System.out.println("Falta(m) " + pomekonsFaltando + " pomekon(s).");
        scanner.close();
    }
}


