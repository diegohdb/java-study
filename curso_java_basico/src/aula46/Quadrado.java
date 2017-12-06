package aula46;

public class Quadrado extends Figura2D implements DimensaoSuperficial{

	double lado;
	
	public Quadrado() {}

	public Quadrado(String nome, String cor, double lado) {
		super(nome, cor);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado*lado;
	}

	@Override
	public String toString() {
		return "Quadrado [calcularArea()=" + calcularArea() + "]";
	}

	
}
