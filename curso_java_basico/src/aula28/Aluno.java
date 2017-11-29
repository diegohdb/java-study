package aula28;

public class Aluno {

	private String nome;
	private String matricula;
	private String curso;
	private String[] disciplinas;
	private double[][] notas;
	private int count;
	private double[] media;

	public Aluno() {
	}

	public Aluno(String nome, String matricula, String curso, String[] disciplinas, double[][] notas) {
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.disciplinas = disciplinas;
		this.disciplinas = new String[3];
		this.notas = notas;
		this.notas = new double[3][3];
		this.count = 0;
		this.media = new double[3];
	}

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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String[] getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(String[] disciplinas) {
		if (disciplinas.length <= 3) {
			this.disciplinas = disciplinas;
		} else {
			System.out.println("Vetor de tamanho inválido.");
		}
	}

	public void setDisciplinas(String disciplinas) {
		if (count < 3) {
			this.disciplinas[count] = disciplinas;
		} else {
			System.out.println("Já foram cadastradas 3 disciplinas.");
		}
	}

	public double[][] getNotas() {
		return notas;
	}

	public void setNotas(double[][] notas) {
		this.notas = notas;
	}

	public void mostrarDisciplinas(String[] disciplinas) {
		System.out.println("Disciplinas Matriculadas:");
		for (String disciplina : disciplinas) {
			System.out.println(disciplina);
		}
	}

	public void mostrarResultado(double[][] notas) {
		calcularMedia(notas);
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota da disciplina " + (i + 1) + ": " + calcularMedia(notas)[i]);
			if (calcularMedia(notas)[i] >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
		}
	}

	private double[] calcularMedia(double[][] notas) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				media[i] += notas[i][j];
			}
		}
		return media;
	}

}
