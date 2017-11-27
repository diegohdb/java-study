package aula27;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		aluno.nome = scan.nextLine();
		System.out.println("Curso: ");
		aluno.curso = scan.nextLine();
		System.out.println("Matricula: ");
		aluno.matricula = scan.nextLine();

		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Disciplina " + (i + 1) + " : ");
			aluno.disciplinas[i] = scan.nextLine();
			System.out.println("Nota da disciplina " + aluno.disciplinas[i] + ": ");
			aluno.notas[i] = scan.nextInt();
			scan.nextLine();
		}

		aluno.verificarResultado(aluno.notas);

	}

}
