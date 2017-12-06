package aula46;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial,DimensaoVolumetrica {

	public Figura3D() {}

	public Figura3D(String nome, String cor) {
		super(nome, cor);
	}

}
