package aula28;

public class TesteConta {

	public static void main(String[] args) {

		Conta conta = new Conta(123,2000,false,5000);
		
		System.out.println("Saldo: "+conta.getSaldo());
		conta.sacar(100);
		System.out.println("Saldo: "+conta.getSaldo());
		conta.depositar(500);
		System.out.println("Saldo: "+conta.getSaldo());
		if(conta.checarStatus()){
			System.out.println("Cliente especial");
		}else{System.out.println("Cliente não especial");}
	}

}
