package Teste;

import Lista.MinhaLista;
import java.util.Scanner;

//  Entrada ->   2 carne laranja suco picles laranja picles laranja pera laranja pera pera
// 	Saida ->   carne laranja picles suco laranja pera

public class Bee2729 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosTeste = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < casosTeste; i++) {
            String listaCompras = scanner.nextLine();
            MinhaLista lista = new MinhaLista(1000);
            String[] itens = listaCompras.split(" ");
            for (String item : itens) {
                if (!lista.contem(item)) {
                    lista.adicionar(item);
                }
            }
            lista.ordenarAlfabeticamente();
            StringBuilder listaFormatada = new StringBuilder();
            for (int j = 0; j < lista.tamanho(); j++) {
                listaFormatada.append(lista.obter(j));
                if (j < lista.tamanho() - 1) {
                    listaFormatada.append(" ");
                }
            }
            System.out.println(listaFormatada.toString());
        }
        scanner.close();
    }
}