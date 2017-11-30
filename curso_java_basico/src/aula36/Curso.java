package aula36;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-36
public class Curso {

	private Professor professor;
	private Aluno[] alunos;
	private String nome;
	private String horario;

	public Curso() {
	}

	public Curso(Professor professor, Aluno[] alunos, String nome, String horario) {
		super();
		this.professor = professor;
		this.alunos = alunos;
		this.nome = nome;
		this.horario = horario;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Aluno[] getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	private double obterMedia(double[] notas) {
		double media = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
		}
		media = media / notas.length;
		return media;
	}

	private String obterResultado(double media) {
		String resultado;
		if (media >= 7) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
		}
		return resultado;
	}

	public String imprimirResultado(Aluno[] alunos) {
		String output = "";
		if (alunos != null) {
			for (int i = 0; i < alunos.length; i++) {
				if (alunos[i].getNotas() != null) {
					output += "Aluno " + alunos[i].getNome() + " Media: " + obterMedia(alunos[i].getNotas())
							+ " Resultado: " + obterResultado(obterMedia(alunos[i].getNotas())) + "\n\n";
				}
			}
		}
		return output;
	}

	public double obterMediaGeral() {
		double media = 0;
		if (alunos != null) {
			for (int i = 0; i < alunos.length; i++) {
				if (alunos[i].getNotas() != null) {
					media += obterMedia(alunos[i].getNotas());
				}
			}
		}

		return media/alunos.length;
	}

}
