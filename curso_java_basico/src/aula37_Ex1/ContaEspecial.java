package aula37_Ex1;

public class ContaEspecial extends ContaBancaria {

	private double limite;

	public ContaEspecial() {
	}

	public ContaEspecial(String nomeCliente, double numConta, double saldo, double limite) {
		super(nomeCliente, numConta, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if (valor < limite) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

}
