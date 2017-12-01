package aula37_Ex2;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43
public class PessoaFisica extends ImpostoDeRenda {

	private double renda;

	public PessoaFisica() {
	}

	public PessoaFisica(String nome, double renda) {
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
		double imp;
		if(renda > 0 && renda <= 1400){
			imp = 0;
		}else if(renda > 1400 && renda <= 2100){
			imp = 100;
		}else if(renda > 2100 && renda <= 2800){
			imp = 270;
		}else if(renda > 2800 && renda <= 3600){
			imp = 500;
		}else{
			imp = 700;
		}
		return imp;
	}

	public String toString() {
		return "Imposto De Renda Pessoa Física \nNome: " + super.getNome()+ " Renda: "+getRenda()+" Imposto: "+calcularImposto(renda);
	}

}
