package aula27;

public class TesteJogo {

	public static void main(String[] args) {

		JogoDaVelha jogo = new JogoDaVelha();
		
		char[][] tabuleiros = new char[3][3];
		
		jogo.jogar();
	}

}
