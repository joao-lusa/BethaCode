package aula12;

public class FabricaDePessoa {

	public static void main(String[] args) {
		Rica rica = new Rica("Jo�o", 19, 999999);
		Pobre pobre = new Pobre("J�o", 35);
		Miseravel miseravel = new Miseravel("JL", 40);
		
		rica.fazCompas();
		pobre.trbalhar();
		miseravel.mendigar();
		
	}

}
