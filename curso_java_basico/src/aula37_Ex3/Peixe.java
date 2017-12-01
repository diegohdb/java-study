package aula37_Ex3;

public class Peixe extends Animal {

	private String caracteristica;
	protected final String COR = "Cinza";
	protected final String AMBIENTE = "Mar";

	public Peixe() {
	}

	public Peixe(String nome, double comprimento, int NUMERO_PATAS, double velocidade,
			String caracteristica) {
		super.setNome(nome);
		super.setComprimento(comprimento);
		super.setCor(getCOR());
		super.setAmbiente(getAMBIENTE());
		this.caracteristica = caracteristica;
		super.setNUMERO_PATAS(NUMERO_PATAS);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getCOR() {
		return COR;
	}

	public String getAMBIENTE() {
		return AMBIENTE;
	}

	@Override
	public String toString() {
		return "Animal: " + super.getNome() + "\nComprimento: " + super.getComprimento() + "\nNúmero de patas: "
				+ super.getNUMERO_PATAS() + "\ncor= " + super.getCor() + "\nAmbiente=" + super.getAmbiente()
				+ "\nVelocidade=" + super.getVelocidade() + "\nCaracterística: " + getCaracteristica();
	}
}
