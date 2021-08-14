package aula12;

public class FabricaDePessoa {

	public static void main(String[] args) {
		Rica rica = new Rica("João", 19, 999999);
		Pobre pobre = new Pobre("Jão", 35);
		Miseravel miseravel = new Miseravel("JL", 40);
		
		rica.fazCompas();
		pobre.trbalhar();
		miseravel.mendigar();
		
	}

}
