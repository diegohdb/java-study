package aula36;

import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso();
		Professor professor = new Professor();
		Scanner scan = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno[] alunos = new Aluno[5];
		
		curso.setNome("Curso");
		curso.setHorario("Manha/Tarde");
		curso.setProfessor(professor);
		curso.setAlunos(alunos);
		alunos[0] = aluno1;
		alunos[1] = aluno2;
		alunos[2] = aluno3;
		alunos[3] = aluno4;
		alunos[4] = aluno5;
		
		professor.setNome("Professor");
		professor.setDepartamento("CIn");
		professor.setEmail("email@email.com");

		aluno1.setNome("Aluno1");
		aluno1.setMatricula("11111");
		aluno1.setNotas2(7,7,7,7);
		
		aluno2.setNome("Aluno2");
		aluno2.setMatricula("22222");
		aluno2.setNotas2(10,10,10,9);
		
		aluno3.setNome("Aluno3");
		aluno3.setMatricula("33333");
		aluno3.setNotas2(10,10,3,9);
		
		aluno4.setNome("Aluno4");
		aluno4.setMatricula("44444");
		aluno4.setNotas2(5,1,4,9);
		
		aluno5.setNome("Aluno5");
		aluno5.setMatricula("55555");
		aluno5.setNotas2(5,8,5,9);
		
		System.out.println("Resultado do Curso: "+curso.getNome()+"\n");
	    System.out.println(curso.imprimirResultado(alunos)); 	
		System.out.println("A media da turma foi: "+curso.obterMediaGeral());
	}
}
