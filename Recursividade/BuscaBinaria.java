package Recursividade;

import java.util.Arrays;

public class BuscaBinaria{
	public static void main (String[]agrs){ 
		int array []= {3,5,6,7,10,12,1,2};
		Arrays.sort(array);
		int elemento = 3;
		int resultado = buscaBinaria(array,elemento);
		if(resultado<0) {
			System.err.println("Elemento Nao encontrado");
		}
		else {
			System.out.println("Elemento encontrado no indicie " + resultado);
		}
	}
	
	public static int buscaBinaria (int[]array,int elemento) {
		return busca(array, elemento ,0,array.length -1);
	}
	
	public static int busca(int[]array, int elemento, int menor,int maior) {
		int media = (menor + maior)/2;
		if(menor>maior) {
			return -1;
		}
		if(array[media] == elemento) {
			return media;
		}
		if(array[media]< elemento) {
			return busca(array,elemento,media +1,maior);
		}
		else {
			return busca(array,elemento,menor,media-1);
		}
	}
}