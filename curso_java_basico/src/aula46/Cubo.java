package aula46;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private double a;
	
	public Cubo() {}

	public Cubo(String nome, String cor, double a) {
		super(nome, cor);
		this.a = a;
	}

	@Override
	public double calcularVolume() {
		return a*a*a;
	}

	@Override
	public double calcularArea() {
		return 6*a*a;
	}

	@Override
	public String toString() {
		return "Cubo [calcularVolume()=" + calcularVolume() + ", calcularArea()=" + calcularArea() + "]";
	}

	

}
