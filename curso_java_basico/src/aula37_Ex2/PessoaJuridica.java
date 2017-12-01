package aula37_Ex2;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43

public class PessoaJuridica extends ImpostoDeRenda {

	private double renda;

	public PessoaJuridica() {
	}

	public PessoaJuridica(String nome, double renda) {
		super(nome);
		this.renda = renda;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	@Override
	public double calcularImposto(double renda) {
		return renda * 0.1;
	}
	
	public String toString() {
		return "Imposto De Renda Pessoa Jurídica \nNome: " + super.getNome()+ " Renda: "+getRenda()+" Imposto: "+calcularImposto(renda);
	}

}
