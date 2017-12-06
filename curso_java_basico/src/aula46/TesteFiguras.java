package aula46;

public class TesteFiguras {

	public static void main(String[] args) {
		Circulo circulo = new Circulo("Circulo", "Azul", 2);
		Quadrado quadrado = new Quadrado("Quadrado", "Azul", 2);
		Triangulo triangulo = new Triangulo("Triangulo", "Azul", 2,2);
		Cilindro cilindro = new Cilindro("Cilindro", "Azul", 2, 2);
		Cubo cubo = new Cubo("Cubo", "Azul", 2);
		Piramide piramide = new Piramide("Circulo", "Azul", 2, 2, 2, 2,2);
		
		Object[] figuras = new Object[6];
		
		figuras[0] = circulo;
		figuras[1] = quadrado;
		figuras[2] = triangulo;
		figuras[3] = cilindro;
		figuras[4] = cubo;
		figuras[5] = piramide;
		
		for(int i = 0; i < figuras.length; i++ ){
			System.out.println(figuras[i].toString());
		}
				
		
	}

}
