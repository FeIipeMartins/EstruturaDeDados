package Teste;

import java.util.Scanner;
import Lista.MinhaLista;

// Entrada 10 4 32 34 543 3456 654 567 87 6789 98
// Saida 4 32 34 98 654 3456 6789 567 543 87

public class Bee1259{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        MinhaLista lista = new MinhaLista(N);
        for (int i = 0; i < N; i++) {
            int valor = scanner.nextInt();
            lista.adicionar(Integer.toString(valor));
        }
        
        MinhaLista pares = new MinhaLista(N);
        MinhaLista impares = new MinhaLista(N);
        for (int i = 0; i < lista.tamanho(); i++) {
            int valor = Integer.parseInt(lista.obter(i));
            if (MinhaLista.ehPar(valor)) { 
                pares.adicionar(Integer.toString(valor));
            } else {
                impares.adicionar(Integer.toString(valor));
            }
        }     
        pares.ordenarCrescente();
        impares.ordenarCrescente();
        impares.inverter(); 
        pares.concatenar(impares);  
        String[] resultado = pares.toArray();
        for (String numero : resultado) {
            System.out.println(numero);
        }
    }

}
