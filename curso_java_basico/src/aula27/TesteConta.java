package aula27;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		
		conta.numero = "12345";
		conta.limite = 100000;
		conta.saldo = 50000;
		conta.especial = true;
			
		System.out.println(conta.consultarSaldo());
		conta.depositarDinheiro(1000);
		System.out.println(conta.consultarSaldo());
		System.out.println(conta.realizarSaque(80000));
		conta.depositarDinheiro(1000000);
		System.out.println(conta.consultarSaldo());
		System.out.println(conta.realizarSaque(80000));
		System.out.println(conta.consultarSaldo());
	}

}
