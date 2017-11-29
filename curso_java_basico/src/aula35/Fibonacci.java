package aula35;

public class Fibonacci {


	static int fibonacci;

	public Fibonacci() {

	}

	static int iniciarSequencia(int n) {
		if (n < 2) {
			return 1;
		}
	
		return  iniciarSequencia(n-1) +  iniciarSequencia(n-2);
		
	}

}
