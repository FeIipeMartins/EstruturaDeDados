package Recursividade;

public class TorreDeHanoi{
	
	private static int contador;

	public static void main(String []agrs) {
		int discos= 3;
		hanoi(discos,"A","B","C");
		System.out.println(contador);
	}

	private static void hanoi(int discos, String origem, String auxiliar, String destino) {
		if(discos > 0) {
			hanoi(discos -1,origem,destino,auxiliar);  // Origem para o auxiliar(n-1 discos)
			System.out.println("Mover do " + origem + " para o " + destino); // movimento da origem para o destino
			contador ++;
			hanoi(discos-1,auxiliar,origem,destino ); // Auxiliar para o destino
		}
	}
}