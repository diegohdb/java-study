package aula46;

public class Cilindro extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica {

	private double r,h;
	
	public Cilindro() {}

	public Cilindro(String nome, String cor, double r, double h) {
		super(nome, cor);
		this.h = h;
		this.r = r;
	}

	@Override
	public double calcularVolume() {
		return Math.PI*r*r*h;
	}

	@Override
	public double calcularArea() {
		return 2*Math.PI*r*(h+r);
	}

	@Override
	public String toString() {
		return "Cilindro [calcularVolume()=" + calcularVolume() + ", calcularArea()=" + calcularArea() + "]";
	}

}
