package aula37_Ex2;

public class TesteImposto {

	public static void main(String[] args) {

		PessoaJuridica pj1 = new PessoaJuridica("Fabiola S/A", 50000);
		PessoaJuridica pj2 = new PessoaJuridica("Manoba S/A", 10000);

		PessoaFisica pf1 = new PessoaFisica("Manoba", 50000);
		PessoaFisica pf2 = new PessoaFisica("Chico", 3600);
		PessoaFisica pf3 = new PessoaFisica("Ze", 2800);
		PessoaFisica pf4 = new PessoaFisica("Mané", 2100);
		PessoaFisica pf5 = new PessoaFisica("Diego", 1400);
		
		System.out.println(pj1);
		System.out.println(pj2);

		System.out.println(pf1);
		System.out.println(pf2);
		System.out.println(pf3);
		System.out.println(pf4);
		System.out.println(pf5);
		
		
		
	}

}
