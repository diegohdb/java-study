package aula37_Ex3;

public class TesteAnimal {

	public static void main(String[] args) {
		
		System.out.println("Zoo\n ----------------------");
		
		Animal an1 = new Mamifero("Camelo", 150, 4, "Amarelo", 2, "Mato");
		Animal an2 = new Mamifero("Urso-do-Canadá", 180, 4, "Vermelho", 0.5, "Mel");
		Animal an3 = new Peixe("Tubarão", 300, 0, 1.5, "Barbatanas e cauda");

		System.out.println(an1);
		System.out.println("\n----------------------");
		System.out.println(an2);
		System.out.println("\n----------------------");
		System.out.println(an3);
		System.out.println("\n----------------------");
	}

}
