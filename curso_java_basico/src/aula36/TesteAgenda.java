package aula36;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		Contato[] contatos = new Contato[3];
		
		contatos[0] = contato1; 
		contatos[1] = contato2; 
		contatos[2] = contato3; 
		agenda.setContatos(contatos);
		
		System.out.println("Nome da agenda: ");
		agenda.setNomeAgenda(scan.nextLine());

		System.out.println("Nome do contato 1: ");
		contato1.setNome(scan.nextLine());
		System.out.println("Telefone do contato 1: ");
		contato1.setTelefone(scan.nextLine());
		System.out.println("Email do contato 1: ");
		contato1.setEmail(scan.nextLine());

		System.out.println("Nome do contato 2: ");
		contato2.setNome(scan.nextLine());
		System.out.println("Telefone do contato 2: ");
		contato2.setTelefone(scan.nextLine());
		System.out.println("Email do contato 2: ");
		contato2.setEmail(scan.nextLine());

		System.out.println("Nome do contato 3: ");
		contato3.setNome(scan.nextLine());
		System.out.println("Telefone do contato 3: ");
		contato3.setTelefone(scan.nextLine());
		System.out.println("Email do contato 3: ");
		contato3.setEmail(scan.nextLine());

		System.out.println(agenda.buscarContato(2));
		System.out.println(agenda.exibirContato());
		
	}

}
