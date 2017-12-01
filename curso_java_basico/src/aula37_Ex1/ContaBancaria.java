package aula37_Ex1;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-36-a-43

public class ContaBancaria {

	private String nomeCliente;
	private double numConta;
	private double saldo;

	public ContaBancaria() {
	}

	public ContaBancaria(String nomeCliente, double numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getNumConta() {
		return numConta;
	}

	public void setNumConta(double numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor) {
		if (valor < getSaldo()) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo Insuficiente");
		}
	}

	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public String toString() {
		return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
}
