package aula28;

import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Scanner scan = new Scanner(System.in);
		String[] disciplinas = new String[3];
		double[][] notas = new double[3][3];
	
		System.out.println("Nome: ");
		aluno.setNome(scan.nextLine());
		System.out.println("Matrícula: ");
		aluno.setMatricula(scan.nextLine());
		System.out.println("Curso: ");
		aluno.setCurso(scan.nextLine());

		for (int i = 0; i < 3; i++) {
			System.out.println("Disciplina " + (i + 1) + " :");
			disciplinas[i] = scan.nextLine();
			for (int j = 0; j < 3; j++) {
				System.out.println("Nota " + (j + 1) + " :");
				notas[i][j] = scan.nextDouble();	
				scan.nextLine();
			}
		}

		
		aluno.mostrarDisciplinas(disciplinas);
		aluno.mostrarResultado(notas);
	}

}
