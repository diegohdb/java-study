package aula27;

public class Aluno {

	String nome;
	String matricula;
	String curso;
	String[] disciplinas = new String[3];
	int[] notas = new int[3];

	void verificarResultado(int[] notas){
		String[] resultado = new String[3];
		
		for(int i = 0; i < notas.length; i++){
			if(notas[i] >=7){
				resultado[i] = "aprovado";
			}else{
				resultado[i] = "reprovado";
			}
		}
		System.out.println("O aluno "+nome+" de matrícula "+matricula+" obteve o seguinte resultado\n");
		for(int i = 0; i<disciplinas.length; i++){
			System.out.println("Disciplina "+disciplinas[i]+" nota "+notas[i]+" resultado "+resultado[i]);
		}
	}
	
}
