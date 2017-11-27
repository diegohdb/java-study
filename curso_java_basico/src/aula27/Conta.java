package aula27;

public class Conta {

	String numero;
	double saldo;
	boolean especial;
	double limite;

	String realizarSaque(double valor) {
		String output;

		if (valor > saldo) {
			output = "Saldo insuficiente!";
		} else {
			saldo -= valor;
			output = "Saque realizado com sucesso.";
		}
		return output;
	}

	void depositarDinheiro(double valor) {
		saldo += valor;
	}
	
	double consultarSaldo(){
		return saldo;
	}
	
	boolean consultarEspecial(){
		return especial;
	}
}
