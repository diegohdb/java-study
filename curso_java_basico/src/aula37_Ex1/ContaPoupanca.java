package aula37_Ex1;

public class ContaPoupanca extends ContaBancaria{

	private double diaRendimento;
	
	
	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nomeCliente, double numConta, double saldo, double diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void calcularNovoSaldo(double taxa){
		setSaldo(getSaldo()*(1+(taxa/100)));
	}
}
