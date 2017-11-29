package aula28;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33
public class Lampada {

	private int potencia;
	private String modelo;
	private int tensao;
	private boolean estado;

	public Lampada(int potencia, String modelo, int tensao, boolean estado) {
		super();
		this.potencia = potencia;
		this.modelo = modelo;
		this.tensao = tensao;
		this.estado = estado;
	}

	public Lampada() {

	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getTensao() {
		return tensao;
	}

	public void setTensao(int tensao) {
		this.tensao = tensao;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public boolean ligar() {
		return this.estado = true;
	}

	public boolean desligar() {
		return this.estado = false;
	}

}
