package Recursividade;

//Teste 1 13195l -> 29
//Teste 2 31758431803l -> 62149573


public class MaiorFatorPrimo{
	public static void main(String[]agrs) {
		long r = maior_fator_primo(13195l);
		System.out.println(r);
	}

	private static long maior_fator_primo(long a) {
		long r = a;
		for(long i = 2; i < Math.sqrt(a) ;i++) 
			if(a% i == 0) {
				return  maior_fator_primo(a/i);
			}
			return r;		
	}
}