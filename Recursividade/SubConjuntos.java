package Recursividade;


public class SubConjuntos{
	public static void main (String[]agrs){ 
		subsets("","abc");
		
	}

	private static void subsets(String s, String r) {
		if (r.equals(""))
			System.out.println(s);
		else{
			subsets(s+r.charAt(0),r.substring(1));
			subsets(s,r.substring(1));	
		}
	}
}