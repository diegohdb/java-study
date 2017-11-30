package aula36;

public class Agenda {

	private Contato[] contatos;
	private String nomeAgenda;

	public Agenda(Contato[] contatos, String nomeAgenda) {
		super();
		this.contatos = contatos;
		this.nomeAgenda = nomeAgenda;
	}

	public Agenda() {
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public String buscarContato(int numero) {
		String output = "";
		if (contatos[numero-1] != null) {
			output = "Nome: " + contatos[numero-1].getNome() + "\nTelefone: " + contatos[numero-1].getTelefone()
					+ "\nEmail: " + contatos[numero-1].getEmail();
		}
		return output;
	}

	public String exibirContato() {
		String output = "";
		if (contatos != null) {
			for (int i = 0; i < contatos.length; i++) {
				if (contatos[i] != null) {
					output += "Nome: " + contatos[i].getNome() + "\nTelefone: " + contatos[i].getTelefone()
							+ "\nEmail: " + contatos[i].getEmail()+"\n";

				}
			}
		}
		return output;
	}

}
