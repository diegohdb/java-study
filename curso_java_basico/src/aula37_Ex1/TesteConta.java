package aula37_Ex1;

public class TesteConta {

	public static void main(String[] args) {

		ContaPoupanca conta1 = new ContaPoupanca("Fabio", 12345, 10000, 3);
		ContaBancaria conta2 = new ContaEspecial("Mano", 12344, 100000, 150000);
		
		System.out.println(conta1);
		conta1.sacar(100000);
		System.out.println(conta1);
		conta1.sacar(1000);
		System.out.println(conta1);
		conta2.sacar(1000);
		System.out.println(conta2);
		conta2.sacar(120000);
		System.out.println(conta2);
		
		conta1.depositar(11000);
		System.out.println(conta1);
		conta2.depositar(21000);
		System.out.println(conta2);

		conta1.calcularNovoSaldo(10);
		System.out.println(conta1);
		
		
	}

}
