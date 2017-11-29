package aula28;

public class TesteLampada {

	public static void main(String[] args) {

		Lampada lamp = new Lampada(1000,"Light",220,false);
		
		System.out.println("A lâmpada está ligada? "+lamp.getEstado());
		System.out.println(lamp.getPotencia()+", "+lamp.getModelo()+", "+lamp.getTensao());
		lamp.setEstado(true);
		System.out.println("A lâmpada está ligada? "+lamp.getEstado());

	}

}
