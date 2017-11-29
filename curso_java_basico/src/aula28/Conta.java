package aula28;

//https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-28-a-33

public class Conta {

	private int numero;
	private double saldo;
	private boolean status;
	private double limite;

	public Conta() {
	}

	public Conta(int numero, double saldo, boolean status, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.status = status;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void sacar(double valor) {
		if (valor < getSaldo()) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Depositado");
	}

	public double saldo() {
		return getSaldo();
	}

	public boolean checarStatus() {
		return isStatus();
	}
}