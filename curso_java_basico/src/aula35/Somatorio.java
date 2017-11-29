package aula35;

public class Somatorio {

	static int count,soma;
	
	public Somatorio() {
		
	}
	
	static int somar(int n) {
	
		count++;

		if (count > n) {
			System.out.println(n);
			return n + soma;
		}
		
		soma = somar(n) + somar(n-1);
		return soma;  
		
		
	}

}
