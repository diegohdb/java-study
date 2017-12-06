package aula46;

public class Triangulo extends Figura2D implements DimensaoSuperficial {

	private double b, h;

	public Triangulo() {}

	public Triangulo(String nome, String cor, double b, double h) {
		super(nome, cor);
		this.b = b;
		this.h = h;
	}

	@Override
	public double calcularArea() {
		return b * h / 2;
	}

	@Override
	public String toString() {
		return "Triangulo [calcularArea()=" + calcularArea() + "]";
	}

	
}
