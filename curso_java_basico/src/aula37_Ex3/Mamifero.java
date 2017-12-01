package aula37_Ex3;

public class Mamifero extends Animal {

	private String alimento;
	public final String AMBIENTE = "Terra";
	
	public Mamifero() {
	}

	public Mamifero(String nome, double comprimento, int NUMERO_PATAS, String cor, double velocidade, String alimento) {
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(cor);
		super.setVelocidade(velocidade);
		super.setAmbiente(getAMBIENTE());
		super.setNUMERO_PATAS(NUMERO_PATAS);
		this.alimento = alimento;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	

	public String getAMBIENTE() {
		return AMBIENTE;
	}

	@Override
	public String toString() {
		return "Animal: " + super.getNome() + "\nComprimento: " + super.getComprimento() + "\nNúmero de patas: "
				+ super.getNUMERO_PATAS() + "\ncor= " + super.getCor() + "\nAmbiente=" + super.getAmbiente()
				+ "\nVelocidade=" + super.getVelocidade() + "\nAlimento: " + getAlimento();
	}

}
