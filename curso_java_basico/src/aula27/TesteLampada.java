package aula27;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.marca = "Philips";
		lampada.potencia = 1500;
		lampada.tensao = 220;
		lampada.ligarLampada();
		System.out.println("Lampada está ligada? "+lampada.verificarLampada());
		lampada.desligarLampada();
		System.out.println("Lampada está ligada? "+lampada.verificarLampada());
	}

}
