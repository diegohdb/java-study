package aula37_Ex2;


//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
public abstract class ImpostoDeRenda {

	private String nome;

	public ImpostoDeRenda() {
	}

	public ImpostoDeRenda(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularImposto(double renda);

	@Override
	public String toString() {
		return "ImpostoDeRenda [nome=" + nome + "]";
	}
	
	
}
