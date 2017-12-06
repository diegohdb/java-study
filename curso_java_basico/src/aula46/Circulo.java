package aula46;

public class Circulo extends Figura2D implements DimensaoSuperficial {

	private double raio;

	public Circulo() {
	}

	public Circulo(String nome, String cor, double raio) {
		super(nome, cor);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {	
		return 2*Math.PI*raio*raio;
	}

	@Override
	public String toString() {
		return "Circulo [getRaio()=" + getRaio() + ", calcularArea()=" + calcularArea() + "]";
	}

	
}
