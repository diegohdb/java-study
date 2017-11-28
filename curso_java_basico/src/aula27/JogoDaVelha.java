package aula27;

import java.util.Scanner;

public class JogoDaVelha {

	char[][] tabuleiro = new char[3][3];
	boolean ganha = false;
	Scanner scan = new Scanner(System.in);
	int jogada = 0;

	void jogar() {
		int start = 1;

		while (start != 0) {
			System.out.println("Pressione 0 para iniciar...");
			start = scan.nextInt();
		}
		System.out.println("Jogador 1: 'X'\nJogador 2: 'O'");
		atualizarTabuleiroFake(tabuleiro);
		controlarJogadas();

	}

	void atualizarTabuleiroFake(char[][] tabuleiro) {
		System.out.println("\n");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print("| # |");
			}
			System.out.println();
		}
	}

	void atualizarTabuleiro(char[][] tabuleiro) {
		System.out.println("\n");
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == 'X' || tabuleiro[i][j] == 'O') {
					System.out.print("| " + tabuleiro[i][j] + " |");
				} else {
					System.out.print("| # |");
				}
			}
			System.out.println();
		}
	}

	void controlarJogadas() {
		if (jogada % 2 == 0) {
			jogarJ1();
		} else {
			jogarJ2();
		}
	}

	void jogarJ1() {
		int linha, coluna;
		System.out.println("Jogador 1, escolha linha e coluna (1-3) para a jogada: ");
		linha = scan.nextInt();
		coluna = scan.nextInt();

		verificarPosicao(linha, coluna);
	}

	void jogarJ2() {
		int linha, coluna;
		System.out.println("Jogador 2, escolha linha e coluna (1-3) para a jogada: ");
		linha = scan.nextInt();
		coluna = scan.nextInt();

		verificarPosicao(linha, coluna);
	}

	void verificarPosicao(int linha, int coluna) {
		if (tabuleiro[linha - 1][coluna - 1] == 'X' || tabuleiro[linha - 1][coluna - 1] == 'O') {
			System.out.println("Posição já ocupada!");
			controlarJogadas();
		} else {
			if (jogada % 2 == 0) {
				tabuleiro[linha - 1][coluna - 1] = 'X';
				atualizarTabuleiro(tabuleiro);
				checarResultado();
			} else {
				tabuleiro[linha - 1][coluna - 1] = 'O';
				atualizarTabuleiro(tabuleiro);
				checarResultado();
			}
		}
	}

	void checarResultado() {
		for (int i = 0; i < tabuleiro.length; i++) { // iguais na mesma linha
														// horizontal,
														// diferentes do simbolo
														// fake
			if ((tabuleiro[i][0] == tabuleiro[i][1]) && (tabuleiro[i][0] == 'X') || tabuleiro[i][0] == 'O') {
				if (tabuleiro[i][0] == tabuleiro[i][2]) {
					ganha = true;
					System.out.println("For 1");
				}
			}
		}
		for (int i = 0; i < tabuleiro.length; i++) { // iguais na mesma linha
														// vertical, diferentes
														// do simbolo fake
			if ((tabuleiro[0][i] == tabuleiro[1][i]) && (tabuleiro[0][i] == 'X' || tabuleiro[0][i] == 'O')) {
				if (tabuleiro[0][i] == tabuleiro[2][i]) {
					ganha = true;
					System.out.println("For 2");

				}
			}
		}

		if ((tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[0][0] == 'X' || tabuleiro[0][0] == 'O')) {// diagonal
			if (tabuleiro[0][0] == tabuleiro[2][2]) {
				ganha = true;
				System.out.println("For 3");

			}
		}

		if ((tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[0][2] == 'X' || tabuleiro[0][2] == 'O')) {// diagonal
			if (tabuleiro[0][2] == tabuleiro[2][0]) {
				ganha = true;
				System.out.println("For 4");

			}
		}
		
		if(ganha && jogada % 2==0){
			System.out.println("Jogador 1 ganhou!");
		}else if(ganha && jogada % 2!=0 ){
			System.out.println("Jogador 2 ganhou!");
		}else if(jogada==8){
			System.out.println("Ninguém ganhou!");
		}else{
			jogada++;
			controlarJogadas();
		}

	}

}
