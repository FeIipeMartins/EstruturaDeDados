package Recursividade;

public class NumerosNaturaisMutiplos3ou5 {
    public static void main(String[] args) {
        int resultado = somaMultiplos(1, 1000);
        System.out.println(resultado);
    }

    public static int somaMultiplos(int inicio, int limite) {
        if (inicio >= limite) {
            return 0;
        }
        
        if (inicio % 3 == 0 || inicio % 5 == 0) {
            return inicio + somaMultiplos(inicio + 1, limite);
        } else {
            return somaMultiplos(inicio + 1, limite);
        }
    }
}
