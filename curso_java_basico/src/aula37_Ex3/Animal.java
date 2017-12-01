package aula37_Ex3;

public class Animal {

	private String nome;
	private double comprimento;
	private int NUMERO_PATAS = 4;
	private String cor;
	private String ambiente;
	private double velocidade;

	public Animal() {
	}

	public Animal(String nome, double comprimento, String cor, String ambiente, double velocidade) {
		super();
		this.nome = nome;
		this.comprimento = comprimento;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public int getNUMERO_PATAS() {
		return NUMERO_PATAS;
	}

	public void setNUMERO_PATAS(int nUMERO_PATAS) {
		NUMERO_PATAS = nUMERO_PATAS;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	@Override
	public String toString() {
		return "Animal: " + nome + "\nComprimento: " + comprimento + "\nNúmero de patas: " + NUMERO_PATAS + "\ncor= "
				+ cor + "\nAmbiente=" + ambiente + "\nVelocidade=" + velocidade + ".";
	}
}
