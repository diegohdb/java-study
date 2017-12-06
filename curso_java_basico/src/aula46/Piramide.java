package aula46;

public class Piramide extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{

	private double n_arestas,comprimento_arestas, comprimento_apotema,lado,altura;
	
	public Piramide() {}

	public Piramide(String nome, String cor, double n_arestas,double comprimento_arestas, double comprimento_apotema,double lado, double altura) {
		super(nome, cor);
		this.comprimento_apotema = comprimento_apotema;
		this.comprimento_arestas = comprimento_arestas;
		this.n_arestas = n_arestas;
		this.altura = altura;
		this.lado = lado;
	}

	
	
	@Override
	public double calcularVolume() {
		return lado*lado*altura/3;
	}

	@Override
	public double calcularArea() {
		return n_arestas*(comprimento_arestas*comprimento_apotema)/2 + lado*lado;
	}

	@Override
	public String toString() {
		return "Piramide [calcularVolume()=" + calcularVolume() + ", calcularArea()=" + calcularArea() + "]";
	}
	
	
	
}


