package Recursividade;


public class DecimalPraBinario{
	public static void main (String[]agrs){ 
		decimalParaBinario(14);
	}

	private static void decimalParaBinario(int n) {
		if(n>0) {
			decimalParaBinario(n/2);
			System.out.print(n%2);
		}
		
	}
}