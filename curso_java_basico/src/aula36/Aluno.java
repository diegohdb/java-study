package aula36;

public class Aluno {

	private String nome;
	private String matricula;
	private double[] notas;
	
	
	public Aluno(String nome, String matricula, double[] notas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.notas = notas;
	}


	public Aluno() {}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public void setNotas2(double nota1,double nota2,double nota3,double nota4) {
		notas = new double[4];
		this.notas[0] = nota1;
		this.notas[1] = nota2;
		this.notas[2] = nota3;
		this.notas[3] = nota4;
	}	
}
