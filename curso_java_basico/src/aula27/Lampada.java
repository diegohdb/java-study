package aula27;

public class Lampada {

	double potencia;
	String marca;
	double tensao;
	boolean estado;
	
	boolean ligarLampada(){
		estado = true;
		return estado;	
	}
	
	boolean desligarLampada(){
		estado = false;
		return estado;	
	}
	
	boolean verificarLampada(){
		return estado;
	}
}
